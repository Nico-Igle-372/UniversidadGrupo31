/*

*/
package universidadgrupo31;

import java.sql.Connection;
import universidadgrupo31.accesoADatos.Conexion;

public class testing {
    public static void main(String[] args) {
        Connection conn = Conexion.getConexion();
    }
}