import javax.swing.*;
import java.awt.*;

/**
 * GUI representation of a pipe
 */
public class PipeGUI extends JPanel {
    private Pipe pipe;
    
    public PipeGUI(Pipe pipe) {
        this.pipe = pipe;
        setPreferredSize(new Dimension(50, 50));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (pipe.isBroken()) {
            g2d.setColor(Color.RED);
        } else if (pipe.hasWater()) {
            g2d.setColor(Color.BLUE);
        } else {
            g2d.setColor(Color.GRAY);
        }
        
        g2d.fillRect(10, 20, 30, 10);
    }
}
