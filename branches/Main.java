/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba_postgres;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String driver = "org.postgresql.Driver"; // el nombre de nuestro driver Postgres.
    String connectString = "jdbc:postgresql://localhost"; // llamamos nuestra bd
    String user = "postgres"; // usuario postgres
    String password = "proyecto1"; // no tiene password nuestra bd.

try {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
//Hacemos la coneccion.
Connection conn = DriverManager.getConnection(connectString, user, password);
//Si la conexion fue realizada con exito, muestra el sgte mensaje.
System.out.println("Conexion a la base de datos Ejemplo realizada con exito! ");
//Cerramos la conexion
conn.close();
}
//Si se produce una Excepcion y no nos podemos conectar, muestra el sgte. mensaje.
catch(SQLException e) {
System.out.println("Se ha producido un error en la conexion a la base de datos Ejemplo! ");
}

    }

}
