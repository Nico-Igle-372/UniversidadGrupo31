/*

*/
package universidadgrupo31;

import java.sql.Connection;
import universidadgrupo31.accesoADatos.AlumnoData;
import universidadgrupo31.accesoADatos.Conexion;
import universidadgrupo31.accesoADatos.InscripcionData;
import universidadgrupo31.accesoADatos.MateriaData;

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
        InscripcionData insData = new InscripcionData();
        MateriaData mateData = new MateriaData();
        AlumnoData aluData = new AlumnoData();
        
       
        //List<Inscripcion> listaInsc =  insData.obtenerInscripcionesPorAlumno(2);
//        List<Inscripcion> lisIn = insData.obtenerInscripciones();
//        for (Inscripcion insc : lisIn) {
//            System.out.println(insc.getIdInscripcion());
//            System.out.println(insc.getAlumno().getNombre());
//            System.out.println(insc.getMateria().getNombre());
//            System.out.println(insc.getNota());
//            System.out.println("----------------------------------------------");
//        }
      //  insData.actualizarNota(5, 5, 9);
        
        
    }
}