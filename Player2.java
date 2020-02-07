package jason;

import java.awt.*;

public class Player2 {
int RECT_WIDTH = 50;
int RECT_HEIGHT = 175;
int RECT_WIDTH2 = 55;
int RECT_HEIGHT2 = 170;
int RECT_WIDTH3 = 55;
int RECT_HEIGHT3 = 225;
int RECT_WIDTH4 = 105;
int RECT_HEIGHT4 = 170;
int RECT_WIDTH5 = 105;
int RECT_HEIGHT5 = 225;
double xVelocity = 0;
double yVelocity = 0;

public void paint(Graphics g) {
    g.setColor(Color.red);
    g.fillRect(RECT_WIDTH, RECT_HEIGHT, 75, 50);
    g.setColor(Color.black);
    g.fillRect(RECT_WIDTH2, RECT_HEIGHT2, 15, 5);
    g.fillRect(RECT_WIDTH3, RECT_HEIGHT3, 15, 5);
    g.fillRect(RECT_WIDTH4, RECT_HEIGHT4, 15, 5);
    g.fillRect(RECT_WIDTH5, RECT_HEIGHT5, 15, 5);
}

public void update() {
        RECT_WIDTH += xVelocity;
        RECT_HEIGHT += yVelocity;
        RECT_WIDTH2 += xVelocity;
        RECT_HEIGHT2 += yVelocity;
        RECT_WIDTH3 += xVelocity;
        RECT_HEIGHT3 += yVelocity;
        RECT_WIDTH4 += xVelocity;
        RECT_HEIGHT4 += yVelocity;
        RECT_WIDTH5 += xVelocity;
        RECT_HEIGHT5 += yVelocity;
        if (RECT_WIDTH < 0 || RECT_WIDTH > Race.WIN_WIDTH) {
            xVelocity = -xVelocity;
        }
        if (RECT_HEIGHT < 0 || RECT_HEIGHT > Race.WIN_HEIGHT) {
        yVelocity = -yVelocity;
    }
}
}