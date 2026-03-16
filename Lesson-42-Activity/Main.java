
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
   

    String queryResult="";
    String sql ="";

		Database db = new Database("jdbc:sqlite:students.db" );

    String sql1 = "UPDATE CR101 SET Room = 122 WHERE Period = 3 AND StudentID = 'STUDENT1001'";
    String sql2 = "DELETE FROM CR101 WHERE StudentID = 'STUDENT1200' AND Course = 'ZQCTEDA'";
    String sql3 = "UPDATE CR101 SET Room = 213 WHERE Teacher1 = 'DOYLE' AND Period IN (4,5)";
    String sql4 = "UPDATE CR101 SET Teacher1 = 'Mr ROFFLER' WHERE Teacher1 = 'MR ARCHETTI' AND Course = 'MQF44QGF'";
    String sql5 = "UPDATE CR101 SET Grade = 11, OffClass = 'Junior' WHERE StudentID = 'STUDENT999'";
    String sql6 = "INSERT INTO CR101 ('Course', 'Section', 'Teacher1', 'Period, 'Room', 'StudentID') VALUES ('MKUFTC6',1,'CASTRO R',9,322,'student1231')";

    db.runSQL(sql1, "table-auto");	
    db.runSQL(sql2, "table-auto");	
    db.runSQL(sql3, "table-auto");	
    db.runSQL(sql4, "table-auto");
    db.runSQL(sql5, "table-auto");	
    db.runSQL(sql6, "table-auto");
    
   
     
      }    
}