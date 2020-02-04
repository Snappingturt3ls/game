package jason;

import java.awt.*;

public class Startinglinew {

int RECT_WIDTH = 50;
int RECT_HEIGHT = 50;
int x = Race.WIN_WIDTH/2-100;
int y = Race.WIN_HEIGHT/2-50;
int xVelocity = 0;
int yVelocity = 0;

public void paint(Graphics g) {
    g.setColor(Color.white);
    g.fillRect(250, 0, 50, 50);
    g.fillRect(300, 50, 50, 50);
    g.fillRect(250, 100, 50, 50);
    g.fillRect(300, 150, 50, 50);
    g.fillRect(250, 200, 50, 50);
    g.fillRect(300, 250, 50, 50);
    g.fillRect(250, 300, 50, 50);
    g.fillRect(300, 350, 50, 50);
    g.fillRect(250, 400, 50, 50);
    g.fillRect(300, 450, 50, 50);
    g.fillRect(250, 500, 50, 50);
}
}