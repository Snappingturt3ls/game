package jason;

import java.awt.*;

public class Startinglineb {

int RECT_WIDTH = 100;
int RECT_HEIGHT = 50;
int x = Race.WIN_WIDTH/2-100;
int y = Race.WIN_HEIGHT/2-50;
int xVelocity = 0;
int yVelocity = 0;

public void paint(Graphics g) {
    g.setColor(Color.black);
    g.fillRect(250, 0, 100, 500);
}
}