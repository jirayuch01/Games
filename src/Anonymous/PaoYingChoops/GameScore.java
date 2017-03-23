package Anonymous.PaoYingChoops;

import Anonymous.FlyingBrownie.Launcher;
import Anonymous.Menu.Menu;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class GameScore extends javax.swing.JFrame {
  
  String filePath;
  
  public GameScore() {
    initComponents();
    showScore();
    String dir = "user.dir";
    filePath = dir + File.separator + "src";
  }
  
  public void showScore() {
    DefaultTableModel df = new DefaultTableModel() {
      @Override
      public boolean isCellEditable(int row,
      int column) {
        return false;
      }
    };
    String[] columnNames = {"Name", "Score"};
    tbScore.setModel(df);
    tbScore.setRowHeight(35);
    JTableHeader header = tbScore.getTableHeader();
    header.setFont(new Font("TH Krub", Font.BOLD, 24));
    df.setColumnIdentifiers(columnNames);
    String fileName = "";
    String dataFile;
    String[] data;
    ArrayList<Score> topTen = new ArrayList<Score>();
    Score score;
    try {
      fileName = new File(System.getProperty("user.dir")).getCanonicalPath();
    } catch (IOException e1) {
      //System.out.println("ERROR");
    }
    fileName = fileName + File.separator + "src"
    + File.separator + "Anonymous/PaoYingChoops/score.dat";
    try {
      BufferedReader reader = new BufferedReader(
      new FileReader(fileName));
      while ((dataFile = reader.readLine()) != null) {
        data = dataFile.split(";");
        
        score = new Score(data[0], Integer.parseInt(data[1]));
        topTen.add(score);
      }
    } catch (IOException e) {
      //System.out.println("ERROR: reading file");
    }
    Comparator<Score> com = new Comparator<Score>() {
      public int compare(Score o1, Score o2) {
        return ((Integer) o1.getScore()).compareTo(
        (Integer) o2.getScore());
      }
    };
    Collections.sort(topTen, com);
    Collections.reverse(topTen);
    int cnt = 0;
    for (Score c : topTen) {
      if (cnt < 10) {
        df.addRow(new Object[]{c.getPlayerName(), c.getScore()});
        cnt++;
      } else {
        break;
      }
    }
  }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        TableScore = new javax.swing.JScrollPane();
        tbScore = new javax.swing.JTable();
        TopScore = new javax.swing.JLabel();
        MoreGame = new javax.swing.JButton();
        NewGame = new javax.swing.JButton();
        ExittGame = new javax.swing.JButton();
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

        Title.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        Title.setText(" PAO YING CHOOP ");
        Title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableScore.setViewportView(tbScore);

        TopScore.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        TopScore.setText(" TOP TEN ");
        TopScore.setAutoscrolls(true);
        TopScore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MoreGame.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        MoreGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/MoreGames.png"))); // NOI18N
        MoreGame.setBorder(null);
        MoreGame.setBorderPainted(false);
        MoreGame.setContentAreaFilled(false);
        MoreGame.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/MoreGames2.png"))); // NOI18N
        MoreGame.setSelected(true);
        MoreGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoreGameActionPerformed(evt);
            }
        });

        NewGame.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        NewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Continue.png"))); // NOI18N
        NewGame.setBorder(null);
        NewGame.setBorderPainted(false);
        NewGame.setContentAreaFilled(false);
        NewGame.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Continue2.png"))); // NOI18N
        NewGame.setSelected(true);
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });

        ExittGame.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        ExittGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Close.png"))); // NOI18N
        ExittGame.setBorder(null);
        ExittGame.setBorderPainted(false);
        ExittGame.setContentAreaFilled(false);
        ExittGame.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Close2.png"))); // NOI18N
        ExittGame.setSelected(true);
        ExittGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExittGameActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MoreGame, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExittGame)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(TableScore, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(TopScore)
                            .addGap(108, 108, 108))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Title)
                            .addGap(18, 18, 18)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TopScore)
                .addGap(18, 18, 18)
                .addComponent(TableScore, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MoreGame, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(NewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExittGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
  private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
    
  }//GEN-LAST:event_formMouseReleased
  
  private void MoreGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoreGameActionPerformed
    this.dispose();
  }//GEN-LAST:event_MoreGameActionPerformed
  
  private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
    this.dispose();
    Game nw = new Game();
    nw.setVisible(true);
  }//GEN-LAST:event_NewGameActionPerformed
  
  private void ExittGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExittGameActionPerformed
    this.dispose();
  }//GEN-LAST:event_ExittGameActionPerformed
  
  private void NewGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGamesActionPerformed
    this.dispose();
    Game nw = new Game();
    nw.setVisible(true);
  }//GEN-LAST:event_NewGamesActionPerformed
  
  private void ExitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitGameActionPerformed
    this.dispose();
  }//GEN-LAST:event_ExitGameActionPerformed
  
  private void HomeGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeGameActionPerformed
    this.dispose();
  }//GEN-LAST:event_HomeGameActionPerformed
  
  private void CeatorGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CeatorGameActionPerformed
    JOptionPane.showMessageDialog(null, "Name : Mr.Jirayu Chinnawong "
    + "\nID : 5730211011 \nMajor : Information Technology (IT2)"
    + "\nFaculty : Technology and Environment (TE)");
  }//GEN-LAST:event_CeatorGameActionPerformed
  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CeatorGame;
    private javax.swing.JMenuItem ExitGame;
    private javax.swing.JButton ExittGame;
    private javax.swing.JMenu Files;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem HomeGame;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton MoreGame;
    private javax.swing.JMenu MoreGames;
    private javax.swing.JButton NewGame;
    private javax.swing.JMenuItem NewGames;
    private javax.swing.JScrollPane TableScore;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TopScore;
    private javax.swing.JTable tbScore;
    // End of variables declaration//GEN-END:variables
}
