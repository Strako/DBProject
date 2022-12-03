package biblioproyect.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author s404
 */
public class cudLibros {

    public static void insertLibros(Connection con, String Titulo, String Autor, String Fecha_Editado) throws SQLException {
        String querie = "INSERT INTO Libros (Titulo, Autor, Fecha_Editado) VALUES (?,?,?)";
        PreparedStatement statement = con.prepareStatement(querie);

        statement.setString(1, Titulo);
        statement.setString(2, Autor);
        statement.setString(3, Fecha_Editado);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se inserto un libro");
        }

    }

    public static void updateLibros(Connection con, String Titulo, String Autor, String Fecha_Editado, String ID) throws SQLException {
        String querie = "UPDATE Libros SET Titulo=?, Autor=?, Fecha_Editado=? WHERE Num_Libro=?";
        PreparedStatement statement = con.prepareStatement(querie);

        statement.setString(1, Titulo);
        statement.setString(2, Autor);
        statement.setString(3, Fecha_Editado);
        statement.setInt(4, Integer.valueOf(ID));
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se actualizo un libro");
        }

    }
        public static void deleteLibros(Connection con, String ID) throws SQLException {
        String querie = "DELETE FROM Libros WHERE Num_Libro=?";
        PreparedStatement statement = con.prepareStatement(querie);
        statement.setInt(1, Integer.valueOf(ID));
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Se elimino un libro");
        }

    }
}
