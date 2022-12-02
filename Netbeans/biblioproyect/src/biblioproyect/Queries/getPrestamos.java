/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioproyect.Queries;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author s404
 */
public class getPrestamos {

    public static void getPrestamos(Connection con, DefaultTableModel model) throws SQLException {
        try {
            String sql = "SELECT * FROM Prestamos";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            while (result.next()) {
                model.addRow(new Object[]{result.getString(1), result.getString(2),
                    result.getString(3), result.getString(4), result.getString(5)});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        con.close();
    }
}
