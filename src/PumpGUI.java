import javax.swing.*;
import java.awt.*;

/**
 * GUI representation of a pump
 */
public class PumpGUI extends JPanel {
    private Pump pump;
    
    public PumpGUI(Pump pump) {
        this.pump = pump;
        setPreferredSize(new Dimension(60, 60));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (pump.isWorking()) {
            g2d.setColor(Color.GREEN);
        } else {
            g2d.setColor(Color.RED);
        }
        
        // Draw pump base
        g2d.fillRect(10, 30, 40, 20);
        
        // Draw pump mechanism
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(20, 10, 20, 20);
        g2d.fillRect(25, 5, 10, 5);
    }
}
