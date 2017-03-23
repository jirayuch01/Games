/*

    Author: Mr.Wathunyu Pgetpaya IT 5730211101
    Designer: Ms.Monsicha Wongwiwat IT 5730211046

*/
package Anonymous.FlyingBrownie;
import Anonymous.Menu.Menu;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
public class Launcher extends JFrame {
    protected static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    protected static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    private final String Title = "Brownie Flying";
    private final Dimension Dimension = new Dimension(WIDTH, HEIGHT);
    public static void main(String[] args) {
        new Menu();
    }
    
    public static void Initialize() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                new Launcher().setVisible(true);
            }
        });
    }

    protected Launcher() {
        this.setTitle(this.Title);      
        this.setMinimumSize(Dimension);
        this.setMaximumSize(Dimension);
        this.setUndecorated(true);  
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(new Content());
    }
    
    protected void Exit(){
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
}
