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
    String sql = 
    "SELECT albums.Title, artists.name FROM albums INNER JOIN artists ON artists.ArtistId = albums.ArtistId LIMIT 20";
     
		Database db = new Database("jdbc:sqlite:chinook.db" );	
    String queryResult = db.runSQL(sql, "table-auto");

    print(queryResult);

    String sql2 = "SELECT tracks.Name FROM tracks INNER JOIN genres ON genres.GenreId = tracks.GenreId WHERE genres.Name IN ('Blues', 'Classical', 'Pop', 'Latin') LIMIT 20";
    queryResult = db.runSQL(sql2, "table-auto");
     print(queryResult);

    String sql3 = "SELECT tracks.Name FROM Tracks INNER JOIN playlist_track ON tracks.TrackId = playlist_track.TrackId INNER JOIN playlists ON playlists.PlaylistId = playlist_track.PlaylistId WHERE playlists.Name = 'Grunge' LIMIT 20";
    queryResult = db.runSQL(sql3, "table-auto");

      print(queryResult);
    print("Done!");
    

      
  }    
}