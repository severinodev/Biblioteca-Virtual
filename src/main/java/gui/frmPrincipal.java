package gui;

import Biblioteca.Libro;
import Biblioteca.Material;
import Biblioteca.Revista;
import Control.MaterialControl;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

private MaterialControl controlador;

    public frmPrincipal() {
        initComponents();
        this.controlador = new MaterialControl();
        cargarIconosSeguros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxSelecion = new javax.swing.JComboBox<>();
        txtTitulo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblFechaPublicacion = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblID1 = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        txtFechaPublicacion = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblPaginas = new javax.swing.JLabel();
        txtNumerodeEdicion = new javax.swing.JTextField();
        lblPaginas1 = new javax.swing.JLabel();
        btnMostrarLista = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxSelecion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro ", "Revista" }));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblnombre.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        lblnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/biblioteca.png"))); // NOI18N
        lblnombre.setText("Biblioteca");

        lblPregunta.setText("ELIJE EL MATERIAL:");

        lblTitulo.setText("TÍTULO:");

        lblAutor.setText("AUTOR:");

        lblFechaPublicacion.setText("FECHA DE PUBLICACIÓN:");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblID1.setText("ID:");

        lblCategoria.setText("CATEGORÍA:");

        lblPaginas.setText("PÁGINAS:");

        lblPaginas1.setText("NÚMERO DE EDICIÓN:");

        btnMostrarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        btnMostrarLista.setText("Mostrar");
        btnMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarListaActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(22, 22, 22)
                .addComponent(btnMostrarLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(lblPregunta)
                    .addComponent(lblAutor)
                    .addComponent(lblID1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaginas1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNumerodeEdicion)
                        .addComponent(txtAutor)
                        .addComponent(jComboBoxSelecion, 0, 173, Short.MAX_VALUE)
                        .addComponent(txtTitulo)
                        .addComponent(txtId)
                        .addComponent(txtFechaPublicacion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPaginas))
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(lblnombre)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblnombre)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPregunta)
                            .addComponent(jComboBoxSelecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAutor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblID1)
                        .addGap(24, 24, 24)
                        .addComponent(lblFechaPublicacion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(lblPaginas)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActualizar)
                                    .addComponent(btnLimpiar)
                                    .addComponent(btnMostrarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumerodeEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPaginas1)))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                                               
    String tipo = jComboBoxSelecion.getSelectedItem().toString().trim();
    String titulo = txtTitulo.getText();
    String autor = txtAutor.getText();
    String id = txtId.getText();
    String anio = txtFechaPublicacion.getText();  
    String categoria = txtCategoria.getText();
    String paginasStr = txtPaginas.getText();
    String numeroEdicion = txtNumerodeEdicion.getText();

    if (titulo.isEmpty() || autor.isEmpty() || id.isEmpty() || anio.isEmpty()
        || categoria.isEmpty() || paginasStr.isEmpty()|| numeroEdicion.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.");
        return;
    }

    int paginas;
    try {
        paginas = Integer.parseInt(paginasStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El número de páginas debe ser un número.");
        return;
    }

    Material material = null;

    if (tipo.equals("Libro")) {
        material = new Libro(titulo, autor, id, anio, categoria, paginas);
    } else if (tipo.equals("Revista")) {
        material = new Revista(titulo, autor, id, anio, categoria, numeroEdicion);  
    }

    controlador.agregarMaterial(material);
    JOptionPane.showMessageDialog(this, tipo + " guardado exitosamente.");


    }//GEN-LAST:event_btnGuardarActionPerformed
private void cargarIconosSeguros() {
    try {
        java.net.URL iconGuardar = getClass().getResource("/Imagenes/Guardar.png");
        if (iconGuardar != null) btnGuardar.setIcon(new javax.swing.ImageIcon(iconGuardar));
        else System.err.println("Imagen no encontrada: Guardar.png");

        java.net.URL iconLimpiar = getClass().getResource("/Imagenes/Limpiar.png");
        if (iconLimpiar != null) btnLimpiar.setIcon(new javax.swing.ImageIcon(iconLimpiar));
        else System.err.println("Imagen no encontrada: Limpiar.png");

        java.net.URL iconActualizar = getClass().getResource("/Imagenes/Actualizar.png");
        if (iconActualizar != null) btnActualizar.setIcon(new javax.swing.ImageIcon(iconActualizar));
        else System.err.println("Imagen no encontrada: Actualizar.png");

        java.net.URL iconMostrar = getClass().getResource("/Imagenes/Mostrar.png");
        if (iconMostrar != null) btnMostrarLista.setIcon(new javax.swing.ImageIcon(iconMostrar));
        else System.err.println("Imagen no encontrada: Mostrar.png");

        java.net.URL iconSalir = getClass().getResource("/Imagenes/salir.png");
        if (iconSalir != null) btnSalir.setIcon(new javax.swing.ImageIcon(iconSalir));
        else System.err.println("Imagen no encontrada: salir.png");

        java.net.URL iconBiblioteca = getClass().getResource("/Imagenes/biblioteca.png");
        if (iconBiblioteca != null) lblnombre.setIcon(new javax.swing.ImageIcon(iconBiblioteca));
        else System.err.println("Imagen no encontrada: biblioteca.png");

    } catch (Exception ex) {
        System.err.println("Error al cargar los íconos: " + ex.getMessage());
    }
}

    private void btnMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarListaActionPerformed
    frmVentanaLista ventanaLista = new frmVentanaLista(controlador); 
    ventanaLista.setVisible(true);
    }//GEN-LAST:event_btnMostrarListaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this,
        "¿Estás seguro de que deseas salir?",
        "Confirmar salida",
        JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        this.dispose(); 
    }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    txtTitulo.setText("");
    txtAutor.setText("");
    txtId.setText("");
    txtFechaPublicacion.setText("");
    txtCategoria.setText("");
    txtPaginas.setText("");
    txtNumerodeEdicion.setText("");
    jComboBoxSelecion.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    String id = txtId.getText().trim();
    String nuevoTitulo = txtTitulo.getText().trim();

    if (id.isEmpty() || nuevoTitulo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debes ingresar el ID y el nuevo título.");
        return;
    }

    boolean actualizado = controlador.modificarTituloPorId(id, nuevoTitulo);

    if (actualizado) {
        JOptionPane.showMessageDialog(this, "Título actualizado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró ningún material con ese ID.");
    }
    }//GEN-LAST:event_btnActualizarActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarLista;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> jComboBoxSelecion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFechaPublicacion;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblPaginas;
    private javax.swing.JLabel lblPaginas1;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtFechaPublicacion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNumerodeEdicion;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
