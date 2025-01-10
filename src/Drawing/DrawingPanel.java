package Drawing;

/**This program is meant to show the use of drawing shapes to a window
 *
 * @author jwhitenect
 *
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingPanel extends JPanel {

    public DrawingPanel() {
        super();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.GRAY);
        g.setColor(Color.RED);
        g.fillRect(250, 0, 50, 10);
        g.fillRect(240, 10, 90, 10);
        g.fillRect(240, 70, 20, 10);
        g.fillRect(270, 70, 40, 10);
        g.fillRect(230, 80, 30, 10);
        g.fillRect(270, 80, 20, 10);
        g.fillRect(300, 80, 30, 10);
        g.fillRect(220, 90, 40, 10);
        g.fillRect(300, 90, 40, 10);
        g.fillRect(240, 100, 10, 10);
        g.fillRect(310, 100, 10, 10);

        g.setColor(Color.YELLOW);
        g.fillRect(240, 20, 30, 10);
        g.fillRect(230, 30, 10, 10);
        g.fillRect(250, 30, 10, 10);
        g.fillRect(230, 40, 10, 10);
        g.fillRect(250, 40, 20, 10);
        g.fillRect(230, 50, 20, 10);
        g.fillRect(230, 140, 30, 10);
        g.fillRect(300, 140, 30, 10);
        g.fillRect(220, 150, 40, 10);
        g.fillRect(300, 150, 40, 10);

        g.setColor(Color.WHITE);
        g.fillRect(270, 20, 30, 10);
        g.fillRect(310, 20, 10, 10);
        g.fillRect(240, 30, 10, 10);
        g.fillRect(260, 30, 40, 10);
        g.fillRect(310, 30, 30, 10);
        g.fillRect(240, 40, 10, 10);
        g.fillRect(270, 40, 40, 10);
        g.fillRect(320, 40, 30, 10);
        g.fillRect(250, 50, 50, 10);
        g.fillRect(250, 60, 80, 10);
        g.fillRect(220, 100, 20, 10);
        g.fillRect(320, 100, 20, 10);
        g.fillRect(220, 110, 30, 10);
        g.fillRect(310, 110, 30, 10);
        g.fillRect(220, 120, 20, 10);
        g.fillRect(320, 120, 20, 10);

        g.setColor(Color.BLACK);
        g.fillRect(300, 20, 10, 10);
        g.fillRect(300, 30, 10, 10);
        g.fillRect(310, 40, 10, 10);
        g.fillRect(300, 50, 40, 10);

        g.setColor(Color.BLUE);
        g.fillRect(260, 70, 10, 10);
        g.fillRect(260, 80, 10, 10);
        g.fillRect(290, 80, 10, 10);
        g.fillRect(260, 90, 40, 10);
        g.fillRect(250, 100, 10, 10);
        g.fillRect(270, 100, 20, 10);
        g.fillRect(300, 100, 10, 10);
        g.fillRect(250, 110, 60, 10);
        g.fillRect(240, 130, 30, 10);
        g.fillRect(290, 130, 30, 10);
        g.fillRect(240, 120, 80, 10);

        g.setColor(Color.MAGENTA);
        g.fillRect(260, 100, 10, 10);
        g.fillRect(290, 100, 10, 10);

    }
}
