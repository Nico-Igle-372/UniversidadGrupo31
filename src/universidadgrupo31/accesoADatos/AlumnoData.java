/*

*/
package universidadgrupo31.accesoADatos;
public class AlumnoData {
    private Connection conn = null;
    
    public AlumnoData(){
        conn = Conexion.getConexion();
    }
}