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
        jLabel7 = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        botonAlta = new javax.swing.JButton();

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

        jLabel7.setText("Codigo ID: ");

        textoID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoIDKeyReleased(evt);
            }
        });

        botonAlta.setText("Dar de Alta");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(radioButtonEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonEliminar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonNuevo)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonAlta)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(42, 42, 42))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                        .addComponent(textoYear))
                                    .addComponent(textoID, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addComponent(botonBuscarID)))
                        .addGap(27, 27, 27))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(botonBuscarID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButtonEstado)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEliminar)
                        .addComponent(botonAlta)))
                .addGap(55, 55, 55)
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
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        try {
            matData.altaMateria(Integer.parseInt(textoID.getText()));
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Se requiere un numero valido para el campo ID de Materia");
        }
        vaciarDatos();
    }//GEN-LAST:event_botonAltaActionPerformed

    private void textoIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoIDKeyReleased
        botonesBasicos();
    }//GEN-LAST:event_textoIDKeyReleased

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Materia mat = new Materia();
        if (!textoNombre.getText().isEmpty()) {
            try {
                mat.setIdMateria(Integer.parseInt(textoID.getText()));
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
            matData.eliminarMateria(Integer.parseInt(textoID.getText()));
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Se requiere un numero valido para el campo ID de Materia");
        }
        vaciarDatos();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        Materia mat = new Materia();
        if (!textoNombre.getText().isEmpty()) {
            try {
                mat.setNombre(textoNombre.getText());
                mat.setAnioMateria(Integer.parseInt(textoYear.getText()));
                mat.setEstado(radioButtonEstado.isSelected());
                matData.guardarMateria(mat);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Se requiere un numero valido para el campo Año de Materia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarIDActionPerformed

        Materia mat = new Materia();
        try {
            mat = matData.buscarMateria(Integer.parseInt(textoID.getText()));
            if (mat != null) {
                textoNombre.setText(mat.getNombre());
                textoYear.setText(String.valueOf(mat.getAnioMateria()));
                radioButtonEstado.setSelected(mat.isEstado());

                botonesAvanzados();
            }
        } catch (NullPointerException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Se requiere un numero valido para el campo ID de Materia");
        }
    }//GEN-LAST:event_botonBuscarIDActionPerformed

    private void textoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyReleased
        botonesAvanzados();
    }//GEN-LAST:event_textoNombreKeyReleased

    private void textoYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoYearKeyReleased
        botonesAvanzados();
        botonesBasicos();
    }//GEN-LAST:event_textoYearKeyReleased

    public void vaciarDatos() {
        textoID.setText("");
        textoNombre.setText("");
        textoYear.setText(null);
        radioButtonEstado.setSelected(false);
        desactivaBotonesBasicos();
        desactivaBotonesAvanzados();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonBuscarID;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioButtonEstado;
    private javax.swing.JTextField textoID;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoYear;
    // End of variables declaration//GEN-END:variables

    private void botonesBasicos() {
        if (textoID.getText().isEmpty() || (!textoID.getText().matches("[0-9].*") || textoID.getText().matches(".*[A-Z, a-z].*"))) {
            desactivaBotonesBasicos();
            desactivaBotonesAvanzados();
        }
        if (!textoID.getText().isEmpty() && textoID.getText().matches("[0-9].*") && !textoID.getText().matches(".*[A-Z, a-z].*")) {
            activaBotonesBasicos();
        }
    }

    private void botonesAvanzados() {
        if (textoNombre.getText().isEmpty() || textoYear.getText().isEmpty() || !textoYear.getText().matches("[0-9].*") 
                || textoYear.getText().matches(".*[A-Z, a-z].*")) {
            desactivaBotonesAvanzados();
        }
        if (!textoNombre.getText().isEmpty() && !textoYear.getText().isEmpty() && textoYear.getText().matches("[0-9].*")
                && !textoYear.getText().matches(".*[A-Z, a-z].*")) {
            activaTodosBotones();
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
}
