/*

*/
package universidadgrupo31.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;
import universidadgrupo31.entidades.Alumno;
import universidadgrupo31.entidades.Inscripcion;
import universidadgrupo31.entidades.Materia;

public class InscripcionData {
    
    private Connection con;
    private AlumnoData aluData;
    private MateriaData matData; 

    public InscripcionData(Connection con, AlumnoData aluData, MateriaData matData) {
        this.con = Conexion.getConexion();;
        this.aluData = aluData;
        this.matData = matData;
    }

    public void guardarInscripcion(Inscripcion insc){
         
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria)"
                 
         +"VALUES (?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(2, insc.getNota());
            ps.setInt(3, insc.g)
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        
        return inscripcionesPorAl;
        
    }
    public List<Materia> obtenerMateriasCursadas(int id){
        
        List <Materia> materiasCursadas = new ArrayList<Materia>();
        
        
        try {
                    String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion"
                + "materia WHERE inscripcion.idMateria = materia.idMateria\n" +
                        "AND inscripcion.idAlumno= ?";        

                    
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
    public List<Materia> obtenerMateriasNoCursadas(int id){
        
        return materiasNoCursadas;
        
    }
    public void borrarInscripcionMateriaAlumno( int idAlumno , int idMateria){
        
        
    }
    public void actualizarNota (int idAlumno, int idMateria, double nota){
        
    }
    
    public List<Alumno> obtenerAlumnoPorMateria (int idMateria){
     
        
        return alumnoPorMateria;
    }
}