package biblioproyect.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author s404
 */
public class cudPrestamos {

    public static void insertPrestamos(Connection con, String Num_Control, String Fecha_Retiro, String Fecha_Entrega, String Num_Libro) throws SQLException {
        String querie = "INSERT INTO Prestamos (Num_Control, Fecha_Retiro, Fecha_Entrega, Num_Libro) VALUES (?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(querie);

        statement.setString(1, Num_Control);
        statement.setString(2, Fecha_Retiro);
        statement.setString(3, Fecha_Entrega);
        statement.setString(4, Num_Libro);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se inserto un prestamo");
        }

    }

    public static void updatePrestamos(Connection con, String Num_Control, String Fecha_Retiro, String Fecha_Entrega, String Num_Libro, String ID) throws SQLException {
        String querie = "UPDATE Prestamos SET Num_Control=?, Fecha_Retiro=?, Fecha_Entrega=?, Num_Libro=? WHERE Id_Prestamo=?";
        PreparedStatement statement = con.prepareStatement(querie);

        statement.setString(1, Num_Control);
        statement.setString(2, Fecha_Retiro);
        statement.setString(3, Fecha_Entrega);
        statement.setString(4, Num_Libro);
        statement.setInt(5, Integer.valueOf(ID));
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se actualizo un prestamo");
        }

    }
        public static void deletePrestamos(Connection con, String ID) throws SQLException {
        String querie = "DELETE FROM Prestamos WHERE ID_Prestamo=?";
        PreparedStatement statement = con.prepareStatement(querie);
        statement.setInt(1, Integer.valueOf(ID));
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se elimino un prestamo");
        }

    }
}
