/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.LoguinController;
import java.awt.Color;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author spc
 */
public class docente extends javax.swing.JPanel {

    /**
     * Creates new form docente
     */
    public docente() {
        initComponents();
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
        jbtnEntrada = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Usuario");

        jtxtuser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtuser.setBorder(null);
        jtxtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtuserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Contraseña");

        jtxtpass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtpass.setBorder(null);

        jbtnEntrada.setBackground(new java.awt.Color(255, 255, 255));
        jbtnEntrada.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jbtnEntrada.setText("Registrar Entrada");
        jbtnEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(725, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jbtnEntrada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnEntrada)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtuserActionPerformed

    private void jbtnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEntradaActionPerformed
        if (jtxtuser.getText().trim().isEmpty() || String.valueOf(jtxtpass.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Espacios invalidos o incompletos");
        }
        iniciarSesion();
        validarBoton();
    }//GEN-LAST:event_jbtnEntradaActionPerformed
    public void validarBoton() {
        LocalTime horaActual = LocalTime.now();
        LocalTime inicio = LocalTime.parse("06:50");
        LocalTime fin = LocalTime.parse("07:15");
        LocalTime incioTarde = LocalTime.parse("14:00");
        LocalTime finTarde = LocalTime.parse("20:00");

        boolean hora1 = horaActual.isAfter(inicio);
        boolean hora2 = horaActual.isBefore(fin);

        //  JOptionPane.showMessageDialog(null, hora1);
        // JOptionPane.showMessageDialog(null, hora2);
        if (jbtnEntrada.isSelected()) {
            jbtnEntrada.setBackground(new Color(32, 146, 25));
            jbtnEntrada.setText("Registrar Entrada");
        } else {
            jbtnEntrada.setBackground(new Color(180, 35, 35));
            jbtnEntrada.setText("Registrar Salida");
        }

    }

    public void iniciarSesion() {
        LoguinController controlador = new LoguinController();
        boolean[] verificado = controlador.verificar(jtxtuser.getText(), String.valueOf(jtxtpass.getPassword()), "0");
        if (verificado[0] == false) {
            JOptionPane.showMessageDialog(null, "No existe el usuario" + " " + jtxtuser.getText());
        } else if (verificado[0] == true && verificado[1] == false) {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta intente de nuevo");
        } else if (verificado[0] == true && verificado[1] == true) {
            JOptionPane.showMessageDialog(null, "Exito");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jbtnEntrada;
    private javax.swing.JPasswordField jtxtpass;
    private javax.swing.JTextField jtxtuser;
    // End of variables declaration//GEN-END:variables
}
