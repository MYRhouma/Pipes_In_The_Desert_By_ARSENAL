import javax.swing.*;
import java.awt.*;

/**
 * GUI representation of a saboteur
 */
public class SaboteurGUI extends JPanel {
    private Saboteur saboteur;
    
    public SaboteurGUI(Saboteur saboteur) {
        this.saboteur = saboteur;
        setPreferredSize(new Dimension(40, 40));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Draw saboteur
        g2d.setColor(Color.RED);
        g2d.fillOval(5, 5, 30, 30);
        
        // Draw face
        g2d.setColor(Color.BLACK);
        g2d.fillOval(12, 12, 6, 6);
        g2d.fillOval(22, 12, 6, 6);
        g2d.drawArc(12, 22, 16, 8, 0, 180);
    }
}
