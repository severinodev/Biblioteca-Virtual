package gui;

import Biblioteca.Material;
import Biblioteca.Libro;
import Biblioteca.Revista;
import Control.MaterialControl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVentanaLista extends javax.swing.JFrame {
    
private MaterialControl controlador;

public frmVentanaLista(MaterialControl controlador) {
    initComponents();
    this.controlador = controlador;
    cargarTabla();
    cargarIconosSeguros();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMateriales = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATERIAL", "TITULO", "AUTOR", "ID ", "FECHA DE PUBLICACION", "CATEGORÍA", "NUM. DE PAGINAS", "EDICIÓN"
            }
        ));
        jScrollPane1.setViewportView(tablaMateriales);

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEliminar)
                .addGap(46, 46, 46)
                .addComponent(btnActualizar)
                .addGap(44, 44, 44)
                .addComponent(btnSalir)
                .addGap(350, 350, 350))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      int confirmacion = JOptionPane.showConfirmDialog(this,
        "¿Estás segura de que deseas salir?",
        "Confirmar salida",
        JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        this.dispose();
    }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       eliminarSeleccionado();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

private void cargarTabla() {
    DefaultTableModel model = (DefaultTableModel) tablaMateriales.getModel();
    model.setRowCount(0); 
    for (Material m : controlador.obtenerMateriales()) {
        if (m instanceof Libro) {
            Libro l = (Libro) m;
            model.addRow(new Object[] {
                "Libro", l.getTitulo(), l.getAutor(), l.getId(),
                l.getAnioPublicacion(), l.getCategoria(), l.getNumeroPaginas(), "-"
            });
        } else if (m instanceof Revista) {
            Revista r = (Revista) m;
            model.addRow(new Object[] {
                "Revista", r.getTitulo(), r.getAutor(), r.getId(),
                r.getAnioPublicacion(), r.getCategoria(), "-", r.getNumeroEdicion()
            });
        }
    }
}
private void cargarIconosSeguros() {
    try {
        java.net.URL urlListar = getClass().getResource("/Imagenes/Listar.png");
        if (urlListar != null) btnListar.setIcon(new javax.swing.ImageIcon(urlListar));
        else System.err.println("No se encontró Listar.png");

        java.net.URL urlEliminar = getClass().getResource("/Imagenes/Borrar.png");
        if (urlEliminar != null) btnEliminar.setIcon(new javax.swing.ImageIcon(urlEliminar));
        else System.err.println("No se encontró Borrar.png");

        java.net.URL urlSalir = getClass().getResource("/Imagenes/sali01.png");
        if (urlSalir != null) btnSalir.setIcon(new javax.swing.ImageIcon(urlSalir));
        else System.err.println("No se encontró sali01.png");

        java.net.URL urlActualizar = getClass().getResource("/Imagenes/Actualizar.png");
        if (urlActualizar != null) btnActualizar.setIcon(new javax.swing.ImageIcon(urlActualizar));
        else System.err.println("No se encontró Actualizar.png");

    } catch (Exception ex) {
        System.err.println(" Error al cargar iconos: " + ex.getMessage());
    }
}

    private void eliminarSeleccionado() {
        int fila = tablaMateriales.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            controlador.eliminarMaterial(fila);
            cargarTabla(); 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMateriales;
    // End of variables declaration//GEN-END:variables
}
