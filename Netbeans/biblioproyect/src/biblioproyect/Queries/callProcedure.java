/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioproyect.Queries;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;

/**
 *
 * @author s404
 */
public class callProcedure {

    public static void call(Connection con, JLabel label, String procedimiento) throws SQLException {
        try {
            String callStm = "{CALL " + procedimiento + "(?)}";
            CallableStatement statement = con.prepareCall(callStm);
            statement.registerOutParameter("cantPrestamos", java.sql.Types.INTEGER);
            statement.execute();
            label.setText(String.valueOf(statement.getInt("cantPrestamos")));
        } catch (Exception e) {
            System.out.println(e);
        }
        con.close();
    }

}
