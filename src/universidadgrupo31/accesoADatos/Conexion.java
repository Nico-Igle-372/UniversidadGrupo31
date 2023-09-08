package universidadgrupo31.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;  // 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion{
    private static final String URL ="jdbc:mariabd://localhost/";
    private static final String BD = "universidadulp";
    private static final String USUARIO = "root";    
    private static final String PASSWORD = "";       
    
    private static Connection connexion = null;  
    
    public Conexion(){ }
      
    public static Connection getConexion(){
        if (connexion == null) { 
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            }catch(ClassNotFoundException ex){ 
                JOptionPane.showMessageDialog(null, "Error al cargar el Driver  \n" + ex);
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion \n" + ex);
            } 
        }
        return connexion; 
    }
  }
