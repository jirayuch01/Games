package Anonymous.Creators;

import Anonymous.Menu.Menu;
import javax.swing.WindowConstants;

public class Creators extends javax.swing.JFrame {
  public Creators() {
    initComponents();
  }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        BackGroup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/pics/Back.png"))); // NOI18N
        Back.setBorder(null);
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/pics/back2.png"))); // NOI18N
        Back.setSelected(true);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(40, 600, 120, 70);

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/pics/Exit1.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.setBorderPainted(false);
        Exit.setContentAreaFilled(false);
        Exit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/pics/Exit2.png"))); // NOI18N
        Exit.setSelected(true);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(180, 600, 120, 70);

        BackGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Anonymous/pics/PSUceators2.jpg"))); // NOI18N
        getContentPane().add(BackGroup);
        BackGroup.setBounds(0, -90, 1290, 900);

        setSize(new java.awt.Dimension(1279, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
  private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    this.dispose();
    Menu nw = new Menu();
    //nw.setVisible(true);
  }//GEN-LAST:event_BackActionPerformed
  
  private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
    this.dispose();
  }//GEN-LAST:event_ExitActionPerformed
  
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
      java.util.logging.Logger.getLogger(Creators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Creators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Creators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Creators.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Creators();
      }
    });
  }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackGroup;
    private javax.swing.JButton Exit;
    // End of variables declaration//GEN-END:variables
}
