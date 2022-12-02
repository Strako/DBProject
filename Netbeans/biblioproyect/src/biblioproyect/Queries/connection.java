/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioproyect.Queries;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author s404
 */
public class connection {

    public static Connection getCon() throws IOException {
        Connection conn = null;
      /**  try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/biblio?"
                    + "user=" + currentUser.read().get(0) + "&password="
                    + currentUser.read().get(1));

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
     **/   
        return conn;
    }

}
