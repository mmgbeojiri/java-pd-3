import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpContext;
//import com.sun.corba.se.impl.ior.IORImpl;
import com.sun.net.httpserver.Headers;
import java.util.HashMap;
import java.util.Map;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URI;
import java.sql.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public  class PostHandler implements HttpHandler {
        Database discord = new Database("jdbc:sqlite:twitter.db");
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("POST".equals(exchange.getRequestMethod())) {
                // Read input stream
                InputStream is = exchange.getRequestBody();
                String body = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                System.out.println("Received: " + body);
                // {"Name":"Michael","Message":"First POST request on the server.","Timestamp":"3/27/2026, 2:48:46 PM"} 
                // we need thisinto "('Michael','First POST request on the server.','3/27/2026, 2:48:46 PM')"
                String name = body.json().Name;
                String message = body.json().Message;
                String timestamp = body.json().Timestamp;

                System.out.println(name + " " + message + " " + timestamp);

                // Send response
                String response = "Data Received";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            } else {
                exchange.sendResponseHeaders(405, -1); // Method Not Allowed
            }
        }
    }