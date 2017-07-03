
package Formulario;

import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Toolkit;

public class frmCifrar extends javax.swing.JFrame {

    //Principal prin = new Principal();
    //frmCifrar cifrar = new frmCifrar();
    //frmDescifrar descifrar = new frmDescifrar();
    
    
    public frmCifrar() {
        initComponents();
        txtCifrado.setEditable(false);
        //CAMBIAR ICONO DE VENTANA
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/triangle.png"));
        setIconImage(icon);
        txtCifrado.setEditable(false);
        //setVisible(true);
        
        
                
        //BOTONES TRANSPARENTES
        btnMinimizar.setContentAreaFilled(false);
       // btnMaximizar.setContentAreaFilled(false);
        btnCerrar.setContentAreaFilled(false);
        btnVolverC.setContentAreaFilled(false);

        
        //EFECTOS INICIALES EN EL BOTON CERRAR
        pnlCerrar.setVisible(true);
        pnlCerrar.setBackground(null);
 
        
        //EFECTOS BOTON MINIMIZAR
        pnlMin.setVisible(true);
        pnlMin.setBackground(null);
        
        //EFECTOS BOTON MAXIMIZAR
       // pnlMax.setVisible(true);
        //pnlMax.setBackground(null);
        
        //EFECTOS BOTON VOLVER
        pnlVolverC.setVisible(true);
   
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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlMin = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        pnlCerrar = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        pnlVolverC = new javax.swing.JPanel();
        btnVolverC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCifrado = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 39, 53));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(24, 51, 55));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/triangle02.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 0, 16, 30);

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("CRIPTO - CIFRAR");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(460, 10, 80, 16);

        pnlMin.setBackground(new java.awt.Color(204, 204, 204));
        pnlMin.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(null);
        pnlMin.add(jPanel6);
        jPanel6.setBounds(660, 0, 50, 30);

        btnMinimizar.setBackground(new java.awt.Color(12, 23, 30));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496904507_remove.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        pnlMin.add(btnMinimizar);
        btnMinimizar.setBounds(0, 0, 50, 30);

        jPanel3.add(pnlMin);
        pnlMin.setBounds(900, 0, 50, 30);

        pnlCerrar.setBackground(new java.awt.Color(204, 0, 0));
        pnlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseExited(evt);
            }
        });
        pnlCerrar.setLayout(null);

        btnCerrar.setBackground(new java.awt.Color(102, 0, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496904441_close.png"))); // NOI18N
        btnCerrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 39, 60), 0, true));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlCerrar.add(btnCerrar);
        btnCerrar.setBounds(0, 0, 50, 30);

        jPanel3.add(pnlCerrar);
        pnlCerrar.setBounds(950, 0, 50, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1000, 30);

        pnlVolverC.setBackground(new java.awt.Color(0, 39, 53));
        pnlVolverC.setLayout(null);

        btnVolverC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolverC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverCMouseExited(evt);
            }
        });
        btnVolverC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverCActionPerformed(evt);
            }
        });
        pnlVolverC.add(btnVolverC);
        btnVolverC.setBounds(0, 0, 40, 40);

        jPanel1.add(pnlVolverC);
        pnlVolverC.setBounds(0, 30, 40, 40);

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Mensaje Cifrado");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 330, 200, 30);

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Ingrese el mensaje");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 60, 220, 40);

        jButton1.setBackground(new java.awt.Color(0, 21, 29));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Limpiar campos");
        jPanel1.add(jButton1);
        jButton1.setBounds(820, 590, 160, 29);

        txtCifrado.setBackground(new java.awt.Color(153, 153, 153));
        txtCifrado.setColumns(20);
        txtCifrado.setRows(5);
        jScrollPane2.setViewportView(txtCifrado);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(100, 370, 820, 180);

        txtMensaje.setBackground(new java.awt.Color(204, 204, 204));
        txtMensaje.setColumns(20);
        txtMensaje.setRows(5);
        jScrollPane3.setViewportView(txtMensaje);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(100, 100, 820, 170);

        jButton2.setBackground(new java.awt.Color(0, 21, 29));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Guardar Mensaje");
        jPanel1.add(jButton2);
        jButton2.setBounds(420, 570, 160, 40);

        jButton3.setBackground(new java.awt.Color(0, 21, 29));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Cifrar Mensaje");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(410, 280, 170, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(996, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        pnlCerrar.setVisible(true);
        pnlCerrar.setBackground(Color.red);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        pnlCerrar.setBackground(null);
        btnCerrar.setVisible(true);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        //frmCripto.setDefaultCloseOperation(frmCripto.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void pnlCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseEntered

    }//GEN-LAST:event_pnlCerrarMouseEntered

    private void pnlCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseExited

    }//GEN-LAST:event_pnlCerrarMouseExited

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setContentAreaFilled(false);
        pnlMin.setVisible(true);
        pnlMin.setBackground(Color.gray);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setContentAreaFilled(false);
        pnlMin.setVisible(true);
        pnlMin.setBackground(null);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED); //Minimizar ventana
    }//GEN-LAST:event_btnMinimizarActionPerformed
        
        private int x;
        private int y;
        
    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        //MODIFICAR LA POSICION DEL FRAME
        java.awt.Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x , point.y-y);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        //OBTENER LA POSICIÓN DEL FRAME
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void btnVolverCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverCMouseEntered
        pnlVolverC.setBackground(Color.gray);
        
    }//GEN-LAST:event_btnVolverCMouseEntered

    private void btnVolverCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverCMouseExited
        pnlVolverC.setBackground(null);
    }//GEN-LAST:event_btnVolverCMouseExited

    private void btnVolverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverCActionPerformed
      Principal prn = new Principal();
      prn.setVisible(true);
      this.dispose();  
    }//GEN-LAST:event_btnVolverCActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCifrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnVolverC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlMin;
    private javax.swing.JPanel pnlVolverC;
    private javax.swing.JTextArea txtCifrado;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}
