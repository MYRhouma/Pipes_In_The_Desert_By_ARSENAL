import javax.swing.*;
import java.awt.*;

/**
 * GUI representation of a plumber
 */
public class PlumberGUI extends JPanel {
    private Plumber plumber;
    
    public PlumberGUI(Plumber plumber) {
        this.plumber = plumber;
        setPreferredSize(new Dimension(40, 40));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Draw plumber
        g2d.setColor(Color.BLUE);
        g2d.fillOval(5, 5, 30, 30);
        
        // Draw face
        g2d.setColor(Color.WHITE);
        g2d.fillOval(12, 12, 6, 6);
        g2d.fillOval(22, 12, 6, 6);
        g2d.drawArc(12, 20, 16, 10, 0, -180);
    }
}
