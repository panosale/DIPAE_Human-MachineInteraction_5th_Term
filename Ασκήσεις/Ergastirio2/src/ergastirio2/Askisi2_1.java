/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ergastirio2;

/**
 *
 * @author Panagiotis
 */
public class Askisi2_1 extends javax.swing.JFrame {

    /**
     * Creates new form Askisi2_1
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Askisi2_1() {
        initComponents();
        getRootPane().setDefaultButton(btn_Equal);
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

        txtfld_CalcBox = new javax.swing.JTextField();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_Power = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_Plus = new javax.swing.JButton();
        btn_Minus = new javax.swing.JButton();
        btn_Multiply = new javax.swing.JButton();
        btn_Division = new javax.swing.JButton();
        btn_Equal = new javax.swing.JButton();
        btn_Dot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 300));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        txtfld_CalcBox.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfld_CalcBox.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfld_CalcBox.setEnabled(false);
        txtfld_CalcBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfld_CalcBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(txtfld_CalcBox, gridBagConstraints);

        btn_1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.setEnabled(false);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_1, gridBagConstraints);

        btn_2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.setEnabled(false);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_2, gridBagConstraints);

        btn_3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.setEnabled(false);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(btn_3, gridBagConstraints);

        btn_4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.setEnabled(false);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_4, gridBagConstraints);

        btn_5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.setEnabled(false);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_5, gridBagConstraints);

        btn_6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.setEnabled(false);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        getContentPane().add(btn_6, gridBagConstraints);

        btn_7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.setEnabled(false);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_7, gridBagConstraints);

        btn_8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.setEnabled(false);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_8, gridBagConstraints);

        btn_Power.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Power.setForeground(new java.awt.Color(255, 51, 51));
        btn_Power.setText("POWER");
        btn_Power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PowerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btn_Power, gridBagConstraints);

        btn_0.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_0.setText("0");
        btn_0.setEnabled(false);
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_0, gridBagConstraints);

        btn_9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.setEnabled(false);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        getContentPane().add(btn_9, gridBagConstraints);

        btn_C.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_C.setForeground(new java.awt.Color(255, 51, 51));
        btn_C.setText("C");
        btn_C.setEnabled(false);
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        getContentPane().add(btn_C, gridBagConstraints);

        btn_Plus.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Plus.setForeground(new java.awt.Color(255, 51, 51));
        btn_Plus.setText("+");
        btn_Plus.setEnabled(false);
        btn_Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PlusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        getContentPane().add(btn_Plus, gridBagConstraints);

        btn_Minus.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Minus.setForeground(new java.awt.Color(255, 51, 51));
        btn_Minus.setText("-");
        btn_Minus.setEnabled(false);
        btn_Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        getContentPane().add(btn_Minus, gridBagConstraints);

        btn_Multiply.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Multiply.setForeground(new java.awt.Color(255, 51, 51));
        btn_Multiply.setText("*");
        btn_Multiply.setEnabled(false);
        btn_Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        getContentPane().add(btn_Multiply, gridBagConstraints);

        btn_Division.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Division.setForeground(new java.awt.Color(255, 51, 51));
        btn_Division.setText("/");
        btn_Division.setEnabled(false);
        btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        getContentPane().add(btn_Division, gridBagConstraints);

        btn_Equal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Equal.setForeground(new java.awt.Color(255, 51, 51));
        btn_Equal.setText("=");
        btn_Equal.setEnabled(false);
        btn_Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EqualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_Equal, gridBagConstraints);

        btn_Dot.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Dot.setForeground(new java.awt.Color(255, 51, 51));
        btn_Dot.setText(".");
        btn_Dot.setEnabled(false);
        btn_Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DotActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(btn_Dot, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNumber2CalcBox(int num) {
//        if (signPressed != 0) {
//            txtfld_CalcBox.setText("");
//        }
        txtfld_CalcBox.setText(txtfld_CalcBox.getText() + num);        
    }
    private void action2Perform(short actionID, String num) {
        if (tmpNumber1 == 0 && !txtfld_CalcBox.getText().isEmpty()) {
            tmpNumber1 = Double.valueOf(num);
            switch (actionID) {
                    case 1 -> { 
                        txtfld_CalcBox.setText("+");
                        signPressed = 1;
                }
                    case 2 -> { 
                        txtfld_CalcBox.setText("-");
                        signPressed = 2;
                }
                    case 3 -> {
                        txtfld_CalcBox.setText("*");
                        signPressed = 3;
                }
                    case 4 -> {
                        txtfld_CalcBox.setText("/");
                        signPressed = 4;
                }
            }
        }
        else {
            if (signPressed != 0) {
                tmpNumber2 = Double.valueOf(txtfld_CalcBox.getText());
                switch (signPressed) {
                        case 1: 
                            txtfld_CalcBox.setText(String.valueOf(tmpNumber1 + tmpNumber2));
                            break;
                        case 2: 
                            txtfld_CalcBox.setText(String.valueOf(tmpNumber1 - tmpNumber2));
                            break;
                        case 3:
                            txtfld_CalcBox.setText(String.valueOf(tmpNumber1 * tmpNumber2));
                            break;
                        case 4: if (tmpNumber2 == 0) {
                                    txtfld_CalcBox.setText("Div by zero!");
                        }
                                else
                                    txtfld_CalcBox.setText(String.valueOf(tmpNumber1 / tmpNumber2));
                            break;
                }
                tmpNumber1 = tmpNumber2 = 0;
            }
        }
    }
    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(1);
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(2);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(4);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(5);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(7);
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(8);
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_PowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PowerActionPerformed
        // TODO add your handling code here:
        txtfld_CalcBox.setEnabled(!txtfld_CalcBox.isEnabled());
        btn_0.setEnabled(!btn_0.isEnabled());
        btn_1.setEnabled(!btn_1.isEnabled());
        btn_2.setEnabled(!btn_2.isEnabled());
        btn_3.setEnabled(!btn_3.isEnabled());
        btn_4.setEnabled(!btn_4.isEnabled());
        btn_5.setEnabled(!btn_5.isEnabled());
        btn_6.setEnabled(!btn_6.isEnabled());
        btn_7.setEnabled(!btn_7.isEnabled());
        btn_8.setEnabled(!btn_8.isEnabled());
        btn_9.setEnabled(!btn_9.isEnabled());
        btn_C.setEnabled(!btn_C.isEnabled());
        btn_Plus.setEnabled(!btn_Plus.isEnabled());
        btn_Minus.setEnabled(!btn_Minus.isEnabled());
        btn_Multiply.setEnabled(!btn_Multiply.isEnabled());
        btn_Division.setEnabled(!btn_Division.isEnabled());
        btn_Dot.setEnabled(!btn_Dot.isEnabled());
        btn_Equal.setEnabled(!btn_Equal.isEnabled());
//        buttonsState = !buttonsState;
//        txtfld_CalcBox.setEnabled(buttonsState);
//        btn_0.setEnabled(buttonsState);
//        btn_1.setEnabled(buttonsState);
//        btn_2.setEnabled(buttonsState);
//        btn_3.setEnabled(buttonsState);
//        btn_4.setEnabled(buttonsState);
//        btn_5.setEnabled(buttonsState);
//        btn_6.setEnabled(buttonsState);
//        btn_7.setEnabled(buttonsState);
//        btn_8.setEnabled(buttonsState);
//        btn_9.setEnabled(buttonsState);
//        btn_C.setEnabled(buttonsState);
//        btn_Plus.setEnabled(buttonsState);
//        btn_Minus.setEnabled(buttonsState);
//        btn_Multiply.setEnabled(buttonsState);
//        btn_Division.setEnabled(buttonsState);
//        btn_Equal.setEnabled(buttonsState);
//        btn_Dot.setEnabled(buttonsState);
//        if (!buttonsState) {
//            dotAdded = false;
//            txtfld_CalcBox.setText("");
//        }
    }//GEN-LAST:event_btn_PowerActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(0);
    }//GEN-LAST:event_btn_0ActionPerformed

    private void txtfld_CalcBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfld_CalcBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfld_CalcBoxActionPerformed

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        // TODO add your handling code here:
//        buttonsState = false;
        dotAdded = false;
        tmpNumber1 = 0;
        tmpNumber2 = 0;
        tmpResult = 0;
        txtfld_CalcBox.setText("");
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn_PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PlusActionPerformed
        // TODO add your handling code here:
//        action2Perform((short)1, txtfld_CalcBox.getText());
        signPressed = 1;
        tmpNumber1 = Double.parseDouble(txtfld_CalcBox.getText());
        txtfld_CalcBox.setText("");
        dotAdded = false;
    }//GEN-LAST:event_btn_PlusActionPerformed

    private void btn_MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinusActionPerformed
        // TODO add your handling code here:
//        action2Perform((short)2, txtfld_CalcBox.getText());
        signPressed = 2;
        tmpNumber1 = Double.parseDouble(txtfld_CalcBox.getText());
        txtfld_CalcBox.setText("");
        dotAdded = false;
    }//GEN-LAST:event_btn_MinusActionPerformed

    private void btn_MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplyActionPerformed
        // TODO add your handling code here:
//        action2Perform((short)3, txtfld_CalcBox.getText());
        signPressed = 3;
        tmpNumber1 = Double.parseDouble(txtfld_CalcBox.getText());
        txtfld_CalcBox.setText("");
        dotAdded = false;
    }//GEN-LAST:event_btn_MultiplyActionPerformed

    private void btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisionActionPerformed
        // TODO add your handling code here:
//        action2Perform((short)4, txtfld_CalcBox.getText());
        signPressed = 4;
        tmpNumber1 = Double.parseDouble(txtfld_CalcBox.getText());
        txtfld_CalcBox.setText("");
        dotAdded = false;
    }//GEN-LAST:event_btn_DivisionActionPerformed

    private void btn_DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DotActionPerformed
        // TODO add your handling code here:
        if (!dotAdded) {
            txtfld_CalcBox.setText(txtfld_CalcBox.getText() + ".");
            dotAdded = true;
        }
            
    }//GEN-LAST:event_btn_DotActionPerformed

    private void btn_EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EqualActionPerformed
        // TODO add your handling code here:
        String tmpStr = txtfld_CalcBox.getText();
        if (tmpStr.isEmpty()) {
            if (tmpNumber1 != 0)
                txtfld_CalcBox.setText(String.valueOf(tmpNumber1));
            else
                if (tmpNumber1 == 0)
                    txtfld_CalcBox.setText("0.0");
        }
        else {
            tmpNumber2 = Double.valueOf(tmpStr);
            switch (signPressed) {
                case 1: tmpResult = tmpNumber1 + tmpNumber2;
                    txtfld_CalcBox.setText(String.valueOf(tmpResult));
                    break;
                case 2: tmpResult = tmpNumber1 - tmpNumber2;
                    txtfld_CalcBox.setText(String.valueOf(tmpResult));
                    break;
                case 3: tmpResult = tmpNumber1 * tmpNumber2;
                    txtfld_CalcBox.setText(String.valueOf(tmpResult));
                    break;
                case 4: if (tmpNumber2 == 0)
                            txtfld_CalcBox.setText("Dev by zero!");
                        else {
                            tmpResult = tmpNumber1 / tmpNumber2;
                            txtfld_CalcBox.setText(String.valueOf(tmpResult));
                        }
                    break;
            }
        }
//            action2Perform((short)5, txtfld_CalcBox.getText());
//            return;
//        txtfld_CalcBox.setText("0");
    }//GEN-LAST:event_btn_EqualActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(9);
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(6);
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        addNumber2CalcBox(3);
    }//GEN-LAST:event_btn_3ActionPerformed

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
            java.util.logging.Logger.getLogger(Askisi2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Askisi2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Askisi2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Askisi2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Askisi2_1().setVisible(true);
            }
        });
    }
//    boolean buttonsState = false;
    boolean dotAdded = false;
    double tmpNumber1, tmpNumber2, tmpResult = 0;
    byte signPressed = 0; // 1 = Plus, 2 = Minus, 3 = Times, 4 = Div
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_Division;
    private javax.swing.JButton btn_Dot;
    private javax.swing.JButton btn_Equal;
    private javax.swing.JButton btn_Minus;
    private javax.swing.JButton btn_Multiply;
    private javax.swing.JButton btn_Plus;
    private javax.swing.JButton btn_Power;
    private javax.swing.JTextField txtfld_CalcBox;
    // End of variables declaration//GEN-END:variables
}
