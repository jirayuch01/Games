package Anonymous.Guessing;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

public class GuessingGame extends javax.swing.JPanel {

    int number;
    int time;
    
    public GuessingGame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblAnswer = new javax.swing.JLabel();
        tfAnswer = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        tfResult = new javax.swing.JTextField();
        btnRandom = new javax.swing.JButton();
        lblbg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 400));
        setLayout(null);
        add(lblTitle);
        lblTitle.setBounds(140, 10, 0, 0);

        lblAnswer.setFont(new java.awt.Font("EQ Feel Good", 0, 18)); // NOI18N
        lblAnswer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/image/question.png"))); // NOI18N
        add(lblAnswer);
        lblAnswer.setBounds(0, 0, 500, 170);

        tfAnswer.setToolTipText("");
        tfAnswer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnswerActionPerformed(evt);
            }
        });
        tfAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAnswerKeyTyped(evt);
            }
        });
        add(tfAnswer);
        tfAnswer.setBounds(90, 180, 180, 40);

        btnOk.setBackground(new java.awt.Color(0, 0, 0));
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("OK");
        btnOk.setBorder(null);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        btnOk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOkKeyPressed(evt);
            }
        });
        add(btnOk);
        btnOk.setBounds(310, 180, 90, 40);

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.setBorder(null);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset);
        btnReset.setBounds(310, 230, 90, 40);

        lblResult.setFont(new java.awt.Font("EQ Feel Good", 0, 18)); // NOI18N
        lblResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/image/result.png"))); // NOI18N
        add(lblResult);
        lblResult.setBounds(30, 300, 220, 40);

        tfResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfResultActionPerformed(evt);
            }
        });
        add(tfResult);
        tfResult.setBounds(250, 300, 200, 40);

        btnRandom.setBackground(new java.awt.Color(0, 0, 0));
        btnRandom.setForeground(new java.awt.Color(255, 255, 255));
        btnRandom.setText("RANDOM");
        btnRandom.setBorder(null);
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });
        add(btnRandom);
        btnRandom.setBounds(180, 230, 90, 40);

        lblbg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/image/d-splatter-bg-1.jpg"))); // NOI18N
        add(lblbg);
        lblbg.setBounds(0, 0, 500, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void tfAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnswerActionPerformed

    }//GEN-LAST:event_tfAnswerActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       tfAnswer.setText("");
       tfResult.setText("");
       time = 0;
       tfAnswer.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        
        number = (int) (Math.random() * 21);
        JOptionPane.showMessageDialog(null, "Already change number");
        tfResult.setText("");
        tfAnswer.setText("");
        tfAnswer.requestFocus();
        time = 0;
    }//GEN-LAST:event_btnRandomActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try{
        String n = tfAnswer.getText();
        int answer = Integer.parseInt(n);
        time++;

        if (answer == number) {
            if(answer == 1){
            tfResult.setText("Number is " + number + ": press " + time + " times");   
            }
        tfResult.setText("Number is " + number + " press " + time + " times");
        }

        if (answer > number) {
            tfResult.setText("Your guess is high");
            JOptionPane.showMessageDialog(null, " try again");
            tfResult.setText("");
        }

        if (answer < number) {
            tfResult.setText("Your guess is low");
            JOptionPane.showMessageDialog(null, " try again");
            tfResult.setText("");
        }
        tfAnswer.requestFocus();
        tfAnswer.setText("");
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnOkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOkKeyPressed
        try {
        String n = tfAnswer.getText();
        int answer = Integer.parseInt(n);
        time++;
        if (answer == number) {
            if(answer == 1){
            tfResult.setText("Number is " + number + ": press " + time + " times");   
            }
        tfResult.setText("Number is " + number + " press " + time + " times");
        }

        if (answer > number) {
            tfResult.setText("Your guess is high");
            JOptionPane.showMessageDialog(null, " try again");
            tfResult.setText("");
        }

        if (answer > number) {
            tfResult.setText("Your guess is low");
            JOptionPane.showMessageDialog(null, " try again");
            tfResult.setText("");
        }
        tfAnswer.requestFocus();
        tfAnswer.setText("");
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_btnOkKeyPressed

    private void tfResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfResultActionPerformed
       
    }//GEN-LAST:event_tfResultActionPerformed

    private void tfAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAnswerKeyTyped
        char word = evt.getKeyChar();
        if (!(Character.isDigit(word))
                || (word == KeyEvent.VK_BACKSPACE)
                || (word == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tfAnswerKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblbg;
    private javax.swing.JTextField tfAnswer;
    private javax.swing.JTextField tfResult;
    // End of variables declaration//GEN-END:variables

   
    
}
