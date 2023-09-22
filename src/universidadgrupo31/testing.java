package universidadgrupo31;

import java.sql.Connection;
import universidadgrupo31.accesoADatos.Conexion;

public class testing {
    public static void main(String[] args) {
        Conexion conx = new Conexion("jdbc:mariadb://localhost:3306/", "universidadulp", "root", "");
        Connection conn = Conexion.getConexion();
        
        
    }
}