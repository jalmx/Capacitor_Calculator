/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import java.awt.HeadlessException;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import lib.CapacitorValue;

/**
 *
 * @author JOSEF
 */
public class CapUI extends javax.swing.JFrame {

    CapacitorValue capacitorValue;

    /**
     * Creates new form CapUI
     */
    public CapUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        capacitorValue = new CapacitorValue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        editCap = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rpF = new javax.swing.JRadioButton();
        ruF = new javax.swing.JRadioButton();
        rnF = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        textCap = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Capacitor Value");

        editCap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editCap.setText("103");
        editCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCapActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Código del Capacitor");

        buttonGroup1.add(rpF);
        rpF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rpF.setText("pF");
        rpF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpFActionPerformed(evt);
            }
        });

        buttonGroup1.add(ruF);
        ruF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ruF.setText("uF");
        ruF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruFActionPerformed(evt);
            }
        });

        buttonGroup1.add(rnF);
        rnF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rnF.setSelected(true);
        rnF.setText("nF");
        rnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAPACITOR CERAMICO");

        textCap.setEditable(false);
        textCap.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        textCap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCap.setText("10 nF");
        textCap.setBorder(null);

        jMenu1.setText("Información");

        jMenuItem1.setText("Simbolo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Lista");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem2.setText("Acerca De...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textCap, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editCap))
                                .addGap(18, 18, 18)
                                .addComponent(rpF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ruF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rnF)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rpF)
                        .addComponent(ruF)
                        .addComponent(rnF))
                    .addComponent(editCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textCap, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCapActionPerformed

        try {

            int cap = Integer.parseInt(editCap.getText());
            capacitorValue.setValueCap(cap);
            long vc = capacitorValue.getpF();
            int mult = capacitorValue.getMultiplicador();

            if (vc != -1) {

                if (rpF.isSelected()) {

                    textCap.setText(String.valueOf(vc) + " pF");
                }

                if (ruF.isSelected()) {
                    String c;

                    if (vc <= 470) {
                        c = String.format("%.6f", capacitorValue.getuF());
                    } else if(mult == 2){
                        c = String.format("%.4f", capacitorValue.getuF());
                    }else if (mult == 3) {
                        c = String.format("%.3f", capacitorValue.getuF());
                    } else if (mult == 4) {
                        c = String.format("%.2f", capacitorValue.getuF());
                    } else {
                        c = String.valueOf(capacitorValue.getuF());
                    }

                    textCap.setText(c + " uF");
                }

                if (rnF.isSelected()) {
                    textCap.setText(String.valueOf(capacitorValue.getnF()) + " nF");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe capacitor", "Error", JOptionPane.WARNING_MESSAGE);
                editCap.setText("");
                textCap.setText("-");
            }

        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Sólo digitos", "Error", JOptionPane.WARNING_MESSAGE);
            editCap.setText("");
            textCap.setText("-");
        }

    }//GEN-LAST:event_editCapActionPerformed

    private void rpFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpFActionPerformed
        editCapActionPerformed(evt);
    }//GEN-LAST:event_rpFActionPerformed

    private void ruFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruFActionPerformed
        editCapActionPerformed(evt);
    }//GEN-LAST:event_ruFActionPerformed

    private void rnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnFActionPerformed
        editCapActionPerformed(evt);
    }//GEN-LAST:event_rnFActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Simbolo(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Lista(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new AcercaDe(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(CapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField editCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButton rnF;
    private javax.swing.JRadioButton rpF;
    private javax.swing.JRadioButton ruF;
    private javax.swing.JTextField textCap;
    // End of variables declaration//GEN-END:variables
}
