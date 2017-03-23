package Anonymous.MiniMath;

import javax.swing.JOptionPane;

public class MiniMath extends javax.swing.JPanel {
    String textQuestion = "";
    String textOutput = "";
    int sum = 0;
      
    String operator = "";
    int getScore = 0;

    public MiniMath() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        keyStart = new javax.swing.JButton();
        keyReset = new javax.swing.JButton();
        key1 = new javax.swing.JButton();
        key2 = new javax.swing.JButton();
        key3 = new javax.swing.JButton();
        key4 = new javax.swing.JButton();
        key5 = new javax.swing.JButton();
        key6 = new javax.swing.JButton();
        key7 = new javax.swing.JButton();
        key8 = new javax.swing.JButton();
        key9 = new javax.swing.JButton();
        key0 = new javax.swing.JButton();
        keyMinus = new javax.swing.JButton();
        keyOk = new javax.swing.JButton();
        keyCe = new javax.swing.JButton();
        keyDel = new javax.swing.JButton();
        showQuestion = new javax.swing.JLabel();
        showOutput = new javax.swing.JLabel();
        showScore = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        key00 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        keyStart.setBackground(new java.awt.Color(204, 0, 0));
        keyStart.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        keyStart.setText("Start");
        keyStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyStartActionPerformed(evt);
            }
        });

        keyReset.setBackground(new java.awt.Color(204, 0, 0));
        keyReset.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        keyReset.setText("Reset");
        keyReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyResetActionPerformed(evt);
            }
        });

        key1.setBackground(new java.awt.Color(51, 102, 255));
        key1.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key1.setText("1");
        key1.setPreferredSize(new java.awt.Dimension(55, 23));
        key1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key1ActionPerformed(evt);
            }
        });

        key2.setBackground(new java.awt.Color(51, 102, 255));
        key2.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key2.setText("2");
        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });

        key3.setBackground(new java.awt.Color(51, 102, 255));
        key3.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key3.setText("3");
        key3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key3ActionPerformed(evt);
            }
        });

        key4.setBackground(new java.awt.Color(51, 102, 255));
        key4.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key4.setText("4");
        key4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key4ActionPerformed(evt);
            }
        });

        key5.setBackground(new java.awt.Color(51, 102, 255));
        key5.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key5.setText("5");
        key5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key5ActionPerformed(evt);
            }
        });

        key6.setBackground(new java.awt.Color(51, 102, 255));
        key6.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key6.setText("6");
        key6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key6ActionPerformed(evt);
            }
        });

        key7.setBackground(new java.awt.Color(51, 102, 255));
        key7.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key7.setText("7");
        key7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key7ActionPerformed(evt);
            }
        });

        key8.setBackground(new java.awt.Color(51, 102, 255));
        key8.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key8.setText("8");
        key8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key8ActionPerformed(evt);
            }
        });

        key9.setBackground(new java.awt.Color(51, 102, 255));
        key9.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key9.setText("9");
        key9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key9ActionPerformed(evt);
            }
        });

        key0.setBackground(new java.awt.Color(51, 102, 255));
        key0.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        key0.setText("0");
        key0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key0ActionPerformed(evt);
            }
        });

        keyMinus.setBackground(new java.awt.Color(51, 102, 255));
        keyMinus.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        keyMinus.setText("-");
        keyMinus.setPreferredSize(new java.awt.Dimension(37, 23));
        keyMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyMinusActionPerformed(evt);
            }
        });

        keyOk.setBackground(new java.awt.Color(204, 0, 0));
        keyOk.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        keyOk.setText("OK");
        keyOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyOkActionPerformed(evt);
            }
        });

        keyCe.setBackground(new java.awt.Color(204, 0, 0));
        keyCe.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        keyCe.setText("CE.");
        keyCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyCeActionPerformed(evt);
            }
        });

        keyDel.setBackground(new java.awt.Color(204, 0, 0));
        keyDel.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        keyDel.setText("Del.");
        keyDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyDelActionPerformed(evt);
            }
        });

        showQuestion.setBackground(new java.awt.Color(255, 255, 255));
        showQuestion.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        showQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showQuestion.setText("0");
        showQuestion.setBorder(new javax.swing.border.MatteBorder(null));
        showQuestion.setOpaque(true);

        showOutput.setBackground(new java.awt.Color(255, 255, 255));
        showOutput.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        showOutput.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showOutput.setBorder(new javax.swing.border.MatteBorder(null));
        showOutput.setOpaque(true);

        showScore.setBackground(new java.awt.Color(255, 255, 255));
        showScore.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        showScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showScore.setText("0");
        showScore.setBorder(new javax.swing.border.MatteBorder(null));
        showScore.setOpaque(true);

        question.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question.setText("Question");

        score.setFont(new java.awt.Font("Akbar", 0, 24)); // NOI18N
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("Score");

        key00.setBackground(new java.awt.Color(51, 102, 255));
        key00.setFont(new java.awt.Font("Akbar", 0, 20)); // NOI18N
        key00.setText("00");
        key00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key00ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(keyStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keyReset))
                    .addComponent(showScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(keyDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keyCe)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(key4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(key7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(key9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(key00, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(keyMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(keyOk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyReset, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyStart, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showScore, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(key0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(keyMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(key00, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keyOk, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyCe, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(keyDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void keyStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyStartActionPerformed
        int number1 = (int) (Math.random() * 11);
        int number2 = (int) (Math.random() * 11);
        int number3 = (int) (Math.random() * 4);

        if (number3 == 0){
            sum = number1+number2;
            textQuestion = (number1 + "+" + number2);
        }
        else if (number3 == 1){
            sum = number1-number2;
            textQuestion = (number1 + "-" + number2);
        }
        else if (number3 == 2){
            sum = number1*number2;
            textQuestion = (number1 + "*" + number2);
        }
        else if (number3 == 3){
            sum = number1%number2;
            textQuestion = ( number1 + "%" +number2);
        }
        showQuestion.setText(textQuestion);
        showOutput.setText(textOutput = "");
        keyStart.setEnabled(false);
    }//GEN-LAST:event_keyStartActionPerformed

    private void keyResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyResetActionPerformed
        showQuestion.setText(textQuestion = "");
        String gotScore = String.valueOf(getScore = 0);
        showScore.setText(gotScore = "0");
        showOutput.setText(textOutput = "");
        keyStart.setEnabled(true);
    }//GEN-LAST:event_keyResetActionPerformed

    private void key1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key1ActionPerformed
        showOutput.setText(textOutput += key1.getText());
    }//GEN-LAST:event_key1ActionPerformed

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        showOutput.setText(textOutput += key2.getText());
    }//GEN-LAST:event_key2ActionPerformed

    private void key3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key3ActionPerformed
        showOutput.setText(textOutput += key3.getText());
    }//GEN-LAST:event_key3ActionPerformed

    private void key4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key4ActionPerformed
        showOutput.setText(textOutput += key4.getText());
    }//GEN-LAST:event_key4ActionPerformed

    private void key5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key5ActionPerformed
        showOutput.setText(textOutput += key5.getText());
    }//GEN-LAST:event_key5ActionPerformed

    private void key6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key6ActionPerformed
        showOutput.setText(textOutput += key6.getText());
    }//GEN-LAST:event_key6ActionPerformed

    private void key7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key7ActionPerformed
        showOutput.setText(textOutput += key7.getText());
    }//GEN-LAST:event_key7ActionPerformed

    private void key8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key8ActionPerformed
        showOutput.setText(textOutput += key8.getText());
    }//GEN-LAST:event_key8ActionPerformed

    private void key9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key9ActionPerformed
        showOutput.setText(textOutput += key9.getText());
    }//GEN-LAST:event_key9ActionPerformed

    private void key0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key0ActionPerformed
        showOutput.setText(textOutput += key0.getText());
    }//GEN-LAST:event_key0ActionPerformed

    private void keyMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyMinusActionPerformed
        showOutput.setText(textOutput += keyMinus.getText());
    }//GEN-LAST:event_keyMinusActionPerformed

    private void keyOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyOkActionPerformed
        try {
            String calculate = showOutput.getText();
              int answer = Integer.parseInt(calculate);
            if (answer == sum) {
                int number1 = (int) (Math.random() * 11);
                int number2 = (int) (Math.random() * 11);
                int number3 = (int) (Math.random() * 4);

            if (number3 == 0){
                sum = number1+number2;
                textQuestion = (number1 + "+" + number2);
            }
            else if (number3 == 1){
            sum = number1-number2;
            textQuestion = (number1 + "-" + number2);
            }
            else if (number3 == 2){
            sum = number1*number2;
            textQuestion = (number1 + "*" + number2);
        }
        else if (number3 == 3){
            sum = number1%number2;
            textQuestion = ( number1 + "%" +number2);
        }
        showQuestion.setText(textQuestion);
        showOutput.setText(textOutput = "");
        
        getScore++;
        if(getScore == 10){
                    JOptionPane.showMessageDialog(null, "   You win  !!");
                    getScore = 0;
                    showQuestion.setText(textQuestion = "");
                    showOutput.setText(textOutput = "");
                }    
                showScore.setText("" + getScore);
            } else if (answer != sum) {
                getScore = getScore - 1;
                showScore.setText("" + getScore);
                
                int number1 = (int) (Math.random() * 11);
                int number2 = (int) (Math.random() * 11);
                int number3 = (int) (Math.random() * 4);

            if (number3 == 0){
                sum = number1+number2;
                textQuestion = (number1 + "+" + number2);
            }
            else if (number3 == 1){
            sum = number1-number2;
            textQuestion = (number1 + "-" + number2);
            }
            else if (number3 == 2){
            sum = number1*number2;
            textQuestion = (number1 + "*" + number2);
        }
        else if (number3 == 3){
            sum = number1%number2;
            textQuestion = ( number1 + "%" +number2);
        }
        showQuestion.setText(textQuestion);
        showOutput.setText(textOutput = "");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_keyOkActionPerformed

    private void keyCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyCeActionPerformed
        showOutput.setText(textOutput = "");
    }//GEN-LAST:event_keyCeActionPerformed

    private void keyDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyDelActionPerformed
        try {
            showOutput.setText(textOutput = textOutput.substring(0, textOutput.length() - 1));
        } catch (Exception e) {
            showOutput.setText("0");
        }
    }//GEN-LAST:event_keyDelActionPerformed

    private void key00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key00ActionPerformed
    showOutput.setText(textOutput += key00.getText());
    }//GEN-LAST:event_key00ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton key0;
    private javax.swing.JButton key00;
    private javax.swing.JButton key1;
    private javax.swing.JButton key2;
    private javax.swing.JButton key3;
    private javax.swing.JButton key4;
    private javax.swing.JButton key5;
    private javax.swing.JButton key6;
    private javax.swing.JButton key7;
    private javax.swing.JButton key8;
    private javax.swing.JButton key9;
    private javax.swing.JButton keyCe;
    private javax.swing.JButton keyDel;
    private javax.swing.JButton keyMinus;
    private javax.swing.JButton keyOk;
    private javax.swing.JButton keyReset;
    private javax.swing.JButton keyStart;
    private javax.swing.JLabel question;
    private javax.swing.JLabel score;
    private javax.swing.JLabel showOutput;
    private javax.swing.JLabel showQuestion;
    private javax.swing.JLabel showScore;
    // End of variables declaration//GEN-END:variables
}
