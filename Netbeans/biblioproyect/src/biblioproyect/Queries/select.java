/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioproyect.Queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s404
 */
public class select {

    public static void getCantAlumnos(Connection con, JLabel label, String Tabla) throws SQLException {
        try {
            String sql = "SELECT * FROM " + Tabla;
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                label.setText(result.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        con.close();

    }

}
