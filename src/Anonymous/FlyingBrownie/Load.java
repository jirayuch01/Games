/*

    Author: Mr.Wathunyu Pgetpaya IT 5730211101
    Designer: Ms.Monsicha Wongwiwat IT 5730211046

*/
package Anonymous.FlyingBrownie;
import static Anonymous.FlyingBrownie.Launcher.HEIGHT;
import static Anonymous.FlyingBrownie.Launcher.WIDTH;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
public class Load {
    public void Draw(Graphics2D g2d) throws IOException {
        URL BackgroundURL;
        BufferedImage Background;
        BackgroundURL = this.getClass().getResource("Resources/Load.jpg");
        Background = ImageIO.read(BackgroundURL);
        g2d.drawImage(Background, 0, 0, WIDTH, HEIGHT, null);
    }
}
