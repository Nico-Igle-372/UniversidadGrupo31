package universidadgrupo31.interfaz;

<<<<<<< HEAD

import java.awt.Image;
import java.awt.Toolkit;
=======
>>>>>>> main
import java.sql.Connection;
import universidadgrupo31.accesoADatos.Conexion;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
        conectar();
<<<<<<< HEAD
        setIconImage(getIconImage());
=======
        setResizable(false);
//      setIconImage(getIconImage());
        
>>>>>>> main
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        imagenFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuFormularioAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuFormularioMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuInscripciones = new javax.swing.JMenuItem();
        menuNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuAlumnosXMateria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));

        escritorio.setMaximumSize(new java.awt.Dimension(664, 600));

        imagenFondo.setForeground(new java.awt.Color(51, 51, 255));
        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoulp664.jpg"))); // NOI18N

        escritorio.setLayer(imagenFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(imagenFondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(imagenFondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenu1.setText("Alumno");

        menuFormularioAlumno.setText("Formulario de Alumno");
        menuFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormularioAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(menuFormularioAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        menuFormularioMateria.setText("Formulario de Materia");
        menuFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFormularioMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(menuFormularioMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        menuInscripciones.setText("Manejo de Inscripciones");
        menuInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(menuInscripciones);

        menuNotas.setText("Manipulacion de notas");
        menuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNotasActionPerformed(evt);
            }
        });
        jMenu3.add(menuNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        menuAlumnosXMateria.setText("Alumnos por Materia");
        menuAlumnosXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnosXMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(menuAlumnosXMateria);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(imagenFondo);
        ActualizadorNotas cargaNotas = new ActualizadorNotas();
        cargaNotas.setVisible(true);
        cargaNotas.setClosable(true);
        escritorio.add(cargaNotas);
        escritorio.moveToFront(cargaNotas);
    }//GEN-LAST:event_menuNotasActionPerformed

    private void menuFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormularioAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(imagenFondo);
        GestionAlumnos formuAlumnos = new GestionAlumnos();
        formuAlumnos.setClosable(true);
        formuAlumnos.setVisible(true);
        escritorio.add(formuAlumnos);
        escritorio.moveToFront(formuAlumnos);
    }//GEN-LAST:event_menuFormularioAlumnoActionPerformed

    private void menuFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFormularioMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(imagenFondo);
        GestionMateria formuMateria = new GestionMateria();
        formuMateria.setVisible(true);
        escritorio.add(formuMateria);
        escritorio.moveToFront(formuMateria);
    }//GEN-LAST:event_menuFormularioMateriaActionPerformed

    private void menuInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(imagenFondo);
        GestionInscripcion formuInscripcion = new GestionInscripcion();
        formuInscripcion.setVisible(true);
        formuInscripcion.setClosable(true);
        escritorio.add(formuInscripcion);
        escritorio.moveToFront(formuInscripcion);
    }//GEN-LAST:event_menuInscripcionesActionPerformed

    private void menuAlumnosXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnosXMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        escritorio.add(imagenFondo);
        AlumnoPorMateria aluPorMate= new AlumnoPorMateria();
        aluPorMate.setVisible(true);
        aluPorMate.setClosable(true);
        escritorio.add(aluPorMate);
        escritorio.moveToFront(aluPorMate);
    }//GEN-LAST:event_menuAlumnosXMateriaActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAlumnosXMateria;
    private javax.swing.JMenuItem menuFormularioAlumno;
    private javax.swing.JMenuItem menuFormularioMateria;
    private javax.swing.JMenuItem menuInscripciones;
    private javax.swing.JMenuItem menuNotas;
    // End of variables declaration//GEN-END:variables

    private void conectar(){
        Conexion conx = new Conexion("jdbc:mariadb://localhost:3306/", "universidadulp", "root", "");
        Connection conn = Conexion.getConexion();
    }
    
    @Override
    public Image getIconImage(){
        
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/iconoulp2.png"));
        return retValue;
    }
    
}
