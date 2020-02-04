package jason;

import java.awt.*;

public class Track {

    int RECT_WIDTH = 1500;
    int RECT_HEIGHT = 500;
    int x = Race.WIN_WIDTH/2-100;
    int y = Race.WIN_HEIGHT/2-50;
    int xVelocity = 0;
    int yVelocity = 0;
    
    public void paint(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(0, 0, 1500, 500);
    }
    }