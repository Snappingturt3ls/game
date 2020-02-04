package jason;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {

    /**
    	 *
    	 */
    private static final long serialVersionUID = 1L;
    Player player = new Player();
    Startinglineb startinglineb = new Startinglineb();
    Track track = new Track();
    Startinglinew startinglinew = new Startinglinew();
    Finishlineb finishlineb = new Finishlineb();
    Finishlinew finishlinew = new Finishlinew();
    Text text = new Text();
    WIN win = new WIN();
Timer timer;
public Object object;

public Panel() {
    this.setFocusable(true);
    timer = new Timer(5,this);

    timer.start();
}

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    track.paint(g);
    startinglineb.paint(g);
    startinglinew.paint(g);
    finishlineb.paint(g);
    finishlinew.paint(g);
    player.paint(g);
    text.paint(g);
    win.paint(g);
}

public void update() {
    player.update();
}

@Override
public void actionPerformed(ActionEvent e) {
    repaint();
    update();
}
}