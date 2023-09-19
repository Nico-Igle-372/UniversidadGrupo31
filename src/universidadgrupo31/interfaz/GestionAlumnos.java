package universidadgrupo31.interfaz;

import java.awt.HeadlessException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import universidadgrupo31.accesoADatos.AlumnoData;
import universidadgrupo31.entidades.Alumno;

public class GestionAlumnos extends javax.swing.JInternalFrame {

    private static AlumnoData aluData = new AlumnoData();

    public GestionAlumnos() {
        initComponents();
        botonAlta.setEnabled(Boolean.FALSE);
        botonBuscarDni.setEnabled(Boolean.FALSE);
        botonEliminar.setEnabled(Boolean.FALSE);
        botonModificar.setEnabled(Boolean.FALSE);
        botonNuevo.setEnabled(Boolean.FALSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textoDNI = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        radioButtonEstado = new javax.swing.JRadioButton();
        botonNuevo = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonBuscarDni = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        botonAlta = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento:");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Fecha de Nacimiento:");

        textoDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoDNIKeyReleased(evt);
            }
        });

        textoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoApellidoKeyReleased(evt);
            }
        });

        textoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoNombreKeyReleased(evt);
            }
        });

        radioButtonEstado.setBackground(new java.awt.Color(204, 255, 255));

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

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonBuscarDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar20.png"))); // NOI18N
        botonBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarDniActionPerformed(evt);
            }
        });

        jDateChooser2.setDateFormatString("yyyy/MM/dd");
        jDateChooser2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser2FocusLost(evt);
            }
        });
        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(37, 37, 37)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(textoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoApellido)
                                    .addComponent(textoDNI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBuscarDni)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(radioButtonEstado)
                        .addGap(117, 117, 117)
                        .addComponent(botonAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(botonSalir)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificar)
                        .addGap(26, 26, 26)
                        .addComponent(botonEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonBuscarDni))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioButtonEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonEliminar)
                    .addComponent(botonModificar)
                    .addComponent(botonSalir)
                    .addComponent(botonAlta))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed

        dispose();//cierra la pestaña
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        Alumno alu = new Alumno();

        if (textoNombre.getText().isEmpty() || textoApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre y apellido");
        } else {

            try {
                alu.setIdAlumno(1);
                alu.setDni(Integer.parseInt(textoDNI.getText()));
                alu.setApellido(textoApellido.getText());
                alu.setNombre(textoNombre.getText());
                LocalDate fecha = jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                alu.setFechaNac(fecha);
                alu.setEstado(true);
                if (alu != null) {
                    aluData.guardarAlumno(alu);
                    vaciarDatos();
                    JOptionPane.showMessageDialog(this, "Alumno Guardado");

                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Un dato ingresado no valido");
                vaciarDatos();

            }

        }
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Alumno alu = new Alumno();
        if (textoNombre.getText().isEmpty() || textoApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre y apellido");
        } else {
            try {

                alu.setDni(Integer.parseInt(textoDNI.getText()));
                alu.setApellido(textoApellido.getText());
                alu.setNombre(textoNombre.getText());
                LocalDate fecha = jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                alu.setFechaNac(fecha);
                alu.setEstado(radioButtonEstado.isSelected());
                if (alu != null) {
                    aluData.modificarAlumno(alu);
                    vaciarDatos();
                }
            } catch (NumberFormatException | NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Un dato ingresado no valido");
                vaciarDatos();

            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            aluData.eliminarAlumno(Integer.parseInt(textoDNI.getText()));
            vaciarDatos();
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Un dato ingresado no valido");
            vaciarDatos();

        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarDniActionPerformed
        Alumno alu = new Alumno();
        try {
            alu = aluData.buscarAlumnoPorDni(Integer.parseInt(textoDNI.getText()));
            if (alu != null) {

                textoApellido.setText(alu.getApellido());
                textoDNI.setText(alu.getDni() + "");
                textoNombre.setText(alu.getNombre());
                jDateChooser2.setDate(Date.valueOf(alu.getFechaNac()));
                radioButtonEstado.setSelected(alu.isEstado());
            } else {
                vaciarDatos();
            }
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Un dato ingresado no valido");
            vaciarDatos();

        }
    }//GEN-LAST:event_botonBuscarDniActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        try {
            aluData.altaAlumno(Integer.parseInt(textoDNI.getText()));
            vaciarDatos();
        } catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Un dato ingresado no valido");
            vaciarDatos();

        }
    }//GEN-LAST:event_botonAltaActionPerformed

    private void textoDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoDNIKeyReleased
        botonBuscarDni.setEnabled(Boolean.TRUE);
        botonEliminar.setEnabled(Boolean.TRUE);
            botonAlta.setEnabled(Boolean.TRUE);
        if (textoDNI.getText().isEmpty()) {
            botonBuscarDni.setEnabled(Boolean.FALSE);
            botonEliminar.setEnabled(Boolean.FALSE);
            botonAlta.setEnabled(Boolean.FALSE);
                   
        }
    }//GEN-LAST:event_textoDNIKeyReleased

    private void textoApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoApellidoKeyReleased
        try {
            activarBoton();
        } catch (NullPointerException ex) {
            System.out.println("campo de fecha vacio " + ex.getMessage());
        }
    }//GEN-LAST:event_textoApellidoKeyReleased

    private void textoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyReleased
        try {
            activarBoton();
        } catch (NullPointerException ex) {
            System.out.println("campo de fecha vacio " + ex.getMessage());
        }

    }//GEN-LAST:event_textoNombreKeyReleased

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange

        try {
            activarBoton();
        } catch (NullPointerException ex) {
            System.out.println("campo de fecha vacio " + ex.getMessage());
        }

    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jDateChooser2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser2FocusLost
        try {
            activarBoton();
        } catch (NullPointerException ex) {
            System.out.println("campo de fecha vacio " + ex.getMessage());
        }
    }//GEN-LAST:event_jDateChooser2FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JButton botonBuscarDni;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioButtonEstado;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoDNI;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
    public void vaciarDatos() {

        textoApellido.setText("");
        textoDNI.setText("");
        textoNombre.setText("");
        jDateChooser2.setDate(null);
        radioButtonEstado.setSelected(false);
    }

    public void activarBoton() {
        if (!textoApellido.getText().isEmpty() &&textoApellido.getText().matches("[a-zA-Z]*") && !textoNombre.getText().isEmpty()&&textoNombre.getText().matches("[a-zA-Z]*")
            && jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate() != null && !textoDNI.getText().isEmpty()&&textoDNI.getText().matches("[0-9]*")) {
            botonModificar.setEnabled(Boolean.TRUE);
            botonNuevo.setEnabled(Boolean.TRUE);
        } else {
            botonModificar.setEnabled(Boolean.FALSE);
            botonNuevo.setEnabled(Boolean.FALSE);
        }

    }

    public void desactivarBoton() {

    }
}
