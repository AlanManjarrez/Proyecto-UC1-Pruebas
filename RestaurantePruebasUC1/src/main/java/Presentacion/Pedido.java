/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;
import DTO.EstadoDTO;
import Negocio.Control;
import DTO.PedidoDTO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uirtis
 */
public class Pedido extends javax.swing.JFrame {
    Control control;
    
    /**
     * Creates new form Menu
     */
    public Pedido() {
        initComponents();
        control=new Control();
        Calendar fecha=Calendar.getInstance();
        jtable.setDefaultEditor(Object.class, null);
        llenarTabla(jtable,control.consultarPedidos(fecha));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        crearPedido = new javax.swing.JButton();
        modificarPedido = new javax.swing.JButton();
        cancelarPedido = new javax.swing.JButton();
        btnCambiarEstado = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        jLabel1.setText("Pedidos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Alimento", "Estado", "Cantidad", "Detalles", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        crearPedido.setText("Crear Pedido");
        crearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPedidoActionPerformed(evt);
            }
        });

        modificarPedido.setText("Modificar Pedido");
        modificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPedidoActionPerformed(evt);
            }
        });

        cancelarPedido.setText("Cancelar Pedido");
        cancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPedidoActionPerformed(evt);
            }
        });

        btnCambiarEstado.setText("Cambiar estado");
        btnCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoActionPerformed(evt);
            }
        });

        btnHistorial.setText("Historial de pedidos");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(crearPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modificarPedido)
                .addGap(102, 102, 102)
                .addComponent(cancelarPedido)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnCambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnHistorial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearPedido)
                    .addComponent(cancelarPedido)
                    .addComponent(modificarPedido))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarEstado)
                    .addComponent(btnHistorial))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPedidoActionPerformed
        // TODO add your handling code here:
        CrearPedido pedido = new CrearPedido();
        pedido.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crearPedidoActionPerformed

    private void modificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPedidoActionPerformed
        int selectedRow = jtable.getSelectedRow();
        if (selectedRow != -1) {
            
            Long id= Long.parseLong(jtable.getValueAt(selectedRow, 0).toString());
            PedidoDTO ped=new PedidoDTO();
            ped.setId(id);
            ped.setEstado(EstadoDTO.PREPARACION);
            PedidoDTO conf= control.consultaPedido(ped);
            
            
            ModificarPedido modificarPedido = new ModificarPedido(conf);
            modificarPedido.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun pedido");
        }
    }//GEN-LAST:event_modificarPedidoActionPerformed

    private void cancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPedidoActionPerformed
        int selectedRow = jtable.getSelectedRow();
        if (selectedRow != -1) {
            Long id= Long.parseLong(jtable.getValueAt(selectedRow, 0).toString());
            PedidoDTO ped=new PedidoDTO();
            ped.setId(id);
            ped.setEstado(EstadoDTO.PREPARACION);
            PedidoDTO conf= control.cancelarPedido(ped);
            if (conf!=null) {
                JOptionPane.showMessageDialog(null, "No se ha cancelado");
            }else{
                JOptionPane.showMessageDialog(null, "Se ha cancelado");
                actualizarTabla();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No selecciono un pedido");
        }
    }//GEN-LAST:event_cancelarPedidoActionPerformed

    private void btnCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoActionPerformed
        int selectedRow = jtable.getSelectedRow();
        if (selectedRow!=-1) {
            Long id= Long.parseLong(jtable.getValueAt(selectedRow, 0).toString());
            PedidoDTO ped=new PedidoDTO();
            ped.setId(id);
            ped.setEstado(EstadoDTO.LISTO);
            ped=control.consultaPedido(ped);
            if (ped!=null) {
                if (ped.getEstado().equals(EstadoDTO.PREPARACION)) {
                    ped.setEstado(EstadoDTO.LISTO);
                    ped=control.actualizarPedido(ped);
                    if (ped!=null) {
                        JOptionPane.showMessageDialog(null, "Se ha cambiado de estado");
                        actualizarTabla();
                    }
                }else if (ped.getEstado().equals(EstadoDTO.LISTO)) {
                    ped.setEstado(EstadoDTO.ENTREGADO);
                    ped=control.actualizarPedido(ped);
                    if (ped!=null) {
                        JOptionPane.showMessageDialog(null,"Se ha cambiado de estado");
                        actualizarTabla();;
                    }
                }else if (ped.getEstado().equals(EstadoDTO.ENTREGADO)) {
                    JOptionPane.showMessageDialog(null, "Ya se ha entregado no hay mas estados");
                }              
            }
        }
    }//GEN-LAST:event_btnCambiarEstadoActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        Historial frmHistorial=new Historial();
        frmHistorial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistorialActionPerformed
    
    private void llenarTabla(JTable table,List<PedidoDTO> pedidos){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Número de Pedido");
        modelo.addColumn("Estado");
        modelo.addColumn("Alimento");
        modelo.addColumn("Cantidad");
        
    
        for (PedidoDTO pedido : pedidos) {
            EstadoDTO estado = pedido.getEstado();
            
            String[] alimentos = pedido.getAlimento().split(", ");
            for (String alimento : alimentos) {
                String[] partes = alimento.split(" "); 
                String nombre = partes[0]; 
                String cantidad = partes[1]; 

                // Agregar fila al modelo
                modelo.addRow(new Object[]{
                    pedido.getId(),
                    estado.toString(),
                    nombre,
                    cantidad
                });
            }
        }
        table.setModel(modelo);
    }
    
    private void actualizarTabla() {
        Calendar fecha = Calendar.getInstance(); 
        List<PedidoDTO> pedidos = control.consultarPedidos(fecha); 
        llenarTabla(jtable, pedidos);
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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarEstado;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton cancelarPedido;
    private javax.swing.JButton crearPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JButton modificarPedido;
    // End of variables declaration//GEN-END:variables
}
