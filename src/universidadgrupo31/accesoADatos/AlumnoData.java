/*

*/
package universidadgrupo31.accesoADatos;

import java.sql.Connection;

public class AlumnoData {
    private Connection conn = null;
    
    public AlumnoData(){
        conn = Conexion.getConexion();
    }
}