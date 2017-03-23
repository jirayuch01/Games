package Anonymous.Menu;

import Anonymous.Creators.Creators;
import Anonymous.FlyingBrownie.Launcher;
import Anonymous.Guessing.Begin;
import Anonymous.MiniMath.MainGame;
import Anonymous.PaoYingChoops.GameStart;
import Anonymous.TicTacToe.TicTacToeFrame;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Menu {

    public final static int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public final static int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    public Dimension Dimension = new Dimension(WIDTH, HEIGHT);
    private URL BACKGROUND, CHOOSING;
    private BufferedImage Background, Choosing;
    private JFrame frame = new JFrame("Menu");
    private List<String> Items;
    protected Font Font;
    protected Color Color = new Color(208, 153, 197);

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Begin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new Menu();
    }

    public Menu() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setUndecorated(true);
                frame.setMinimumSize(Dimension);
                frame.setMaximumSize(Dimension);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Canvas());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class Canvas extends Panel {

        private String Selected;
        private Printer Painter;
        private Map<String, Rectangle> Bounds;
        private int WIDTH = Menu.WIDTH;
        private int HEIGHT = Menu.HEIGHT;

        public Canvas() {
            Initialize();
        }

        public void Initialize() {
            Load();
            Lister();
            Selected = Items.get(0);
            Action();
        }

        public void Action() {
            InputMap in = getInputMap(WHEN_IN_FOCUSED_WINDOW);
            ActionMap out = getActionMap();
            in.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "Up");
            in.put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), "Up");
            in.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), "Up");
            in.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "Down");
            in.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "Down");
            in.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "Down");
            out.put("Down", new Action(1));
            out.put("Up", new Action(-1));
        }

        public void Lister() {
            Painter = new MenuCreator();
            Items = new ArrayList<>(25);
            Items.add("[Brownie Flying]");
            Items.add("Guessing Game*");
            Items.add("_Mini Math_");
            Items.add("`Pao Ying Choops~");
            Items.add("#Tic @Tac Toe!");
            Items.add("Creators|");
            Items.add("Exit");
        }

        @Override
        public void Draw(Graphics2D g2d) {
            g2d.drawImage(Background, 0, 0, null);
            g2d.drawImage(Choosing, (int) (Menu.WIDTH * 0.195), (int) (Menu.HEIGHT * 0.025), null);
        }

        @Override
        public void ReleasedFramework(KeyEvent key) {
            if (key.getKeyCode() == KeyEvent.VK_ESCAPE) {
                System.exit(0);
            } else if (key.getKeyCode() == KeyEvent.VK_ENTER || key.getKeyCode() == KeyEvent.VK_SPACE) {
                /* Menu Keyboard */
                if (Selected.equals("Exit")) {
                    System.exit(0);
                } else if (Selected.equals("[Brownie Flying]")) {
                    Launcher.Initialize();
                } else if (Selected.equals("Guessing Game*")) {
                    Begin bg1 = new Begin();
                    bg1.setState(JFrame.MAXIMIZED_BOTH);
                    bg1.setVisible(true);
                } else if (Selected.equals("_Mini Math_")) {
                    MainGame bg1 = new MainGame();
                    bg1.setState(JFrame.MAXIMIZED_BOTH);
                    bg1.setVisible(true);
                } else if (Selected.equals("`Pao Ying Choops~")) {
                    GameStart bg1 = new GameStart();
                    bg1.setState(JFrame.MAXIMIZED_BOTH);
                    bg1.setVisible(true);
                } else if (Selected.equals(Items.get(4))) {
                    new TicTacToeFrame();
                } else if (Selected.equals("Creators|")) {
                    Creators bg1 = new Creators();
                    bg1.setState(JFrame.MAXIMIZED_BOTH);
                    bg1.setVisible(true);
                }
            }
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();

            Bounds = new HashMap<>(Items.size());
            int Width = 0;
            int Height = 50;

            int X = (int) (WIDTH * 0.2295);

            int Y = (int) (HEIGHT * 0.305);

            for (String text : Items) {
                Bounds.put(text, new Rectangle(X, Y, Width, Height));
                Y += Height + (int) (HEIGHT * 0.020);
            }

            for (String text : Items) {
                Rectangle bounds = Bounds.get(text);
                boolean KeySelected = text.equals(Selected);
                Painter.paint(g2d, text, bounds, KeySelected);
            }
            g2d.dispose();
        }

        public class Action extends AbstractAction {

            private final int delta;

            public Action(int delta) {
                this.delta = delta;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Items.indexOf(Selected);
                index += delta;
                if (index < 0) {
                    Selected = Items.get(Items.size() - 1);
                } else if (index >= Items.size()) {
                    Selected = Items.get(0);
                } else {
                    Selected = Items.get(index);
                }
                repaint();
            }
        }
    }

    private void Load() {
        try {
            BACKGROUND = this.getClass().getResource("Resources/Background.jpg");
            Background = ImageIO.read(BACKGROUND);

            CHOOSING = this.getClass().getResource("Resources/ChoosingGame.png");
            Choosing = ImageIO.read(CHOOSING);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public interface Printer {

        public Dimension getPreferredSize(Graphics2D g2d, String TEXT);

        public void paint(Graphics2D g2d, String TEXT, Rectangle bounds, boolean KeySelected);
    }

    public class MenuCreator implements Printer {

        @Override
        public Dimension getPreferredSize(Graphics2D g2d, String TEXT) {
            return g2d.getFontMetrics().getStringBounds(TEXT, g2d).getBounds().getSize();
        }

        @Override
        public void paint(Graphics2D g2d, String TEXT, Rectangle Bounds, boolean KeySelected) {
            if (TEXT.equals(Items.get(0))) {
                Font = new Font("My First Crush", Font.BOLD, (int) (HEIGHT / 13));
                Color = new Color(210, 150, 200);
            } else if (TEXT.equals(Items.get(1))) {
                Font = new Font("LMS Spelling Bee", Font.BOLD, (int) (HEIGHT / 12));
                Color = new Color(255, 255, 38);
            } else if (TEXT.equals(Items.get(2))) {
                Font = new Font("Love Is A Many Complicated Thing", Font.BOLD, (int) (HEIGHT / 10));
                Color = new Color(213, 0, 57);
            } else if (TEXT.equals(Items.get(3))) {
                Font = new Font("Many a Little Makes a Mickle", Font.BOLD, (int) (HEIGHT / 15));
                Color = new Color(38, 241, 255);
            } else if (TEXT.equals(Items.get(4))) {
                Font = new Font("Pamekasan", Font.BOLD, (int) (HEIGHT / 14.5));
                Color = new Color(0, 255, 196);
            } else if (TEXT.equals(Items.get(5))) {
                Font = new Font("KG Piece by Piece", Font.BOLD, (int) (HEIGHT / 15));
                Color = new Color(74, 66, 185);
            } else {
                Font = new Font("Xenippa", Font.BOLD, (int) (HEIGHT / 13));
                Color = new Color(255, 255, 255);
            }
            g2d.setColor(KeySelected ? Color : Color.GRAY);
            g2d.setFont(Font);
            FontMetrics Frame = g2d.getFontMetrics();
            int X = Bounds.x + ((Bounds.width - Frame.stringWidth(TEXT)) / 2);
            int Y = Bounds.y + ((Bounds.height - Frame.getHeight()) / 2);
            g2d.drawString(TEXT, X, Y);
        }

        protected void paintBackground(Graphics2D g2d, Color foreground) {
            g2d.setColor(foreground);
        }

    }

    public abstract class Panel extends JPanel implements KeyListener {

        public abstract void Draw(Graphics2D g2d);

        public abstract void ReleasedFramework(KeyEvent key);
        private final boolean[] Keyboard = new boolean[525];
        private BufferedImage Cursor = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        private Cursor BLANK = Toolkit.getDefaultToolkit().createCustomCursor(Cursor, new Point(0, 0), null);

        public Panel() {
            Initialize();
        }

        private void Initialize() {
            this.setCursor(BLANK);
            this.setDoubleBuffered(true);
            this.setFocusable(true);
            this.setBackground(Color.BLACK);
            this.addKeyListener(this);
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            Draw(g2d);
        }

        @Override
        public void keyPressed(KeyEvent key) {
            Keyboard[key.getKeyCode()] = true;
        }

        @Override
        public void keyReleased(KeyEvent key) {
            Keyboard[key.getKeyCode()] = false;
            ReleasedFramework(key);
        }

        @Override
        public void keyTyped(KeyEvent key) {

        }
    }
}
