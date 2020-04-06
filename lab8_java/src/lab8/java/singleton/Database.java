package lab8.java.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public Connection con;
        public Connection dbConnect(){
            try{
                //step1 load the driver class
                Class.forName("oracle.jdbc.driver.OracleDriver");

                //step2 create  the connection object
               con= DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:xe","tiberiu","sql");
                System.out.println("connected.");



            }catch(Exception e){ System.out.println(e);}
          return con;
        }
}


//    //step3 create the statement object
//    Statement stmt=con.createStatement();
//
//    //step4 execute query
//    ResultSet rs=stmt.executeQuery("select * from studenti");
//            while(rs.next())
//                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//
//                    //step5 close the connection object
//                    con.close();