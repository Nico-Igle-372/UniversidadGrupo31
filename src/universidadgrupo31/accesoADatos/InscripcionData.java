package universidadgrupo31.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo31.entidades.Alumno;
import universidadgrupo31.entidades.Inscripcion;
import universidadgrupo31.entidades.Materia;

public class InscripcionData {

    private Connection con;
    private AlumnoData aluData = new AlumnoData();
    private MateriaData matData = new MateriaData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria)"
                + "VALUES (?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripto satisfactoriamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la inscripcion \n" + ex.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Inscripcion inscri = new Inscripcion();
                inscri.setIdInscripcion(rs.getInt("idInscripto"));
                inscri.setNota(rs.getDouble("nota"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                inscri.setAlumno(alu);
                Materia mate = matData.buscarMateria(rs.getInt("idMateria"));
                inscri.setMateria(mate);
                inscripciones.add(inscri);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el listado de inscripcion \n" + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripcionesPorAl = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion where idAlumno = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripto = new Inscripcion();
                inscripto.setIdInscripcion(rs.getInt("idInscripto"));
                inscripto.setNota(rs.getDouble("nota"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                inscripto.setAlumno(alu);
                Materia mate = matData.buscarMateria(rs.getInt("idMateria"));
                inscripto.setMateria(mate);
                inscripcionesPorAl.add(inscripto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el listado de inscriptos por alumno \n" + ex.getMessage());
        }
        return inscripcionesPorAl;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materiasCursadas = new ArrayList<>();
        String sql = "SELECT m.idMateria, m.nombre, año FROM materia as m "
                    + "JOIN inscripcion as i ON (m.idMateria = i.idMateria) "
                    + "WHERE i.idAlumno = ? AND m.estado = true";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia mate = new Materia();
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnioMateria(rs.getInt("año"));
                mate.setEstado(true);
                materiasCursadas.add(mate);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en buscar materias cursadas \n" + ex.getMessage());
        }
        return materiasCursadas;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materiasNoCursadas = new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN"
                + "(SELECT materia.idMateria FROM materia, inscripcion "
                + "WHERE materia.idMateria = inscripcion.idMateria AND inscripcion.idAlumno = ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Materia mate = new Materia();
                mate.setIdMateria(rs.getInt("idMateria"));
                mate.setNombre(rs.getString("nombre"));
                mate.setAnioMateria(rs.getInt("año"));
                mate.setEstado(true);
                materiasNoCursadas.add(mate);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en buscar materias no cursadas \n" + ex.getMessage());
        }
        return materiasNoCursadas;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);

            int registro = ps.executeUpdate();
            if (registro == 1) {
                JOptionPane.showMessageDialog(null, "Desuscripto exitosamente");
            }else{
                 JOptionPane.showMessageDialog(null, "El alumno no estaba inscripto en esa materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en desuscripcion del alumno a la materia \n" + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int registro = ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el cambio de nota" + ex.getMessage());
        }
    }

    public List<Alumno> obtenerAlumnoPorMateria(int idMateria) {
        List<Alumno> alumnoPorMateria = new ArrayList<>();
        
        String sql = "SELECT a.idAlumno, dni, a.nombre, apellido, fechaNacimiento "
                + "FROM alumno AS a JOIN inscripcion AS i ON(a.idAlumno = i.idAlumno) "
                + "JOIN materia AS m ON(i.idMateria = m.idMateria) "
                + "WHERE i.idMateria = ? AND a.estado = true AND m.estado = true";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setNombre(rs.getString("nombre"));
                alu.setApellido(rs.getString("apellido"));
                alu.setFechaNac((rs.getDate("fechaNacimiento")).toLocalDate());
                alu.setEstado(true);
                alumnoPorMateria.add(alu);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda de alumnos \n" + ex.getMessage());
        }
        return alumnoPorMateria;
    }
}
