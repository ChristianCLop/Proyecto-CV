/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.LoguinController;
import javax.swing.JOptionPane;

/**
 *
 * @author spc
 */
public class admin extends javax.swing.JPanel {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
    }
    
        public void iniciarSesion(){
        LoguinController controlador = new LoguinController();
        boolean[] verificado = controlador.verificar(jtxtuser.getText(),String.valueOf(jtxtpass.getPassword()), "1");
        if (verificado[0] == false) {
            JOptionPane.showMessageDialog(null, "No existe el usuario" + " "+ jtxtuser.getText());
        } else if (verificado[0] == true && verificado[1] == false) {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta intente de nuevo");
        } else if (verificado[0] == true && verificado[1] == true) {
            JOptionPane.showMessageDialog(null, "Exito");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jtxtuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jtxtpass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jbtnRegistro = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Usuario");

        jtxtuser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtuser.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Contraseña");

        jtxtpass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtpass.setBorder(null);

        jbtnRegistro.setBackground(new java.awt.Color(102, 102, 102));
        jbtnRegistro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtnRegistro.setText("Iniciar Sesion");
        jbtnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(jbtnRegistro)))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jtxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnRegistro)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroActionPerformed
        if (jtxtuser.getText().trim().isEmpty() || String.valueOf(jtxtpass.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Espacios invalidos o incompletos");
        }
        iniciarSesion();
    }//GEN-LAST:event_jbtnRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtnRegistro;
    private javax.swing.JPasswordField jtxtpass;
    private javax.swing.JTextField jtxtuser;
    // End of variables declaration//GEN-END:variables
}
