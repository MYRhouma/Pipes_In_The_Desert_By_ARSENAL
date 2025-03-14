import javax.swing.*;
import java.awt.*;

/**
 * GUI representation of a spring
 */
public class SpringGUI extends JPanel {
    private Spring spring;
    
    public SpringGUI(Spring spring) {
        this.spring = spring;
        setPreferredSize(new Dimension(60, 60));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Draw spring
        g2d.setColor(Color.CYAN);
        g2d.fillOval(10, 10, 40, 40);
        
        // Draw ripples
        g2d.setColor(Color.BLUE);
        g2d.drawOval(15, 15, 30, 30);
        g2d.drawOval(20, 20, 20, 20);
    }
}
