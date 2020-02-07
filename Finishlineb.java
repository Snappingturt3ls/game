package jason;

import java.awt.*;

public class Finishlineb {

int RECT_WIDTH = 100;
int RECT_HEIGHT = 50;
int x = Race.WIN_WIDTH/2-100;
int y = Race.WIN_HEIGHT/2-50;
int xVelocity = 0;
int yVelocity = 0;
public int height;
public int width;

public void paint(Graphics g) {
    g.setColor(Color.black);
    g.fillRect(1150, 0, 100, 500);
}
}