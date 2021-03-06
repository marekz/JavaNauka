/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import javax.swing.JOptionPane;

/**
 *
 * @author mzdybel
 */
public class Calculate extends javax.swing.JFrame {

    /**
     * Creates new form Okno
     */
    public Calculate() {
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

        jTextField_ValueA = new javax.swing.JTextField();
        jTextField_ValueB = new javax.swing.JTextField();
        jComboBox_Options = new javax.swing.JComboBox<>();
        jButton_Calculate = new javax.swing.JButton();
        jTextField_Result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField_ValueA.setToolTipText("Value A");

        jTextField_ValueB.setToolTipText("Value B");
        jTextField_ValueB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ValueBActionPerformed(evt);
            }
        });

        jComboBox_Options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));

        jButton_Calculate.setText("Calculate");
        jButton_Calculate.setToolTipText("Calculate BTN");
        jButton_Calculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CalculateMouseClicked(evt);
            }
        });

        jTextField_Result.setToolTipText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Result))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_ValueA, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_Options, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ValueB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ValueA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ValueB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Calculate)
                    .addComponent(jTextField_Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ValueBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ValueBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ValueBActionPerformed

    private void jButton_CalculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CalculateMouseClicked
        // TODO add your handling code here:
        
        double ValueA = 0;
        double ValueB = 0;
        
        
        
        System.out.println("Test Marek 1234");
        try {
            if(!jTextField_ValueA.getText().isEmpty()){
                ValueA = Double.parseDouble(jTextField_ValueA.getText());
            }
            if(!jTextField_ValueB.getText().isEmpty()){
                ValueB = Double.parseDouble(jTextField_ValueB.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Niepoprawny format liczby", 
                    "Błąd", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String selectOperation = (String) jComboBox_Options.getSelectedItem();
        
        OperationClass OperationClass = OperationClass.generate(selectOperation, ValueA, ValueB);
        
        double result = ValueA + ValueB;

        jTextField_Result.setText("" + operation);
    }//GEN-LAST:event_jButton_CalculateMouseClicked

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
                System.out.println("Kolejny styl: " + info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Calculate;
    private javax.swing.JComboBox<String> jComboBox_Options;
    private javax.swing.JTextField jTextField_Result;
    private javax.swing.JTextField jTextField_ValueA;
    private javax.swing.JTextField jTextField_ValueB;
    // End of variables declaration//GEN-END:variables
}
