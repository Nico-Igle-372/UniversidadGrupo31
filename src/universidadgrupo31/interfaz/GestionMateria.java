package universidadgrupo31.interfaz;

import javax.swing.JOptionPane;
import universidadgrupo31.accesoADatos.MateriaData;
import universidadgrupo31.entidades.Materia;

public class GestionMateria extends javax.swing.JInternalFrame {

    private static MateriaData matData = new MateriaData();

    public GestionMateria() {
        initComponents();
        desactivaBotonesBasicos();
        desactivaBotonesAvanzados();
        botonNombre();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoYear = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        radioButtonEstado = new javax.swing.JRadioButton();
        botonBuscarID = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonAlta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        botonBuscarNombre = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Materia");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Nombre:");

        jLabel4.setText("Año:");

        jLabel5.setText("Estado:");

        textoYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoYearKeyReleased(evt);
            }
        });

        textoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoNombreKeyReleased(evt);
            }
        });

        radioButtonEstado.setBackground(new java.awt.Color(204, 255, 255));
        radioButtonEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        radioButtonEstado.setEnabled(false);

        botonBuscarID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar20.png"))); // NOI18N
        botonBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarIDActionPerformed(evt);
            }
        });

        botonNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonNuevo.setText("Guardar Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEliminar.setText("Dar de Baja");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonAlta.setText("Dar de Alta");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jTID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTIDKeyReleased(evt);
            }
        });

        botonBuscarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar20.png"))); // NOI18N
        botonBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(52, 52, 52)
                                .addComponent(radioButtonEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonAlta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(60, 60, 60)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textoYear, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonBuscarNombre)
                                    .addComponent(botonBuscarID))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonBuscarID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonBuscarNombre))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButtonEstado)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEliminar)
                        .addComponent(botonAlta)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        try {
            Materia mate = matData.buscarMateria(Integer.parseInt(jTID.getText()));
            matData.altaMateria(mate.getNombre());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Necesita completar el campo nombre a buscar");
        }
        vaciarDatos();
    }//GEN-LAST:event_botonAltaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Materia mat = new Materia();

        if (!textoNombre.getText().isEmpty()) {
            try {
                mat.setIdMateria(Integer.parseInt(jTID.getText()));
                mat.setNombre(textoNombre.getText());
                mat.setAnioMateria(Integer.parseInt(textoYear.getText()));
                mat.setEstado(true);
                matData.modificarMateria(mat);
                vaciarDatos();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Se requiere un numero valido para el campo Año de Materia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            Materia mate = matData.buscarMateria(Integer.parseInt(jTID.getText()));
            matData.eliminarMateria(mate.getNombre());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Necesita completar el campo nombre a buscar");
        }
        vaciarDatos();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        Materia mat = new Materia();
        if (!textoNombre.getText().isEmpty()) {
            Materia mate = matData.buscarMateriaXNombre(textoNombre.getText());
            if (mate == null) {
                try {
                    mat.setIdMateria(1);
                    mat.setNombre(textoNombre.getText());
                    mat.setAnioMateria(Integer.parseInt(textoYear.getText()));
                    mat.setEstado(radioButtonEstado.isSelected());
                    matData.guardarMateria(mat);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Se requiere un numero valido para el campo Año de Materia");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una materia con ese nombre");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarIDActionPerformed
        Materia mat = new Materia();
        try {
            mat = matData.buscarMateria(Integer.parseInt(jTID.getText()));
            if (mat != null) {
                textoYear.setText(String.valueOf(mat.getAnioMateria()));
                radioButtonEstado.setSelected(mat.isEstado());
                textoNombre.setText(mat.getNombre());
                botonesAvanzados();
                if (mat.isEstado()) {
                    botonAlta.setEnabled(Boolean.FALSE);
                } else {
                    botonEliminar.setEnabled(Boolean.FALSE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se puede dejar campos vacios");
        }
    }//GEN-LAST:event_botonBuscarIDActionPerformed

    private void textoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyReleased
        botonesBasicos();
        botonesAvanzados();       
        botonNombre();
    }//GEN-LAST:event_textoNombreKeyReleased

    private void textoYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoYearKeyReleased
        botonesBasicos();
        botonesAvanzados();
       
    }//GEN-LAST:event_textoYearKeyReleased

    private void jTIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIDKeyReleased
        botonesBasicos();
        botonesAvanzados();
        
        
    }//GEN-LAST:event_jTIDKeyReleased

    private void botonBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombreActionPerformed
        Materia mat = new Materia();
        try {
            mat = matData.buscarMateriaXNombre(textoNombre.getText());
            if (mat != null) {
                textoYear.setText(String.valueOf(mat.getAnioMateria()));
                radioButtonEstado.setSelected(mat.isEstado());
                jTID.setText(mat.getIdMateria() + "");
                botonesAvanzados();
                if (mat.isEstado()) {
                    botonAlta.setEnabled(Boolean.FALSE);
                } else {
                    botonEliminar.setEnabled(Boolean.FALSE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se puede dejar campos vacios");
        }
    }//GEN-LAST:event_botonBuscarNombreActionPerformed

    public void vaciarDatos() {
        jTID.setText("");
        textoNombre.setText("");
        textoYear.setText(null);
        radioButtonEstado.setSelected(false);
        desactivaBotonesBasicos();
        desactivaBotonesAvanzados();
        botonNombre();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonBuscarID;
    private javax.swing.JButton botonBuscarNombre;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTID;
    private javax.swing.JRadioButton radioButtonEstado;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoYear;
    // End of variables declaration//GEN-END:variables

    private void botonesBasicos() {
        if (jTID.getText().isEmpty() || !jTID.getText().matches("[0-9]*")) {
            desactivaBotonesBasicos();
            desactivaBotonesAvanzados();
        } else {
            activaBotonesBasicos();
        }
    }

    private void botonesAvanzados() {
        try {
            if (textoNombre.getText().isEmpty() || textoYear.getText().isEmpty() || Integer.parseInt(textoYear.getText()) > 8
                    
                    || Integer.parseInt(textoYear.getText()) < 1 || textoYear.getText().matches(".*[A-Z, a-z].*")
                    ) {
                desactivaBotonesAvanzados();
                botonNombre();

            } else if ( jTID.getText().isEmpty()){
                
                desactivaBotonesAvanzados();
                desactivaBotonesBasicos();
                botonNuevo.setEnabled(Boolean.TRUE);
                botonNombre();
            } else {
                activaTodosBotones();
                botonNuevo.setEnabled(Boolean.FALSE);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Solo se pueden usar numeros naturales del 1 al 8");
            textoYear.setText("");
        }
    }

    private void activaBotonesBasicos() {
        botonBuscarID.setEnabled(Boolean.TRUE);
        botonAlta.setEnabled(Boolean.TRUE);
        botonEliminar.setEnabled(Boolean.TRUE);
    }

    private void activaTodosBotones() {
        botonAlta.setEnabled(Boolean.TRUE);
        botonEliminar.setEnabled(Boolean.TRUE);
        botonNuevo.setEnabled(Boolean.TRUE);
        botonModificar.setEnabled(Boolean.TRUE);
        botonBuscarID.setEnabled(Boolean.TRUE);
    }

    private void desactivaBotonesAvanzados() {
        botonNuevo.setEnabled(Boolean.FALSE);
        botonModificar.setEnabled(Boolean.FALSE);
    }

    private void desactivaBotonesBasicos() {
        botonBuscarID.setEnabled(Boolean.FALSE);
        botonAlta.setEnabled(Boolean.FALSE);
        botonEliminar.setEnabled(Boolean.FALSE);

    }

    private void botonNombre() {
        if (textoNombre.getText().isEmpty()|| !textoNombre.getText().matches("[A-Z , a-z].*") ) {
            botonBuscarNombre.setEnabled(Boolean.FALSE);
        } else {
            botonBuscarNombre.setEnabled(Boolean.TRUE);
        }
    }
}
