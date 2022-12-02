/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioproyect;

import biblioproyect.Queries.callProcedure;
import biblioproyect.Queries.connection;
import biblioproyect.Queries.getPrestamos;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp Omen
 */
public class mPrestamos extends javax.swing.JFrame {

    /**
     * Creates new form mPrestamos
     */
    public mPrestamos() throws SQLException, IOException {
        initComponents();
        getContentPane().setBackground(Color.ORANGE);
        this.setLocationRelativeTo(null);
        model.addColumn("ID_Prestamo");
        model.addColumn("Num_Control");
        model.addColumn("Fecha_Retiro");
        model.addColumn("Fecha_Entrega");
        model.addColumn("Num_Libro");
        getPrestamos.getPrestamos(connection.getCon(), model);
        callProcedure.call(connection.getCon(), lblCantPres, "CantPrestamos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JTextField();
        txtNumeroLibro = new javax.swing.JTextField();
        lblNumeroLibro = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jComboBoxAlumnos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLibros = new javax.swing.JTable();
        lblTelefono = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblFechaEditado = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtFechaEditado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtFechaRetiro = new javax.swing.JTextField();
        txtNoLibro = new javax.swing.JTextField();
        txtNoControl = new javax.swing.JTextField();
        txtIdPrestamo = new javax.swing.JTextField();
        lblNoControl = new javax.swing.JLabel();
        lblIdPrestamo = new javax.swing.JLabel();
        jComboBoxAlumnos1 = new javax.swing.JComboBox<>();
        txtFechaEntrega = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePrestamos = new javax.swing.JTable();
        lblFechaEntrega = new javax.swing.JLabel();
        lblFechaRetiro = new javax.swing.JLabel();
        lblNoLibro = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblCantPres = new javax.swing.JLabel();

        lblNumeroLibro.setText("Número de Libro");

        lblTitulo.setText("Titulo");

        jComboBoxAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Agregar", "Actualizar", "Eliminar" }));
        jComboBoxAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnosActionPerformed(evt);
            }
        });

        jTableLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número de Libro", "Titulo", "Autor", "Telefono", "Fecha de Editado"
            }
        ));
        jScrollPane2.setViewportView(jTableLibros);

        lblTelefono.setText("Teléfono");

        lblAutor.setText("Autor");

        lblFechaEditado.setText("Fecha de Editado");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        txtIdPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPrestamoActionPerformed(evt);
            }
        });

        lblNoControl.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        lblNoControl.setForeground(new java.awt.Color(255, 255, 255));
        lblNoControl.setText("No.Control");

        lblIdPrestamo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        lblIdPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPrestamo.setText("Id Prestamo");

        jComboBoxAlumnos1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jComboBoxAlumnos1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Agregar", "Actualizar", "Eliminar" }));
        jComboBoxAlumnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnos1ActionPerformed(evt);
            }
        });

        jTablePrestamos.setModel(model);
        jTablePrestamos.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePrestamos.setShowGrid(true);
        jScrollPane3.setViewportView(jTablePrestamos);

        lblFechaEntrega.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        lblFechaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaEntrega.setText("Fecha Entrega");

        lblFechaRetiro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        lblFechaRetiro.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaRetiro.setText("Fecha Retiro");

        lblNoLibro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        lblNoLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblNoLibro.setText("No.Libro");

        btnRegresar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblCantPres.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lblCantPres.setForeground(new java.awt.Color(0, 0, 0));
        lblCantPres.setText("XX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(591, 591, 591)
                            .addComponent(btnAceptar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCantPres))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(lblIdPrestamo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblNoControl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(lblFechaRetiro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblFechaEntrega)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblNoLibro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRegresar)
                                .addComponent(txtNoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxAlumnos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdPrestamo)
                    .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoControl)
                    .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaRetiro)
                    .addComponent(txtFechaRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaEntrega)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoLibro)
                    .addComponent(txtNoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCantPres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        modulos m = new modulos();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jComboBoxAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAlumnosActionPerformed

    private void jComboBoxAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAlumnos1ActionPerformed

    private void txtIdPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPrestamoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        try {
            getPrestamos.getPrestamos(connection.getCon(), model);
            callProcedure.call(connection.getCon(), lblCantPres, "CantPrestamos");

        } catch (Exception e) {
            System.out.println(e);
    }//GEN-LAST:event_btnAceptarActionPerformed
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new mPrestamos().setVisible(true);
                } catch(Exception e){
                    System.out.println(e);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> jComboBoxAlumnos;
    private javax.swing.JComboBox<String> jComboBoxAlumnos1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableLibros;
    private javax.swing.JTable jTablePrestamos;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCantPres;
    private javax.swing.JLabel lblFechaEditado;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblFechaRetiro;
    private javax.swing.JLabel lblIdPrestamo;
    private javax.swing.JLabel lblNoControl;
    private javax.swing.JLabel lblNoLibro;
    private javax.swing.JLabel lblNumeroLibro;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtFechaEditado;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaRetiro;
    private javax.swing.JTextField txtIdPrestamo;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JTextField txtNoLibro;
    private javax.swing.JTextField txtNumeroLibro;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel model = new DefaultTableModel();
}
