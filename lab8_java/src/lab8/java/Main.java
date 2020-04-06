package lab8.java;

import lab8.java.controllers.ArtistController;
import lab8.java.singleton.Database;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        ArtistController artistController= new ArtistController();
        artistController.create("Jhon", "Romania");
    }
}
