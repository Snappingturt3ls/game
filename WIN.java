package jason;

import java.awt.*;

public class WIN {
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.PLAIN, 50));
        g.drawString("You Win!", 575, 50);
    }
}