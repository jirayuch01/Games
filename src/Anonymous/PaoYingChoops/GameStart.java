package Anonymous.PaoYingChoops;

import Anonymous.FlyingBrownie.Launcher;
import Anonymous.Menu.Menu;
import Anonymous.MiniMath.MainGame;
import Anonymous.TicTacToe.TicTacToe;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GameStart extends JFrame {
  
  public GameStart() {
    initComponents();
  }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JPanel();
        BackTitle = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        Files = new javax.swing.JMenu();
        NewGames = new javax.swing.JMenuItem();
        ExitGame = new javax.swing.JMenuItem();
        MoreGames = new javax.swing.JMenu();
        HomeGame = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        CeatorGame = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pao Ying Choop Game");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        Back.setLayout(null);

        BackTitle.setBackground(new java.awt.Color(204, 255, 204));

        Title.setBackground(new java.awt.Color(255, 51, 102));
        Title.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 51, 51));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("PAO YING CHOOP");
        Title.setToolTipText("");

        javax.swing.GroupLayout BackTitleLayout = new javax.swing.GroupLayout(BackTitle);
        BackTitle.setLayout(BackTitleLayout);
        BackTitleLayout.setHorizontalGroup(
            BackTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BackTitleLayout.setVerticalGroup(
            BackTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Back.add(BackTitle);
        BackTitle.setBounds(20, 40, 360, 70);

        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/START.png"))); // NOI18N
        Start.setBorder(null);
        Start.setBorderPainted(false);
        Start.setContentAreaFilled(false);
        Start.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/START2.png"))); // NOI18N
        Start.setSelected(true);
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        Back.add(Start);
        Start.setBounds(140, 130, 110, 40);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Exit.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.setBorderPainted(false);
        Exit.setContentAreaFilled(false);
        Exit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Exit2.png"))); // NOI18N
        Exit.setSelected(true);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Back.add(Exit);
        Exit.setBounds(140, 180, 110, 40);

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/HomeGames.png"))); // NOI18N
        Home.setBorder(null);
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/HomeGames2.png"))); // NOI18N
        Home.setSelected(true);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        Back.add(Home);
        Home.setBounds(140, 230, 110, 40);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/BackGround.jpg"))); // NOI18N
        Back.add(BackGround);
        BackGround.setBounds(0, -10, 390, 328);

        MenuBar.setBackground(new java.awt.Color(0, 255, 255));
        MenuBar.setForeground(new java.awt.Color(255, 153, 153));

        Files.setBackground(new java.awt.Color(255, 204, 204));
        Files.setText("Files");

        NewGames.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        NewGames.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/IconNewGame.png"))); // NOI18N
        NewGames.setText("New Game");
        NewGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGamesActionPerformed(evt);
            }
        });
        Files.add(NewGames);

        ExitGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, 0));
        ExitGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Exit.jpg"))); // NOI18N
        ExitGame.setText("Exit Game");
        ExitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitGameActionPerformed(evt);
            }
        });
        Files.add(ExitGame);

        MenuBar.add(Files);

        MoreGames.setText("MoreGames");

        HomeGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        HomeGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/home.png"))); // NOI18N
        HomeGame.setText("Home Games");
        HomeGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeGameActionPerformed(evt);
            }
        });
        MoreGames.add(HomeGame);

        MenuBar.add(MoreGames);

        Help.setText("Help");

        CeatorGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, 0));
        CeatorGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Help.png"))); // NOI18N
        CeatorGame.setText("Ceator Game");
        CeatorGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CeatorGameActionPerformed(evt);
            }
        });
        Help.add(CeatorGame);

        MenuBar.add(Help);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(395, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
  private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    this.dispose();
  }//GEN-LAST:event_ExitActionPerformed
  
  private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
    //if (evt.isPopupTrigger()) {
    //    PopupMenu.show(this, evt.getX(), evt.getY());
    //}
  }//GEN-LAST:event_formMouseReleased
  
  private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
    this.dispose();
    Game nw = new Game();
    nw.setVisible(true);
  }//GEN-LAST:event_StartActionPerformed
  
  private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
    this.dispose();
  }//GEN-LAST:event_HomeActionPerformed
  
  private void ExitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitGameActionPerformed
    this.dispose();
  }//GEN-LAST:event_ExitGameActionPerformed
  
  private void NewGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGamesActionPerformed
    this.dispose();
    Game nw = new Game();
    nw.setVisible(true);
  }//GEN-LAST:event_NewGamesActionPerformed
  
  private void CeatorGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeatorGameActionPerformed
    JOptionPane.showMessageDialog(null, "Name : Mr.Jirayu Chinnawong "
    + "\nID : 5730211011 \nMajor : Information Technology (IT2)"
    + "\nFaculty : Technology and Environment (TE)");
  }//GEN-LAST:event_CeatorGameActionPerformed
  
  private void HomeGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeGameActionPerformed
    this.dispose();
  }//GEN-LAST:event_HomeGameActionPerformed
  
  public static void main(String args[]) {
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
      java.util.logging.Logger.getLogger(GameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(GameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(GameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(GameStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GameStart();
      }
    });
  }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JLabel BackGround;
    private javax.swing.JPanel BackTitle;
    private javax.swing.JMenuItem CeatorGame;
    private javax.swing.JButton Exit;
    private javax.swing.JMenuItem ExitGame;
    private javax.swing.JMenu Files;
    private javax.swing.JMenu Help;
    private javax.swing.JButton Home;
    private javax.swing.JMenuItem HomeGame;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MoreGames;
    private javax.swing.JMenuItem NewGames;
    private javax.swing.JButton Start;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
