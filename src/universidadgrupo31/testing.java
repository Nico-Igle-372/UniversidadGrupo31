/*

*/
package universidadgrupo31;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo31.accesoADatos.Conexion;
import universidadgrupo31.accesoADatos.InscripcionData;
import universidadgrupo31.entidades.Alumno;
import universidadgrupo31.entidades.Materia;

public class testing {
    public static void main(String[] args) {
        Conexion conx = new Conexion("jdbc:mariadb://localhost:3306/", "universidadulp", "root", "");
        Connection conn = Conexion.getConexion();
  
        
        
//        String sql = "insert into alumno(dni, nombre, apellido, fechaNacimiento, estado) values"
//                + "(30000001, 'jorge', 'pascual', '1900-03-15',true)";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            int registro = ps.executeUpdate();
//            System.out.println(registro);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//       
//        InscripcionData insData=new InscripcionData();
//        List<Alumno> lista=insData.obtenerAlumnoPorMateria(3);
//            for (Iterator<Alumno> iterator = lista.iterator(); iterator.hasNext();) {
//                
//                Alumno alu = iterator.next();
//                System.out.println(alu);
//                
//            }
//        

            
        
    }
}