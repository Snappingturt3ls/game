package jason;

import java.awt.*;

public class Text {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("serif", Font.PLAIN, 50));
        g.drawString("Start", 75, 50);
        g.drawString("Finish", 1310, 50);
    }
}