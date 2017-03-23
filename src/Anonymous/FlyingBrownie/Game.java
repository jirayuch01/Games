/*

    Author: Mr.Wathunyu Pgetpaya IT 5730211101
    Designer: Ms.Monsicha Wongwiwat IT 5730211046

*/
package Anonymous.FlyingBrownie;
import static Anonymous.FlyingBrownie.Launcher.HEIGHT;
import static Anonymous.FlyingBrownie.Launcher.WIDTH;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class Game {
    private long Score = 0;
    private long Wait = 0;
    private long BestTime = 0;
    private Play Play;
    private Base BASE;
    private BufferedImage Background, Sun, Cloud, Land, Sea, GreenFrame, CarrotFrameRed, RedFrame, CarrotFrame;
    private URL BackgroundURL, SunURL, CloudURL, RedFrameURL, GreenFrameURL, CarrotFrameRedURL, CarrotFrameURL, SeaURL, LandURL;
    private final Thread Thread;
    public Game() throws Exception {       
        Thread = new Thread(){
        @Override
        public void run(){
            Initialize();
        }
        };
        Thread.start();
    }
  
    private void Initialize(){
        Content.GAME_STATE = Content.GAME_STATE.LOAD;
        Play = new Play();
        BASE  = new Base();
        Load(); 
        try{
            LoadFile(new File("save.dat"));
            
        }catch(IOException ex){
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        Content.GAME_STATE = Content.GAME_STATE.PLAY;
    }
    
    public final void LoadFile(File file) throws IOException {
        try (Scanner in = new Scanner(file)){
            BestTime = in.nextLong();
            Wait = in.nextLong();
            in.close();
        }
    }
    
    public final void SaveFile(File file) throws IOException {
        try (PrintWriter out = new PrintWriter(file)) {
            out.println((int) BestTime);
            Wait = Score > Wait ? Score : Wait;
            out.println((int) Wait);
            out.flush();
            out.close();
        }
    }
    
    private void Load(){
        try{
            BackgroundURL = this.getClass().getResource("Resources/Level.jpg");
            Background = ImageIO.read(BackgroundURL);
            
            SunURL = this.getClass().getResource("Resources/Sun.png");
            Sun = ImageIO.read(SunURL);
            
            CloudURL = this.getClass().getResource("Resources/Cloud.png");
            Cloud = ImageIO.read(CloudURL);
            
            SeaURL = this.getClass().getResource("Resources/Sea.png");
            Sea = ImageIO.read(SeaURL);
            
            LandURL = this.getClass().getResource("Resources/Land.png");
            Land = ImageIO.read(LandURL);

            RedFrameURL = this.getClass().getResource("Resources/RedFrame.png");
            RedFrame = ImageIO.read(RedFrameURL);

            GreenFrameURL = this.getClass().getResource("Resources/GreenFrame.png");
            GreenFrame = ImageIO.read(GreenFrameURL);
            
            CarrotFrameURL = this.getClass().getResource("Resources/Background_Carrot.png");
            CarrotFrame = ImageIO.read(CarrotFrameURL);
            
            CarrotFrameRedURL = this.getClass().getResource("Resources/Background_Carrot_Red.png");
            CarrotFrameRed = ImageIO.read(CarrotFrameRedURL);
            
        }catch(IOException ex){
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Restart(){
        Play.Reset();
    }
  
    public void Update(long gameTime, Point Pointer){
        Play.Update();
        if(Play.Y - Play.Brownie_HEIGHT + 150 > BASE.Y){
            if((Play.X > BASE.X) && (Play.X < BASE.X + BASE.STOP.getWidth() - Play.Brownie_WIDTH)){
                if(Play.SpeedY <= Play.TopSpeed)Play.PARK = true;
                else Play.BOMB = true;
            }
            else Play.BOMB = true;
            Content.GAME_STATE = Content.GAME_STATE.GAMEOVER;
        }
    }
  
    public void Draw(Graphics2D g2d, Point Pointer){
        g2d.drawImage(Background, 0, 0, WIDTH, HEIGHT, null);
        g2d.drawImage(Sun, (int)(WIDTH * 0.3), (int)(HEIGHT * 0.05), null);
        g2d.drawImage(Cloud, (int)(WIDTH * 0.1), (int)(HEIGHT * 0.05), null);
        g2d.drawImage(Cloud, (int)(WIDTH * 0.5), (int)(HEIGHT * 0.05), null);
        g2d.drawImage(Cloud, (int)(WIDTH * 0.01), (int)(HEIGHT * 0.25), null);
        g2d.drawImage(Cloud, (int)(WIDTH * 0.75), (int)(HEIGHT * 0.25), null);
        g2d.drawImage(Sea, 0, 0, WIDTH, HEIGHT, null);
        g2d.drawImage(Land, (int)(WIDTH * 0.2), (int)(HEIGHT * 0.5), null);
        BASE.Draw(g2d);
        Play.Draw(g2d);
    }
  
    public void GameOver(Graphics2D g2d, Point Pointer, long Time){
        Draw(g2d, Pointer);
        g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 30)));
        g2d.drawString("Press space bar or enter to restart", (int)(WIDTH * 0.19), (int)(HEIGHT * 0.35));
        if(Play.PARK && Play.Energy > 0){
            if(BestTime == 0)BestTime = Time / Content.SecNano;
            else if(BestTime > Time / Content.SecNano)BestTime = Time / Content.SecNano;
            Score = BestTime <= 3 && BestTime > 0 ? 50
                    :BestTime <= 6 && BestTime > 3 ? 40
                    :BestTime <= 9 && BestTime > 6 ? 30
                    :BestTime <= 12 && BestTime > 9 ? 20
                    :BestTime <= 15 && BestTime > 12 ? 10
                    :5;
            Score *= Play.Energy;
            try{
                SaveFile(new File("save.dat"));
            }catch(IOException ex){
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
            g2d.drawImage(GreenFrame, 0, 0, WIDTH, HEIGHT, null);
            g2d.drawImage(CarrotFrame, 0, 0, WIDTH, HEIGHT, null);
            g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 15)));
            g2d.setColor(Color.GREEN);
            g2d.drawString("Complete Mission!!!", (int)(WIDTH * 0.185), (int)(HEIGHT * 0.235));
            g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 30)));
            g2d.setColor(Color.RED);
            g2d.drawString("This Time: " + Time / Content.SecNano + " Seconds", (int)(WIDTH * 0.32), (int)(HEIGHT * 0.45));
            g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 30)));
            g2d.setColor(Color.RED);
            g2d.drawString("This Score: " + Score + " Mega Carrots", (int)(WIDTH * 0.25), (int)(HEIGHT * 0.55));
            g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 15)));
            g2d.setColor(new Color(255, 255, 255));
            g2d.drawString("Best Time: " + BestTime + " Seconds", (int)(WIDTH * 0.16), (int)(HEIGHT * 0.65));
            g2d.drawImage(GreenFrame, 0, 0, WIDTH, HEIGHT, null);
            g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 16)));
            g2d.drawString("Best Score: " + Wait + " Mega Carrots", (int)(WIDTH * 0.03), (int)(HEIGHT * 0.75));
        }
        else{
            g2d.drawImage(RedFrame, 0, 0, WIDTH, HEIGHT, null);
            g2d.drawImage(CarrotFrameRed, 0, 0, WIDTH, HEIGHT, null);
            g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 15)));
            g2d.setColor(Color.RED);
            g2d.drawString("Fail Mission!!!", (int)(WIDTH * 0.25), (int)(HEIGHT * 0.235));
        }
    }
}
