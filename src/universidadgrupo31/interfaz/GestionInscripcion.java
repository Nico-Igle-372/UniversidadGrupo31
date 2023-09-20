package universidadgrupo31.interfaz;

import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo31.accesoADatos.AlumnoData;
import universidadgrupo31.accesoADatos.InscripcionData;
import universidadgrupo31.accesoADatos.MateriaData;
import universidadgrupo31.entidades.Alumno;
import universidadgrupo31.entidades.Inscripcion;
import universidadgrupo31.entidades.Materia;

public class GestionInscripcion extends javax.swing.JInternalFrame {

    AlumnoData aluData = new AlumnoData();
    MateriaData mateData = new MateriaData();
    InscripcionData insData = new InscripcionData();

    private final DefaultTableModel modeloTabla = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public GestionInscripcion() {
        initComponents();
        armarCabecera();
        cargarCombo();
        botonInscribir.setEnabled(Boolean.FALSE);
        botonAnularIns.setEnabled(Boolean.FALSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rbMateriasIns = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbMateriasNoIns = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        cbAlumnos = new javax.swing.JComboBox<>();
        botonInscribir = new javax.swing.JButton();
        botonAnularIns = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        rbMateriasIns.setBackground(new java.awt.Color(204, 255, 255));
        rbMateriasIns.setText("Materias inscriptas");
        rbMateriasIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMateriasInsActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleccione un alumno: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Listado de Materias");

        rbMateriasNoIns.setBackground(new java.awt.Color(204, 255, 255));
        rbMateriasNoIns.setText("Materias no inscriptas");
        rbMateriasNoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMateriasNoInsActionPerformed(evt);
            }
        });

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

        botonInscribir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInscribir.setText("Inscribir");
        botonInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirActionPerformed(evt);
            }
        });

        botonAnularIns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAnularIns.setText("Anular Inscripcion");
        botonAnularIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnularInsActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(botonInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAnularIns, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(botonSalir)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(rbMateriasIns, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbMateriasNoIns, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMateriasIns)
                    .addComponent(rbMateriasNoIns))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnularIns, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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
        if (rbMateriasIns.isSelected()) {
            rbMateriasInsActionPerformed(evt);
        }
        if (rbMateriasNoIns.isSelected()) {
            rbMateriasNoInsActionPerformed(evt);
        }
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void rbMateriasInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMateriasInsActionPerformed
        rbMateriasNoIns.setSelected(false);
        int tamaño = tablaMaterias.getRowCount();
        limpiarTabla(tamaño);
        botonAnularIns.setEnabled(Boolean.TRUE);
        botonInscribir.setEnabled(Boolean.FALSE);
        
        if (rbMateriasIns.isSelected()) {
            Alumno alu = (Alumno) cbAlumnos.getSelectedItem();
            List<Materia> lista = insData.obtenerMateriasCursadas(alu.getIdAlumno());

            for (Iterator<Materia> iterator = lista.iterator(); iterator.hasNext();) {
                Materia mate = iterator.next();
                cargarDatos(mate);
            }
        }
    }//GEN-LAST:event_rbMateriasInsActionPerformed

    private void rbMateriasNoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMateriasNoInsActionPerformed
        rbMateriasIns.setSelected(false);
        int tamaño = tablaMaterias.getRowCount();
        limpiarTabla(tamaño);
        botonAnularIns.setEnabled(Boolean.FALSE);
        botonInscribir.setEnabled(Boolean.TRUE);
        
        if (rbMateriasNoIns.isSelected()) {
            Alumno alu = (Alumno) cbAlumnos.getSelectedItem();
            List<Materia> lista = insData.obtenerMateriasNoCursadas(alu.getIdAlumno());

            for (Iterator<Materia> iterator = lista.iterator(); iterator.hasNext();) {
                Materia mate = iterator.next();
                cargarDatos(mate);
            }
        }
    }//GEN-LAST:event_rbMateriasNoInsActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose(); // cierra el internal frame
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscribirActionPerformed
        Alumno alu = (Alumno) cbAlumnos.getSelectedItem();

        int idMate = (Integer) tablaMaterias.getValueAt(tablaMaterias.getSelectedRow(), 0);
        String nomb = (String) tablaMaterias.getValueAt(tablaMaterias.getSelectedRow(), 1);
        int anio = (Integer) tablaMaterias.getValueAt(tablaMaterias.getSelectedRow(), 2);

        Materia mate = new Materia(idMate, nomb, anio, true);

        Inscripcion insc = new Inscripcion(alu, mate, 0);
        insData.guardarInscripcion(insc);
        
        rbMateriasNoInsActionPerformed(evt);
    }//GEN-LAST:event_botonInscribirActionPerformed

    private void botonAnularInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnularInsActionPerformed
        Alumno alu = (Alumno) cbAlumnos.getSelectedItem();
        int idAlu = alu.getIdAlumno();
        int idMate = (Integer) tablaMaterias.getValueAt(tablaMaterias.getSelectedRow(), 0);
        
        insData.borrarInscripcionMateriaAlumno(idAlu, idMate);
        
        rbMateriasInsActionPerformed(evt);
    }//GEN-LAST:event_botonAnularInsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnularIns;
    private javax.swing.JButton botonInscribir;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbMateriasIns;
    private javax.swing.JRadioButton rbMateriasNoIns;
    private javax.swing.JTable tablaMaterias;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modeloTabla.addColumn("Id de materia");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Año de cursada");
        tablaMaterias.setModel(modeloTabla);
    }

    private void cargarDatos(Materia mate) {
        modeloTabla.addRow(new Object[]{mate.getIdMateria(), mate.getNombre(), mate.getAnioMateria()});
    }

    private void limpiarTabla(int tamaño) {
        for (int i = tamaño - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    private void cargarCombo() {
        List<Alumno> lista = aluData.listarAlumnos();

        for (Iterator<Alumno> iterator = lista.iterator(); iterator.hasNext();) {
            Alumno alu = iterator.next();
            cbAlumnos.addItem(alu);
        }
    }

}
