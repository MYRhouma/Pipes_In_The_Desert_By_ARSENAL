import javax.swing.*;
import java.awt.*;

/**
 * GUI representation of a cistern
 */
public class CisternGUI extends JPanel {
    private Cistern cistern;
    
    public CisternGUI(Cistern cistern) {
        this.cistern = cistern;
        setPreferredSize(new Dimension(70, 70));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Draw cistern container
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(10, 10, 50, 50);
        
        // Draw water level
        int waterHeight = (int)(cistern.getWaterLevel() * 50.0 / cistern.getCapacity());
        g2d.setColor(Color.BLUE);
        g2d.fillRect(10, 60 - waterHeight, 50, waterHeight);
    }
}
