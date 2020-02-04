package jason;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Race extends JFrame {

    /**
    	 *
    	 */
    private static final long serialVersionUID = 1L;
    public static int WIN_WIDTH = 1500;
public static int WIN_HEIGHT = 500;

public Race() {
    Panel panel = new Panel();
    Player player = panel.player;

    setSize(1500, 500);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(panel);
    panel.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_DOWN) {
                player.yVelocity = 4;
                System.out.println(player.yVelocity);
            }
            if(keyCode == KeyEvent.VK_UP) {
                player.yVelocity = -4;
            }
            if(keyCode == KeyEvent.VK_RIGHT) {
                player.xVelocity = 4;
            }
            if(keyCode == KeyEvent.VK_LEFT) {
                player.xVelocity = -4;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            player.yVelocity = 0;
            player.xVelocity = 0;
        }
    });
    setVisible(true);
}

    public static void main(String[] args) {
        new Race();  
    }
}