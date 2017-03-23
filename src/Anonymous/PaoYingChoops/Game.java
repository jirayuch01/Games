package Anonymous.PaoYingChoops;

import Anonymous.FlyingBrownie.Launcher;
import Anonymous.Menu.Menu;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {

    ImageIcon iconComputer = new ImageIcon();
    ImageIcon iconPlayer = new ImageIcon();

    int scoreComputer = 0;

    int scorePlayer = 0;

    String hammer = "/Anonymous/images/hammer.png";
    String paper = "/Anonymous/images/paper.png";
    String scissors = "/Anonymous/images/scissors.png";
    
    Random random = new Random();

    int numComputer;

    int numPlayer;

    int count = 0;

    String playerName = "";

    String filePath;
    String fileName;

    public Game() {
        initComponents();
        String dir = "user.dir";
        try {
            dir = new File(System.getProperty(dir))
                    .getCanonicalPath();
        } catch (IOException e1) {
        }
        filePath = dir + File.separator + "src";
        getContentPane().setBackground(Color.pink);
    }

    public void checkScore() {

        if (count != 10) {

            numComputer = random.nextInt(3);

            if (numComputer == 0) {
                iconComputer = new javax.swing.ImageIcon(getClass().getResource(hammer));
            } else if (numComputer == 1) {
                iconComputer = new javax.swing.ImageIcon(getClass().getResource(paper));
            } else {
                iconComputer = new javax.swing.ImageIcon(getClass().getResource(scissors));
            }
            lbPlayComputer.setIcon(iconComputer);
            lbPlayPlayer.setIcon(iconPlayer);

            if (numComputer != numPlayer) {

                if (numComputer == 0 && numPlayer == 1) {
                    scorePlayer++;
                } else if (numComputer == 0 && numPlayer == 2) {
                    scoreComputer++;
                } else if (numComputer == 1 && numPlayer == 0) {
                    scoreComputer++;
                } else if (numComputer == 1 && numPlayer == 2) {
                    scorePlayer++;
                } else if (numComputer == 2 && numPlayer == 0) {
                    scorePlayer++;
                } else if (numComputer == 2 && numPlayer == 1) {
                    scoreComputer++;
                }
            }

            lbScoreComputer.setText(Integer.toString(scoreComputer));
            lbScorePlayer.setText(Integer.toString(scorePlayer));

            count++;
            lbCount.setText(Integer.toString(count));
        } else {
            playerName = (String) JOptionPane.showInputDialog(this, "Please, input your name.");
            writeToFile(playerName,
                    Integer.parseInt(lbScorePlayer.getText()));

            bHammer.setEnabled(false);
            bPaper.setEnabled(false);
            bScissors.setEnabled(false);
        }
    }

    public void writeToFile(String playerName, int score) {
        try {

            fileName = filePath + File.separator
                    + "Anonymous/PaoYingChoops/score.dat";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(playerName + ";" + score);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            //System.out.println("ERROR: writing file");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bNewGame = new javax.swing.JButton();
        ShowScore = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        ScoreComputer = new javax.swing.JLabel();
        lbScoreComputer = new javax.swing.JLabel();
        PlayComputer = new javax.swing.JLabel();
        Computer = new javax.swing.JLabel();
        lbPlayComputer = new javax.swing.JLabel();
        ScorePlayer = new javax.swing.JLabel();
        lbScorePlayer = new javax.swing.JLabel();
        PlayPlayer = new javax.swing.JLabel();
        Player = new javax.swing.JLabel();
        lbPlayPlayer = new javax.swing.JLabel();
        Round = new javax.swing.JLabel();
        lbCount = new javax.swing.JLabel();
        Vs = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        bHammer = new javax.swing.JButton();
        bScissors = new javax.swing.JButton();
        bPaper = new javax.swing.JButton();
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
        setBackground(new java.awt.Color(255, 102, 0));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        bNewGame.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        bNewGame.setForeground(new java.awt.Color(153, 0, 51));
        bNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/NewGame.png"))); // NOI18N
        bNewGame.setBorder(null);
        bNewGame.setBorderPainted(false);
        bNewGame.setContentAreaFilled(false);
        bNewGame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bNewGame.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/NewGame2.png"))); // NOI18N
        bNewGame.setSelected(true);
        bNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewGameActionPerformed(evt);
            }
        });

        ShowScore.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        ShowScore.setForeground(new java.awt.Color(102, 0, 102));
        ShowScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/HighScores.png"))); // NOI18N
        ShowScore.setBorder(null);
        ShowScore.setBorderPainted(false);
        ShowScore.setContentAreaFilled(false);
        ShowScore.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/HighScores2.png"))); // NOI18N
        ShowScore.setSelected(true);
        ShowScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowScoreActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Castellar", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(153, 51, 0));
        Title.setText("Pao Ying Choop");
        Title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ScoreComputer.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        ScoreComputer.setForeground(new java.awt.Color(0, 51, 255));
        ScoreComputer.setText(" SCORE ");
        ScoreComputer.setBorder(new javax.swing.border.MatteBorder(null));

        lbScoreComputer.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        lbScoreComputer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbScoreComputer.setText("0  ");
        lbScoreComputer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PlayComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Player.gif"))); // NOI18N

        Computer.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        Computer.setForeground(new java.awt.Color(153, 0, 153));
        Computer.setText(" COMPUTER ");
        Computer.setBorder(new javax.swing.border.MatteBorder(null));

        lbPlayComputer.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        lbPlayComputer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPlayComputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Random.png"))); // NOI18N
        lbPlayComputer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ScorePlayer.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        ScorePlayer.setForeground(new java.awt.Color(0, 0, 255));
        ScorePlayer.setText(" SCORE ");
        ScorePlayer.setBorder(new javax.swing.border.MatteBorder(null));

        lbScorePlayer.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        lbScorePlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbScorePlayer.setText("0");
        lbScorePlayer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PlayPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/computer.gif"))); // NOI18N

        Player.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        Player.setForeground(new java.awt.Color(153, 0, 153));
        Player.setText(" PLAYER ");
        Player.setBorder(new javax.swing.border.MatteBorder(null));

        lbPlayPlayer.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        lbPlayPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPlayPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Blank.png"))); // NOI18N
        lbPlayPlayer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Round.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Round.setForeground(new java.awt.Color(255, 0, 51));
        Round.setText(" ROUND ");
        Round.setBorder(new javax.swing.border.MatteBorder(null));

        lbCount.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        lbCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCount.setText("0");
        lbCount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Vs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/Vs.png"))); // NOI18N
        Vs.setBorder(null);
        Vs.setBorderPainted(false);
        Vs.setContentAreaFilled(false);

        Quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/ExitGame.png"))); // NOI18N
        Quit.setActionCommand("Exit");
        Quit.setBorder(null);
        Quit.setBorderPainted(false);
        Quit.setContentAreaFilled(false);
        Quit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/ExitGame2.png"))); // NOI18N
        Quit.setSelected(true);
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        bHammer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/hammer.png"))); // NOI18N
        bHammer.setBorder(null);
        bHammer.setBorderPainted(false);
        bHammer.setContentAreaFilled(false);
        bHammer.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/hammer2.png"))); // NOI18N
        bHammer.setSelected(true);
        bHammer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHammerActionPerformed(evt);
            }
        });

        bScissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/scissors.png"))); // NOI18N
        bScissors.setBorder(null);
        bScissors.setBorderPainted(false);
        bScissors.setContentAreaFilled(false);
        bScissors.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/scissors2.png"))); // NOI18N
        bScissors.setSelected(true);
        bScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bScissorsActionPerformed(evt);
            }
        });

        bPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/paper.png"))); // NOI18N
        bPaper.setBorder(null);
        bPaper.setBorderPainted(false);
        bPaper.setContentAreaFilled(false);
        bPaper.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/images/paper2.png"))); // NOI18N
        bPaper.setSelected(true);
        bPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPaperActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(Round, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(ScoreComputer)
                        .addGap(2, 2, 2)
                        .addComponent(lbScoreComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(450, 450, 450)
                        .addComponent(lbScorePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ScorePlayer))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(PlayComputer)
                                .addGap(22, 22, 22)
                                .addComponent(lbPlayComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(Computer))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(bNewGame)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ShowScore)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bHammer)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bScissors)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(215, 215, 215)
                                        .addComponent(Player))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Quit))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Vs)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bPaper)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbPlayPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(PlayPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Title)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Round, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScoreComputer)
                    .addComponent(lbScoreComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbScorePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScorePlayer))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PlayComputer))
                    .addComponent(lbPlayComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Vs))
                    .addComponent(lbPlayPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PlayPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Computer)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bNewGame)
                            .addComponent(ShowScore)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Player)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Quit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bHammer)
                            .addComponent(bScissors)
                            .addComponent(bPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        bNewGame.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(869, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void bNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewGameActionPerformed

      count = 0;
      scoreComputer = 0;
      scorePlayer = 0;

      lbScoreComputer.setText("0");
      lbScorePlayer.setText("0");
      lbCount.setText("0");
      bHammer.setEnabled(true);
      bPaper.setEnabled(true);
      bScissors.setEnabled(true);

      lbPlayComputer.setIcon(null);
      lbPlayPlayer.setIcon(null);
  }//GEN-LAST:event_bNewGameActionPerformed

  private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
      this.dispose();
  }//GEN-LAST:event_QuitActionPerformed

  private void ShowScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowScoreActionPerformed
      this.dispose();
      GameScore nw = new GameScore();
      nw.setVisible(true);
  }//GEN-LAST:event_ShowScoreActionPerformed

  private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased

  }//GEN-LAST:event_formMouseReleased

  private void bHammerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHammerActionPerformed

      numPlayer = 0;
      iconPlayer = new javax.swing.ImageIcon(getClass().getResource(hammer));
      checkScore();
  }//GEN-LAST:event_bHammerActionPerformed

  private void bScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bScissorsActionPerformed

      numPlayer = 2;
      iconPlayer = new javax.swing.ImageIcon(getClass().getResource(scissors));
      checkScore();
  }//GEN-LAST:event_bScissorsActionPerformed

  private void bPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPaperActionPerformed

      numPlayer = 1;
      iconPlayer = new javax.swing.ImageIcon(getClass().getResource(paper));
      checkScore();
  }//GEN-LAST:event_bPaperActionPerformed

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
    private javax.swing.JLabel Computer;
    private javax.swing.JMenuItem ExitGame;
    private javax.swing.JMenu Files;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem HomeGame;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MoreGames;
    private javax.swing.JMenuItem NewGames;
    private javax.swing.JLabel PlayComputer;
    private javax.swing.JLabel PlayPlayer;
    private javax.swing.JLabel Player;
    private javax.swing.JButton Quit;
    private javax.swing.JLabel Round;
    private javax.swing.JLabel ScoreComputer;
    private javax.swing.JLabel ScorePlayer;
    private javax.swing.JButton ShowScore;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Vs;
    private javax.swing.JButton bHammer;
    private javax.swing.JButton bNewGame;
    private javax.swing.JButton bPaper;
    private javax.swing.JButton bScissors;
    private javax.swing.JLabel lbCount;
    private javax.swing.JLabel lbPlayComputer;
    private javax.swing.JLabel lbPlayPlayer;
    private javax.swing.JLabel lbScoreComputer;
    private javax.swing.JLabel lbScorePlayer;
    // End of variables declaration//GEN-END:variables

}
