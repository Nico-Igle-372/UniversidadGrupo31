package universidadgrupo31.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;  // 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion{
    private static final String url ="jdbc:mariabd://localhost/";
    private static final String BD = "universidad";
    private static final String usuario = "root";    
    private static final String password = "";       
    
    private static Connection connexion = null;  
    
    public Conexion(){ }
      
    public static Connection getConexion(){
        if (connexion == null) { 
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connexion = DriverManager.getConnection(url, usuario, password);
            }catch(ClassNotFoundException ex){ 
                JOptionPane.showMessageDialog(null, "Error al cargar el Driver  \n" + ex);
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion \n" + ex);
            } 
        }
        return connexion; 
    }
  }
