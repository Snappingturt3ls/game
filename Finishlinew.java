package jason;

import java.awt.*;

public class Finishlinew {

int RECT_WIDTH = 50;
int RECT_HEIGHT = 50;
int x = Race.WIN_WIDTH = 1500;
int y = Race.WIN_HEIGHT = 500;
int xVelocity = 0;
int yVelocity = 0;

public void paint(Graphics g) {
    g.setColor(Color.white);
    g.fillRect(1150, 0, 50, 50);
    g.fillRect(1200, 50, 50, 50);
    g.fillRect(1150, 100, 50, 50);
    g.fillRect(1200, 150, 50, 50);
    g.fillRect(1150, 200, 50, 50);
    g.fillRect(1200, 250, 50, 50);
    g.fillRect(1150, 300, 50, 50);
    g.fillRect(1200, 350, 50, 50);
    g.fillRect(1150, 400, 50, 50);
    g.fillRect(1200, 450, 50, 50);
    g.fillRect(1150, 500, 50, 50);
}
}