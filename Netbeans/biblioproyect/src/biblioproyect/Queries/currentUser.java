/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioproyect.Queries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author s404
 */
public class currentUser {

    public static Connection getCon(String user, String pass) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/biblio?" + "user=" + user + "&password=" + pass);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;
    }

    public static void write(String user, String pass) throws IOException {
        List<String> cache = Arrays.asList(user, pass);
        try {
            Files.write(Paths.get("currentUser.cache"), cache);
        } catch (Exception e) {
            System.out.println(e);
        }
        read();
    }
    
    public static List<String> read () throws IOException{
        List<String> cache = Arrays.asList();
        cache = Files.readAllLines(Paths.get("currentUser.cache"));
        return cache;
    }
}
