import javax.swing.*;
import java.awt.*;

/**
 * GUI representation of an end of pipe
 */
public class EndOfPipeGUI extends JPanel {
    private EndOfPipe endOfPipe;
    
    public EndOfPipeGUI(EndOfPipe endOfPipe) {
        this.endOfPipe = endOfPipe;
        setPreferredSize(new Dimension(50, 50));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (endOfPipe.isConnected()) {
            g2d.setColor(Color.BLUE);
        } else {
            g2d.setColor(Color.GRAY);
        }
        
        // Draw end cap
        g2d.fillRect(10, 20, 15, 10);
        g2d.fillOval(25, 15, 20, 20);
    }
}
