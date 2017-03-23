/*

    Author: Mr.Wathunyu Pgetpaya IT 5730211101
    Designer: Ms.Monsicha Wongwiwat IT 5730211046

*/
package Anonymous.FlyingBrownie;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class Base{
    public static final int WIDTH = Launcher.WIDTH;
    public static final int HEIGHT = Launcher.HEIGHT;
    public int X, Y;
    public BufferedImage STOP;
    private URL STOPURL;
    public Base(){
        Initialize();
    }

    private void Initialize(){   
        Load();
    }
    
    public void Draw(Graphics2D g2d){
        g2d.drawImage(STOP, X, Y, null);
    }
  
    private void Load(){
        try{
            STOPURL = this.getClass().getResource("Resources/Base.png");
            STOP = ImageIO.read(STOPURL);
            X = (int)(WIDTH * 0.44);
            Y = (int)(HEIGHT * 0.75);
        }catch(IOException ex){
            Logger.getLogger(Base.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
