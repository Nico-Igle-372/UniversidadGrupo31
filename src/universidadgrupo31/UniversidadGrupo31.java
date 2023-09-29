package universidadgrupo31;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
//import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
//import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
//import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme;
import javax.swing.JOptionPane;
//import javax.swing.UIManager;
import universidadgrupo31.interfaz.VentanaPrincipal;

public class UniversidadGrupo31 {

    public static void main(String[] args) {
        try {
//    UIManager.setLookAndFeel( new FlatLightLaf() );
            FlatArcIJTheme.setup();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falló al iniciar FlatLaf");
        }
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
