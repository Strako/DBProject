/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioproyect.Queries;

/**
 *
 * @author armandoisaihernandezibarra
 */
public class testQueries {

    public static boolean login(String usuario, String clave) {
        boolean resultado;
        if (usuario.equals("Zul") && clave.equals("123")) {
            resultado = true;
        } else resultado = false;
        return resultado;
    }
}
