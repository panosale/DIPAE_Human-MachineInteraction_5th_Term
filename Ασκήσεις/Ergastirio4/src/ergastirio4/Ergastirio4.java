/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ergastirio4;

import java.util.Hashtable;
import javax.swing.JLabel;

/**
 *
 * @author Panagiotis
 */
public class Ergastirio4 extends javax.swing.JFrame {

    /**
     * Creates new form Ergastirio4
     */
    public Ergastirio4() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        btngrp_1 = new javax.swing.ButtonGroup();
        lbl_Bass = new javax.swing.JLabel();
        lbl_Midrange = new javax.swing.JLabel();
        lbl_Tremble = new javax.swing.JLabel();
        lbl_Balance = new javax.swing.JLabel();
        lbl_Volume = new javax.swing.JLabel();
        lbl_Info = new javax.swing.JLabel();
        sldr_Bass = new javax.swing.JSlider();
        sldr_Tremble = new javax.swing.JSlider();
        sldr_Balance = new javax.swing.JSlider();
        sldr_Volume = new javax.swing.JSlider();
        sldr_Midrange = new javax.swing.JSlider();
        rdbtn_M0 = new javax.swing.JRadioButton();
        rdbtn_M1 = new javax.swing.JRadioButton();
        rdbtn_M2 = new javax.swing.JRadioButton();
        btn_Store = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Audio Player");
        setLocation(new java.awt.Point(500, 400));
        setLocationByPlatform(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbl_Bass.setText("Bass");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(lbl_Bass, gridBagConstraints);

        lbl_Midrange.setText("Midrange");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(lbl_Midrange, gridBagConstraints);

        lbl_Tremble.setText("Tremble");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(lbl_Tremble, gridBagConstraints);

        lbl_Balance.setText("Balance");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(lbl_Balance, gridBagConstraints);

        lbl_Volume.setText("Volume");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(lbl_Volume, gridBagConstraints);

        lbl_Info.setText("Bass: 0");
        lbl_Info.setPreferredSize(new java.awt.Dimension(30, 35));
        lbl_Info.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        getContentPane().add(lbl_Info, gridBagConstraints);

        sldr_Bass.setMajorTickSpacing(2);
        sldr_Bass.setMaximum(10);
        sldr_Bass.setMinimum(-10);
        sldr_Bass.setMinorTickSpacing(1);
        sldr_Bass.setPaintLabels(true);
        sldr_Bass.setPaintTicks(true);
        sldr_Bass.setValue(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(sldr_Bass, gridBagConstraints);

        sldr_Tremble.setMajorTickSpacing(2);
        sldr_Tremble.setMaximum(10);
        sldr_Tremble.setMinimum(-10);
        sldr_Tremble.setPaintLabels(true);
        sldr_Tremble.setPaintTicks(true);
        sldr_Tremble.setValue(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(sldr_Tremble, gridBagConstraints);

        table.put(new Integer(0), new JLabel("Center"));
        table.put(new Integer(-5), new JLabel("L"));
        table.put(new Integer(5), new JLabel("R"));
        sldr_Balance.setLabelTable(table);
        sldr_Balance.setMajorTickSpacing(2);
        sldr_Balance.setMaximum(5);
        sldr_Balance.setMinimum(-5);
        sldr_Balance.setMinorTickSpacing(1);
        sldr_Balance.setPaintLabels(true);
        sldr_Balance.setPaintTicks(true);
        sldr_Balance.setValue(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(sldr_Balance, gridBagConstraints);

        sldr_Volume.setMajorTickSpacing(1);
        sldr_Volume.setMaximum(10);
        sldr_Volume.setPaintLabels(true);
        sldr_Volume.setPaintTicks(true);
        sldr_Volume.setValue(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(sldr_Volume, gridBagConstraints);

        sldr_Midrange.setMajorTickSpacing(2);
        sldr_Midrange.setMaximum(10);
        sldr_Midrange.setMinimum(-10);
        sldr_Midrange.setMinorTickSpacing(1);
        sldr_Midrange.setPaintLabels(true);
        sldr_Midrange.setPaintTicks(true);
        sldr_Midrange.setValue(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(sldr_Midrange, gridBagConstraints);

        btngrp_1.add(rdbtn_M0);
        rdbtn_M0.setSelected(true);
        rdbtn_M0.setText("M0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(rdbtn_M0, gridBagConstraints);

        btngrp_1.add(rdbtn_M1);
        rdbtn_M1.setText("M1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(rdbtn_M1, gridBagConstraints);

        btngrp_1.add(rdbtn_M2);
        rdbtn_M2.setText("M2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        getContentPane().add(rdbtn_M2, gridBagConstraints);

        btn_Store.setText("Store");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        getContentPane().add(btn_Store, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ergastirio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ergastirio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ergastirio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ergastirio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ergastirio4().setVisible(true);
            }
        });
    }
    
    Hashtable table = new Hashtable();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Store;
    private javax.swing.ButtonGroup btngrp_1;
    private javax.swing.JLabel lbl_Balance;
    private javax.swing.JLabel lbl_Bass;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_Midrange;
    private javax.swing.JLabel lbl_Tremble;
    private javax.swing.JLabel lbl_Volume;
    private javax.swing.JRadioButton rdbtn_M0;
    private javax.swing.JRadioButton rdbtn_M1;
    private javax.swing.JRadioButton rdbtn_M2;
    private javax.swing.JSlider sldr_Balance;
    private javax.swing.JSlider sldr_Bass;
    private javax.swing.JSlider sldr_Midrange;
    private javax.swing.JSlider sldr_Tremble;
    private javax.swing.JSlider sldr_Volume;
    // End of variables declaration//GEN-END:variables
}
