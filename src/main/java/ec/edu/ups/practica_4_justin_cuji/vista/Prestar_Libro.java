/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica_4_justin_cuji.vista;

import ec.edu.ups.practica_4_justin_cuji.Principal;
import ec.edu.ups.practica_4_justin_cuji.controlador.Libro_Controlador;
import ec.edu.ups.practica_4_justin_cuji.controlador.Usuario_Controlador;
import javax.swing.JOptionPane;
import ec.edu.ups.practica_4_justin_cuji.modelo.Libro;


public class Prestar_Libro extends javax.swing.JInternalFrame {

    private Usuario_Controlador usuarioControlador;
    private Libro_Controlador libroControlador;
    
    //
    private Crear_Usuario ventanaCrearUsuario;

   
    public Prestar_Libro(Usuario_Controlador usuarioControlador, Libro_Controlador libroControlador) {
        initComponents();
        this.usuarioControlador = usuarioControlador;
        this.libroControlador = libroControlador;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnPrestarLibro = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prestar_Libro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        txtTitulo.setToolTipText("Ingrese el Titulo del Libro");

        txtId.setToolTipText("Ingrese el ID del Usuario al que se presto");
        txtId.setActionCommand("<Not Set>");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnPrestarLibro.setText("Prestar Libro");
        btnPrestarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarLibroActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Titulo");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");

        txtDisponible.setToolTipText("Ingrese el ID del Usuario al que se presto");
        txtDisponible.setActionCommand("<Not Set>");
        txtDisponible.setEnabled(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Disponible");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtId)
                            .addComponent(txtTitulo)
                            .addComponent(txtDisponible, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnPrestarLibro)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrestarLibro)
                    .addComponent(btnCancelar)
                    .addComponent(btnLimpiar))
                .addGap(17, 17, 17))
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtId.getText();
        String titulo = txtTitulo.getText();

        // Verificar si el ID está presente
        if (!id.isEmpty()) {
            // Realizar la búsqueda del libro solo si el ID está presente
            if (!titulo.isEmpty() && libroControlador != null) {
                Libro libroEncontrado = libroControlador.buscarLibroPorTitulo(titulo);

                if (libroEncontrado != null) {
                    // Verificar si el libro está disponible
                    if (libroEncontrado.isDisponible()) {
                        // Muestra un mensaje de "Libro encontrado"
                        JOptionPane.showMessageDialog(this, "Libro encontrado", "Información", JOptionPane.INFORMATION_MESSAGE);

                        // Actualiza la disponibilidad en el campo de texto
                        txtDisponible.setText("Disponible");
                    } else {
                        // Si el libro está prestado, mostrar como no disponible
                        JOptionPane.showMessageDialog(this, "Libro ya prestado", "Información", JOptionPane.INFORMATION_MESSAGE);
                        txtDisponible.setText("No Disponible");
                    }
                } else {
                    // Si el libro no existe, muestra un mensaje "Libro no encontrado"
                    JOptionPane.showMessageDialog(this, "Libro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // Si el ID no está presente, muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnPrestarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarLibroActionPerformed
        String id = txtId.getText();
        String titulo = txtTitulo.getText();

        // Verificar si el ID está presente
        if (!id.isEmpty()) {
            // Realizar la búsqueda del libro solo si el ID está presente
            if (!titulo.isEmpty() && libroControlador != null) {
                Libro libroEncontrado = libroControlador.buscarLibroPorTitulo(titulo);

                if (libroEncontrado != null) {
                    // Verificar si el libro está disponible
                    if (libroEncontrado.isDisponible()) {
                        libroEncontrado.setDisponible(false); // Marcar el libro como no disponible

                        // Muestra un mensaje de "Libro prestado"
                        JOptionPane.showMessageDialog(this, "Libro prestado", "Información", JOptionPane.INFORMATION_MESSAGE);

                        // Actualiza la disponibilidad en el campo de texto
                        txtDisponible.setText("No Disponible");
                    } else {
                        // Si el libro está prestado, mostrar como no disponible
                        JOptionPane.showMessageDialog(this, "Libro ya prestado", "Información", JOptionPane.INFORMATION_MESSAGE);
                        txtDisponible.setText("No Disponible");
                    }
                } else {
                    // Si el libro no existe, muestra un mensaje "Libro no encontrado"
                    JOptionPane.showMessageDialog(this, "Libro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // Si el ID no está presente, muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnPrestarLibroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        this.limpiarCampos();
        ((Principal) getTopLevelAncestor()).mostrarBotones(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.limpiarCampos();
        this.setVisible(false);
        ((Principal) getTopLevelAncestor()).mostrarBotones(true);
    }//GEN-LAST:event_formInternalFrameClosing
    private void limpiarCampos() {
        this.txtId.setText("");
        this.txtTitulo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPrestarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
