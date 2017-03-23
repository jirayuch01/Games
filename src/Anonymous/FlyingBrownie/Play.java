/*

    Author: Mr.Wathunyu Pgetpaya IT 5730211101
    Designer: Ms.Monsicha Wongwiwat IT 5730211046

*/
package Anonymous.FlyingBrownie;
import static Anonymous.FlyingBrownie.Launcher.WIDTH;
import static Anonymous.FlyingBrownie.Launcher.HEIGHT;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage; 
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class Play {
    private Random Random;
    public int X, Y;
    public int SpeedX, SpeedY;
    public int Energy = 70;
    public boolean PARK, BOMB;
    public int AccelerateSpeed, StopSpeed, TopSpeed;
    private BufferedImage Brownie, PARKING, BOMBING, FART, GHOST;
    public int Brownie_WIDTH, Brownie_HEIGHT;
    public Play(){
        Initialize();      
    }
  
    private void Initialize(){
        Random = new Random();
        Reset();
        AccelerateSpeed = 2;
        StopSpeed = 1;
        TopSpeed = 5;     
        Load();
        X = Random.nextInt(Launcher.WIDTH - Brownie_WIDTH);
    }
  
    private void Load(){
        URL BrownieURL, SMILEURL, DEATHURL, FARTURL, GHOSTURL;
        try{
            
            BrownieURL = this.getClass().getResource("Resources/Start.png");
            Brownie = ImageIO.read(BrownieURL);
            Brownie_WIDTH = Brownie.getWidth();
            Brownie_HEIGHT = Brownie.getHeight();

            SMILEURL = this.getClass().getResource("Resources/Stop.png");
            PARKING = ImageIO.read(SMILEURL);
            
            GHOSTURL = this.getClass().getResource("Resources/Ghost.png");
            GHOST = ImageIO.read(GHOSTURL);
            
            FARTURL = this.getClass().getResource("Resources/Fart.png");
            FART = ImageIO.read(FARTURL);

            DEATHURL = this.getClass().getResource("Resources/Death.png");
            BOMBING = ImageIO.read(DEATHURL);
        }catch(IOException ex){
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void Reset(){
        Energy = 70;
        
        SpeedX = 0;
        SpeedY = 0;

        X = Random.nextInt(Launcher.WIDTH - Brownie_WIDTH);
        Y = 10;
        
        PARK = false;
        BOMB = false;
    }
  
    public void Update(){
        if(Panel.keyControl(KeyEvent.VK_W))
        SpeedY -= AccelerateSpeed;
        else
        SpeedY += StopSpeed;
        if(Panel.keyControl(KeyEvent.VK_A))
        SpeedX -= AccelerateSpeed;
        else if(SpeedX < 0)
        SpeedX += StopSpeed;
        if(Panel.keyControl(KeyEvent.VK_D))
        SpeedX += AccelerateSpeed;
        else if(SpeedX > 0)
        SpeedX -= StopSpeed;
        X += SpeedX;
        Y += SpeedY;
    }                 
  
    public void Draw(Graphics2D g2d){ 
        g2d.setColor(Color.RED);
        g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 30)));
        g2d.drawString("ALT + F4 to Exit", (int)(WIDTH * 0.01), (int)(HEIGHT * 0.05));
        g2d.setColor(Color.RED);
        g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 25)));
        g2d.drawString("Energy Point: " + Energy, (int)(WIDTH * 0.695), (int)(HEIGHT * 0.05));   
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Virtual DJ", Font.PLAIN, (int)(HEIGHT / 50)));
        g2d.drawString("Window Position: " + X + " , " + Y, (int)(WIDTH * 0.768), (int)(HEIGHT * 0.10));
        if(PARK)g2d.drawImage(PARKING, X, Y, null);
        else if(BOMB){
            g2d.drawImage(BOMBING, X, Y + Brownie_HEIGHT - BOMBING.getHeight(), null);
            g2d.drawImage(GHOST, X - 125, Y - 150, null);
            SpeedY = 100;
        }else{
            if(Panel.keyControl(KeyEvent.VK_W)){
                g2d.drawImage(FART, X - 40, Y + 120, null);
                if(Energy > 0)Energy -= 1;
                else BOMB = true;
            }
            g2d.drawImage(Brownie, X, Y, null);
            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font("Virtual DJ", Font.PLAIN, (int)(HEIGHT / 50)));
            g2d.drawString("Brownie", X + 10, Y - 10);
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 30)));
            if(Energy > 9)g2d.drawString("" + Energy, X + 30, Y + 30);
            else g2d.drawString("0" + Energy, X + 30, Y + 30);
        }
    }
}
