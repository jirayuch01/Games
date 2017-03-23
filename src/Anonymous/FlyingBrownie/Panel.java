/*

    Author: Mr.Wathunyu Pgetpaya IT 5730211101
    Designer: Ms.Monsicha Wongwiwat IT 5730211046

*/
package Anonymous.FlyingBrownie;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
public abstract class Panel extends JPanel implements KeyListener{
    public abstract void Draw(Graphics2D g2d);
    public abstract void ReleasedFramework(KeyEvent key);
    private static final boolean[] Keyboard = new boolean[525];
    private static final boolean[] Mouse = new boolean[3];
    private static BufferedImage Cursor;
    private static Cursor BLANK;
    public Panel(){
        Initialize();
    }
    
    private void Initialize(){
        Cursor = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        BLANK = Toolkit.getDefaultToolkit().createCustomCursor(Cursor, new Point(0, 0), null);       
        this.setCursor(BLANK);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.setBackground(Color.black);
        this.addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;        
        super.paintComponent(g2d);        
        Draw(g2d);
    }

    @Override
    public void keyPressed(KeyEvent key) {
        Keyboard[key.getKeyCode()] = true;
    }
  
    @Override
    public void keyReleased(KeyEvent key){
      Keyboard[key.getKeyCode()] = false;
      ReleasedFramework(key);
    }
  
    @Override
    public void keyTyped(KeyEvent key){
    
    }
    
    public static boolean keyControl(int key){
        return Keyboard[key];
    }

}
