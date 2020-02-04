package jason;

import java.awt.*;
import java.awt.event.KeyListener;

public class Player {

int OVAL_WIDTH = 50;
int OVAL_HEIGHT = 50;
int x = Race.WIN_WIDTH/2-100;
int y = Race.WIN_HEIGHT/2-50;
int xVelocity = 0;
int yVelocity = 0;

public void paint(Graphics g) {
    g.setColor(Color.red);
    g.fillOval(x, y, 50, 50);
}

public void update() {
    x += xVelocity;
    y += yVelocity;
    if(x < 0 || x > Race.WIN_WIDTH) {
        xVelocity = -xVelocity;
    }
    if(y < 0 || y > Race.WIN_HEIGHT) {
        yVelocity = -yVelocity;
    }
}

public void addKeyListener(KeyListener keyListener) {
}
}