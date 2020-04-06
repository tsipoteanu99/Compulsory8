package lab8.java.controllers;

import lab8.java.singleton.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArtistController {

    public void create(String name, String country) throws SQLException {
        Database db=new Database();
        db.dbConnect();
        Statement stmt=db.con.createStatement();

    //step4 execute query
    ResultSet rs=stmt.executeQuery("insert into artists values(id.nextval,"+name+","+country+")");
            while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

                    //step5 close the connection object
                   db.con.close();
    }
}
