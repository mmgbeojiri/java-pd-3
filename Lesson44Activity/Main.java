import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    String result="";
    String sql = "";
     
		Database db = new Database("jdbc:sqlite:chinook.db" );	

    //1
    //For the first 30 tracks, get the name of the track and the album name that it belongs to.
    String sql1 = "SELECT tracks.Name, albums.title FROM tracks INNER JOIN albums ON albums.AlbumId = tracks.AlbumId LIMIT 30";

    
    //2
    //For each Invoice from April 2012, retrieve customer first and last name, invoice id, and Invoice date
    String sql2 = "SELECT customers.FirstName, customers.LastName, invoices.invoiceid, invoices.invoicedate FROM customers INNER JOIN invoices ON invoices.customerid = customers.customerid WHERE Invoices.invoicedate LIKE '2012-04%';";

    
    //3
    //For the first 20 invoices get the customer id, invoice id, track name, unit price and quantity .(Hint: information is in three tables) 
    String sql3 = "SELECT customers.customerid, invoice_items.invoiceid, tracks.name, invoice_items.unitprice,invoice_items.quantity FROM tracks INNER JOIN invoice_items ON tracks.trackid = invoice_items.trackid INNER JOIN invoices ON invoices.invoiceid = invoice_items.invoiceid INNER JOIN customers ON customers.customerid = invoices.customerid LIMIT 20";

    //4
    //What is the list of customers' names whose merchandise is being shipped either to the USA, Germany or Poland? (Hint: use billingcountry and remove duplicates)
    String sql4 = "SELECT DISTINCT Customers.firstname, customers.lastname FROM customers INNER JOIN invoices ON invoices.customerid = customers.customerid WHERE invoices.billingcountry IN ('USA','Germany','Poland')";

    
    //5 List the first 20 song (track) names that are “Latin” music?
    String sql5 = "SELECT tracks.name FROM tracks INNER JOIN genres ON genres.genreid = tracks.genreid WHERE genres.name = 'Latin' LIMIT 20";
    
    //6 List all the  “Jazz” album titles. (REMOVE DUPLICATES)
    String sql6 = "SELECT DISTINCT title FROM albums INNER JOIN tracks ON tracks.albumid = albums.albumid INNER JOIN genres ON genres.genreid = tracks.genreid WHERE genres.name = 'Jazz'";


    
    //7
    //List all the Pop Artist names.
    String sql7 = "SELECT DISTINCT artists.name FROM artists INNER JOIN albums ON albums.artistid = artists.artistid INNER JOIN tracks ON albums.albumid = tracks.albumid INNER JOIN genres ON genres.genreid = tracks.genreid WHERE genres.name = 'Pop' ";


    print(db.runSQL(sql1, "table-auto"));
      print(db.runSQL(sql2, "table-auto"));
      print(db.runSQL(sql3, "table-auto"));
      print(db.runSQL(sql4,"table-auto"));
      print(db.runSQL(sql5,"table-auto"));
      print(db.runSQL(sql6,"table-auto"));

      print(db.runSQL(sql7,"table-auto"));
  }    
}