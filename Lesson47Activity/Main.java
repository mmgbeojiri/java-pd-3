import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;

import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException{
   

    // create a port - our Gateway
    int port = 8500;
      
    //create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    // create the database object
    Database db = new Database("jdbc:sqlite:chinook.db");

    server.createContext("/", new RouteHandler("You are connected, but route not given or incorrect..."));
    server.createContext("/customers", new RouteHandler(db, "SELECT * FROM customers"));
    server.createContext("/employees", new RouteHandler(db, "SELECT * FROM employees"));
    server.createContext("/albumsinfo", new RouteHandler(db, "Select tracks.Name, artists.Name FROM artists INNER JOIN albums ON albums.ArtistId = artists.ArtistId INNER JOIN tracks ON tracks.AlbumId = albums.AlbumId INNER JOIN tracks ON tracks.AlbumId = albums.AlbumId LIMIT 10"));
    server.createContext("/customersongs", new RouteHandler(db, "SELECT customers.FirstName, customers.LastName, tracks.Name, invoices.InvoiceDate FROM customers INNER JOIN invoices ON invoices.customerId = Customers.customerId INNER JOIN invoice_items ON invoice_items.invoiceId = invoices.invoiceId INNER JOIN tracks ON tracks.trackId = invoice_items.trackId LIMIT 10"));
    

   // Add your  code here
  

    //Start the server
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


