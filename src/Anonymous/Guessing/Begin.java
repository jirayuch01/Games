package Anonymous.Guessing;

public class Begin extends javax.swing.JFrame {
  int number;
  public Begin() {
    initComponents();
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        lblBg = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuNew = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        menuCredit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Guessing Game");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Guess"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/image/start.png"))); // NOI18N
        btnStart.setBorderPainted(false);
        btnStart.setContentAreaFilled(false);
        btnStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(160, 270, 200, 50);

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/image/d-splatter-bg-2.jpg"))); // NOI18N
        getContentPane().add(lblBg);
        lblBg.setBounds(0, -10, 520, 390);

        menuFile.setText("File");

        menuNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/image/dog.gif"))); // NOI18N
        menuNew.setText("New Game");
        menuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewActionPerformed(evt);
            }
        });
        menuFile.add(menuNew);

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/image/dog2.gif"))); // NOI18N
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        menuBar.add(menuFile);

        menuAbout.setText("About");

        menuCredit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/image/619383nz5vhbgygb.gif"))); // NOI18N
        menuCredit.setText("Credit");
        menuCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCreditActionPerformed(evt);
            }
        });
        menuAbout.add(menuCredit);

        menuBar.add(menuAbout);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(507, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
  private void menuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewActionPerformed
    GuessingGame guessing = new GuessingGame();
    this.setContentPane(guessing);
    this.setVisible(true);
  }//GEN-LAST:event_menuNewActionPerformed
  
  private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
    this.dispose();
  }//GEN-LAST:event_menuExitActionPerformed
  
  private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
    GuessingGame start = new GuessingGame();
    this.setContentPane(start);
    this.setVisible(true);
    
  }//GEN-LAST:event_btnStartActionPerformed
  
  private void menuCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCreditActionPerformed
    Credit about = new Credit();
    this.setContentPane(about);
    this.setVisible(true);
  }//GEN-LAST:event_menuCreditActionPerformed
  
  public static void main(String args[]) throws InstantiationException, ClassNotFoundException, IllegalAccessException {
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
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Begin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new Begin().setVisible(true);
      }
    });
  }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblBg;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuCredit;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuNew;
    // End of variables declaration//GEN-END:variables
}
