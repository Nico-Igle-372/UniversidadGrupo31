package universidadgrupo31.interfaz;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import universidadgrupo31.accesoADatos.AlumnoData;
import universidadgrupo31.accesoADatos.InscripcionData;
import universidadgrupo31.entidades.Alumno;
import universidadgrupo31.entidades.Inscripcion;

public class ActualizadorNotas extends javax.swing.JInternalFrame {

    AlumnoData aluData = new AlumnoData();
    InscripcionData insData = new InscripcionData();

    private final DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return columna == 2;
        }
    };

    public ActualizadorNotas() {
        initComponents();
        armarCabecera();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        cbAlumnos = new javax.swing.JComboBox<>();
        botonGuardar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setText("Seleccione un alumno: ");

        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMaterias);

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setForeground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.pregunta-negro-chico.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(cbAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        Alumno alu = (Alumno) cbAlumnos.getSelectedItem();
        int tamaño = tablaMaterias.getRowCount();
        limpiarTabla(tamaño);

        List<Inscripcion> listaIns = insData.obtenerInscripcionesPorAlumno(alu.getIdAlumno());
        for (Iterator<Inscripcion> iterator = listaIns.iterator(); iterator.hasNext();) {
            Inscripcion insc = iterator.next();
            cargarDatosTabla(insc);
        }
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Alumno alu = (Alumno) cbAlumnos.getSelectedItem();
        int idAlu = alu.getIdAlumno();
        int registro = 0;
        List<Inscripcion> inscripciones = insData.obtenerInscripcionesPorAlumno(idAlu);
        try {
            for (int fila = 0; fila < tablaMaterias.getRowCount(); fila++) {
                int idMate = (int) tablaMaterias.getValueAt(fila, 0);
                String notaSt = tablaMaterias.getValueAt(fila, 2).toString().replace(',', '.');
                double nota = Double.parseDouble(notaSt);

                for (Iterator<Inscripcion> iterator = inscripciones.iterator(); iterator.hasNext();) {
                    Inscripcion inscri = iterator.next();

                    if (idMate == inscri.getMateria().getIdMateria()) {
                        if (nota != inscri.getNota()) {
                            if (nota > 10 || nota < 0) {
                                JOptionPane.showMessageDialog(null, "Ingrese valores del 0 al 10");
                                notasOriginales();
                            } else {
                                tablaMaterias.setValueAt(nota, fila, 2);
                                insData.actualizarNota(idAlu, idMate, nota);
                                registro++;
                            }
                        }
                    }
                }
            }
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Se modificaron las notas correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No hubo notas para actualizar");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese valores númericos");
            notasOriginales();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JLabel label = new JLabel("<html><center>Para modificar una nota haga doble click en dicha nota<br>"
                + "Ingrese su nuevo valor y presione la tecla Enter para confirmar<br>"
                + "Y una vez modificadas todas las notas requeridas,<br>haga click en el boton Guardar");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JOptionPane.showMessageDialog(null, label, "Ayuda", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaMaterias;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modeloTabla.addColumn("Id de materia");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Nota");
        tablaMaterias.setModel(modeloTabla);
    }

    private void cargarCombo() {
        List<Alumno> listaAlu = aluData.listarAlumnos();

        for (Iterator<Alumno> iterator = listaAlu.iterator(); iterator.hasNext();) {
            Alumno alu = iterator.next();
            cbAlumnos.addItem(alu);
        }
    }

    private void cargarDatosTabla(Inscripcion insc) {
        modeloTabla.addRow(new Object[]{insc.getMateria().getIdMateria(), insc.getMateria().getNombre(), insc.getNota()});
    }

    private void limpiarTabla(int tamaño) {
        for (int i = tamaño - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }
    
    private void notasOriginales() {
        Alumno alu = (Alumno) cbAlumnos.getSelectedItem();
        int idAlu = alu.getIdAlumno();
        double notaOriginal = 0;
        int laFila = 0;
        List<Inscripcion> inscripciones = insData.obtenerInscripcionesPorAlumno(idAlu);
        for (int fila = 0; fila < tablaMaterias.getRowCount(); fila++) {
            int idMate = (int) tablaMaterias.getValueAt(fila, 0);
            for (Iterator<Inscripcion> iterator = inscripciones.iterator(); iterator.hasNext();) {
                Inscripcion inscri = iterator.next();
                if (idMate == inscri.getMateria().getIdMateria()) {
                    notaOriginal = inscri.getNota();
                    laFila = fila;
                    tablaMaterias.setValueAt(notaOriginal, laFila, 2);
                }
            }
        }
    }
}
