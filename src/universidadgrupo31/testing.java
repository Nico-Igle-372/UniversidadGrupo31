/*

*/
package universidadgrupo31;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import universidadgrupo31.accesoADatos.Conexion;

public class testing {
    public static void main(String[] args) {
        Conexion conx = new Conexion("jdbc:mariadb://localhost:3306/", "universidadulp", "root", "");
        Connection conn = Conexion.getConexion();
        
        String sql = "insert into alumno(dni, nombre, apellido, fechaNacimiento, estado) values"
                + "(30000001, 'jorge', 'pascual', '1900-03-15',true)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int registro = ps.executeUpdate();
            System.out.println(registro);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }
}