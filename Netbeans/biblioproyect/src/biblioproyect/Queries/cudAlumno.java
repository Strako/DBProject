package biblioproyect.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author s404
 */
public class cudAlumno {

    public static void insertAlumno(Connection con, String Nombre, String Direccion, String Numero_Telefono, String Fecha_Insc) throws SQLException {
        String querie = "INSERT INTO Alumnos (Nombre, Direccion, Num_Tel, Fecha_Insc) VALUES (?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(querie);

        statement.setString(1, Nombre);
        statement.setString(2, Direccion);
        statement.setString(3, Numero_Telefono);
        statement.setString(4, Fecha_Insc);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se inserto un alumno");
        }

    }

    public static void updateAlumno(Connection con, String Nombre, String Direccion, String Numero_Telefono, String Fecha_Insc, String ID) throws SQLException {
        String querie = "UPDATE Alumnos SET Nombre=?, Direccion=?, Num_Tel=?, Fecha_Insc=? WHERE Num_Control=?";
        PreparedStatement statement = con.prepareStatement(querie);

        statement.setString(1, Nombre);
        statement.setString(2, Direccion);
        statement.setString(3, Numero_Telefono);
        statement.setString(4, Fecha_Insc);
        statement.setInt(5, Integer.valueOf(ID));
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se actualizo un alumno");
        }

    }
        public static void deleteAlumno(Connection con, String ID) throws SQLException {
        String querie = "DELETE FROM Alumnos WHERE Num_Control=?";
        PreparedStatement statement = con.prepareStatement(querie);
        statement.setInt(1, Integer.valueOf(ID));
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se elimino un alumno");
        }

    }
}
