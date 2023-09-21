/*

 */
package universidadgrupo31.accesoADatos;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadgrupo31.entidades.Materia;

public class MateriaData {

    private Connection coneccion = null;

    public MateriaData() {
        coneccion = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO `materia`(`nombre`, `año`, `estado`) VALUES (?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = coneccion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir materia");
        }
    }

    public Materia buscarMateria(int idMateria) {
        Materia mat = null;
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria= ?";
        PreparedStatement ps = null;
        try {
            ps = coneccion.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mat = new Materia();
                mat.setIdMateria(idMateria);
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return mat;
    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE `materia` SET `año`=?,`estado`=? WHERE nombre = ?";
        PreparedStatement ps = null;

        try {
            ps = coneccion.prepareStatement(sql);
            ps.setString(3, materia.getNombre());
            ps.setInt(1, materia.getAnioMateria());
            ps.setBoolean(2, materia.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }

    }

    public void eliminarMateria(String nombre) {
        String sql = "UPDATE materia SET estado = 0 WHERE nombre = ? ";
        PreparedStatement ps = null;
        try {
            ps = coneccion.prepareStatement(sql);
            ps.setString(1, nombre);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");
            } else {
                JOptionPane.showMessageDialog(null, " No se encontro la materia.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");
        }
   }
    
    public List<Materia> listarMaterias(){
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1 ";
        PreparedStatement ps= null;
        try {
            ps=coneccion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia "+ex.getMessage());
        }
     return materias;   
    }
    
    public void altaMateria (String nombre) {

        String sql = "UPDATE materia SET estado = 1 WHERE nombre = ? ";
        PreparedStatement ps = null;
        try {
            ps = coneccion.prepareStatement(sql);
            ps.setString(1, nombre);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se dio de alta la materia.");
            } else {
                JOptionPane.showMessageDialog(null, " No se encontro la materia.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");
        }

   }
    
    public Materia buscarMateriaXNombre(String nombre) {
        Materia mat = null;
        String sql = "SELECT idMateria, año, estado FROM materia WHERE nombre= ?";
        PreparedStatement ps = null;
        try {
            ps = coneccion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mat = new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(nombre);
                mat.setAnioMateria(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
            } else {
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }
        return mat;
    }
    
}
