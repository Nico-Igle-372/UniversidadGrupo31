package universidadgrupo31.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;  // 
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion{
    private static  String URL ="jdbc:mariabd://localhost/universidadulp";
    private static  String BD = "universidadulp";
    private static  String USUARIO = "root";    
    private static  String PASSWORD = "";       
    
    private static Connection connexion = null;  
    
    private Conexion(){ }
      
    public static Connection getConexion(){
        if (connexion == null) { 
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connexion = DriverManager.getConnection("jdbc:mariabd://localhost/universidadulp", "root", "");
            }catch(ClassNotFoundException ex){ 
                JOptionPane.showMessageDialog(null, "Error al cargar el Driver  \n" + ex);
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion \n" + ex);
            } 
        }
        return connexion; 
    }
  }
