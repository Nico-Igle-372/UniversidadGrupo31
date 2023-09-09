package universidadgrupo31.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;  // 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion{
    private static String url;
    private static String usuario;
    private static String pasword;
    
    private static Connection conexion=null;

    public Conexion(String url, String usuario, String pasword) {
        this.url = url;
        this.usuario = usuario;
        this.pasword = pasword;
    }
    
    //Carga los drivers y conecta con la base de datos
    
    public static Connection getConexion(){
        if(conexion==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion=DriverManager.getConnection(url,usuario,pasword);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al conectar");
            }
            
            
        }
        return conexion;
    }
//    private static final String url ="jdbc:mariabd://localhost/";
//    private static final String BD = "universidad";
//    private static final String usuario = "root";    
//    private static final String password = "";       
//    
//    private static Connection connexion = null;  
//    
//    public Conexion(){ }
//      
//    public static Connection getConexion(){
//        if (connexion == null) { 
//            try {
//                Class.forName("org.mariadb.jdbc.Driver");
//                connexion = DriverManager.getConnection(url, usuario, password);
//            }catch(ClassNotFoundException ex){ 
//                JOptionPane.showMessageDialog(null, "Error al cargar el Driver  \n" + ex);
//            }catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, "Error de conexion \n" + ex);
//            } 
//        }
//        return connexion; 
//    }
  }
