/*

    Author: Mr.Wathunyu Pgetpaya IT 5730211101
    Designer: Ms.Monsicha Wongwiwat IT 5730211046
    -------------------------------------------------------
                            Knowledge Time
    -------------------------------------------------------
        1   second        =     1 000 000 000   nanoseconds
        1   millisecond   =     1 000 000       nanoseconds
*/
package Anonymous.FlyingBrownie;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class Content extends Panel {
    public static final int WIDTH = Launcher.WIDTH;
    public static final int HEIGHT = Launcher.HEIGHT;
    public static final long MilliNano = 1000000L;
    public static final long SecNano = 1000000000L;
    private static final int fps = 20;
    private static final long Period = SecNano/fps;
    public static State.STATE GAME_STATE;
    public long GameTime;
    private long LastTime;
    private Game Game;
    private BufferedImage Background;
    private URL BACKGROUND;
    private final Play Play = new Play();
    private final Thread Thread;
    public Content(){
        GAME_STATE = GAME_STATE.VISUALIZATION;
        Thread = new Thread(){
            @Override
            public void run(){
                Initialize();
            }
        };
        Thread.start();
    }
    
    private void Initialize(){
        Loop();
    }
  
    private void Load(){
        try{
            BACKGROUND = this.getClass().getResource("Resources/State.jpg");
            Background = ImageIO.read(BACKGROUND);
        }catch (IOException ex){
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    private void Loop(){
        long VisualTime = 0, LastVisualTime = System.nanoTime();
        long BEGIN, TAKEN, LEFT;
        while(true){
            BEGIN = System.nanoTime();
            switch (GAME_STATE){
                case START:
                    Load();
                    GAME_STATE = GAME_STATE.MENU;
                    break;
                case LOAD:
                    break;
                case MENU:
                    break;
                case PLAY:
                    GameTime += System.nanoTime() - LastTime;
                    Game.Update(GameTime, Pointer());
                    LastTime = System.nanoTime();
                    if(Play.Energy == 0){
                        GAME_STATE = GAME_STATE.GAMEOVER;
                    }
                    break;
                case GAMEOVER:
                    break;
                case VISUALIZATION:
                    if(this.getWidth() > 1 && VisualTime > SecNano){
                        GAME_STATE = GAME_STATE.START;
                    }
                    else{
                        VisualTime += System.nanoTime() - LastVisualTime;
                        LastVisualTime = System.nanoTime();
                    }
                    break;
            }
            repaint();
            TAKEN = System.nanoTime() - BEGIN;
            LEFT = (Period - TAKEN) / MilliNano;
            if (LEFT < 10)LEFT = 10;
            try{
                Thread.sleep(LEFT);
            }catch(Exception ex){ 
                Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  
    @Override
    public void Draw(Graphics2D g2d){
        switch (GAME_STATE){
            case PLAY:
                        Game.Draw(g2d, Pointer());
                        break;
            case GAMEOVER:         
                        Game.GameOver(g2d, Pointer(), GameTime);
                        break;
            case MENU:
                        g2d.drawImage(Background, 0, 0, WIDTH, HEIGHT, null);
                        g2d.setColor(Color.GREEN);
                        g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 25)));
                        g2d.drawString("ALT + F4 to Exit", (int)(WIDTH * 0.01), (int)(HEIGHT * 0.05));
                        g2d.setFont(new Font("Lucida Console", Font.BOLD, (int)(HEIGHT / 25)));
                        g2d.setColor(Color.WHITE);
                        g2d.drawString("Mr.Wathunyu Phetpaya", (int)(WIDTH * 0.02), (int)(HEIGHT * 0.99));
                        g2d.drawString("And", (int)(WIDTH * 0.475), (int)(HEIGHT * 0.99));
                        g2d.drawString("Ms.Monsicha Wongwiwat", (int)(WIDTH * 0.67), (int)(HEIGHT * 0.99));
                break;
            case LOAD:
                        try {
                            new Load().Draw(g2d);
                        } catch (IOException ex) {
                            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        g2d.setFont(new Font("Virtual DJ", Font.BOLD, (int)(HEIGHT / 15)));
                        g2d.setColor(Color.YELLOW);
                        g2d.drawString("Loading", (int)(WIDTH * 0.40), (int)(HEIGHT * 0.50));
                        break;
        }
    }
    
    public Point Pointer(){
        try{
            Point mp = this.getMousePosition();
            if(mp != null)return this.getMousePosition();
            else return new Point(0, 0);
        }
        catch (Exception e){
            return new Point(0, 0);
        }
    }

    private void New() throws Exception{
        Game = new Game();
        GameTime = 0;
        LastTime = System.nanoTime();
    }
  
    private void Restart(){
        GameTime = 0;
        LastTime = System.nanoTime();
        Game.Restart();
        GAME_STATE = GAME_STATE.PLAY;
    }
  
    @Override
    public void ReleasedFramework(KeyEvent key){
        if(key.getKeyCode() == KeyEvent.VK_ESCAPE)new Launcher().Exit();
        switch (GAME_STATE){
            case MENU:
                if(key.getKeyCode() == KeyEvent.VK_SPACE || key.getKeyCode() == KeyEvent.VK_ENTER)
                    try {
                        New();
                    } catch (Exception ex) {
                        Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
                    }
                break;
            case GAMEOVER:
                if(key.getKeyCode() == KeyEvent.VK_SPACE || key.getKeyCode() == KeyEvent.VK_ENTER)Restart();
                break;
        }
    }
}
