package universidadgrupo31.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo31.entidades.Alumno;

public class AlumnoData {

    private Connection conn = null;

    public AlumnoData() {
        conn = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO `alumno`( `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) "
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se puede obtener id");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar alumno \n " + ex.getMessage());
        }
    }

    public Alumno buscarAlumno(int id) {
        Alumno alu = null;
        String sql = "SELECT * FROM alumno WHERE idAlumno=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNac((rs.getDate("fechaNacimiento")).toLocalDate());
                alu.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return alu;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alu = null;
        String sql = "SELECT * FROM alumno WHERE dni=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNac((rs.getDate("fechaNacimiento")).toLocalDate());
                alu.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return alu;
    }

    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno WHERE estado= 1";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNac((rs.getDate("fechaNacimiento")).toLocalDate());
                alu.setEstado(rs.getBoolean("estado"));
                alumnos.add(alu);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return alumnos;
    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE `alumno` SET `apellido`=?,`nombre`=?,"
                + "`fechaNacimiento`=? WHERE dni=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(4, alumno.getDni());
            ps.setString(1, alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            int rs = ps.executeUpdate();
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "Se modifico el alumno");
            } else {
                JOptionPane.showMessageDialog(null, "No se modifico el alumno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar alumno\n " + ex.getMessage());
        }
    }

    public void eliminarAlumno(int dni) {
        String upd = "UPDATE alumno SET estado=0 WHERE dni=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(upd);
            ps.setInt(1, dni);
            int registro = ps.executeUpdate();
            if (registro == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro el alumno");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en baja alumno \n" + ex.getMessage());
        }
    }

    public void altaAlumno(int dni) {
        String upd = "UPDATE alumno SET estado=1 WHERE dni=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(upd);
            ps.setInt(1, dni);
            int registro = ps.executeUpdate();
            if (registro == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro el alumno");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno reinscripto");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en alta alumno \n" + ex.getMessage());
        }
    }
}
