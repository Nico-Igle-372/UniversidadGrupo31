package universidadgrupo31.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo31.entidades.Alumno;
import universidadgrupo31.entidades.Inscripcion;
import universidadgrupo31.entidades.Materia;

public class InscripcionData {

    private Connection con;
    private AlumnoData aluData;
    private MateriaData matData;

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
                insc.setIdInscripcion(rs.getInt("idInscripto"));
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
                inscri.getAlumno().setIdAlumno(rs.getInt("idAlumno"));
                inscri.getMateria().setIdMateria(rs.getInt("idMateria"));
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
                inscripto.getAlumno().setIdAlumno(rs.getInt("idAlumno"));
                inscripto.getMateria().setIdMateria(rs.getInt("idMateria"));
                inscripcionesPorAl.add(inscripto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el listado de inscriptos por alumno \n" + ex.getMessage());
        }
        return inscripcionesPorAl;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {

        List<Materia> materiasCursadas = new ArrayList<Materia>();

        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion"
                    + "materia WHERE inscripcion.idMateria = materia.idMateria\n"
                    + "AND inscripcion.idAlumno= ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;

            while (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materiasCursadas.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materiasCursadas;

    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {

        return materiasNoCursadas;

    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

    }

    public List<Alumno> obtenerAlumnoPorMateria(int idMateria) {

        return alumnoPorMateria;
    }
}
