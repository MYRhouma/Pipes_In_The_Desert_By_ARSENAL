import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

/**
 * GUI representation of the game map
 */
public class MapGUI extends JFrame {
    private Game game;
    private JPanel mapPanel;
    private int gridSize = 10;
    private int cellSize = 50;
    
    private Map<Element, JPanel> elementGUIMap = new HashMap<>();
    
    public MapGUI(Game game) {
        this.game = game;
        
        setTitle("Pipes In The Desert - Game Map");
        setSize(gridSize * cellSize + 200, gridSize * cellSize + 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create map panel with grid layout
        mapPanel = new JPanel();
        mapPanel.setLayout(new GridLayout(gridSize, gridSize));
        mapPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        // Initialize empty grid
        for (int i = 0; i < gridSize * gridSize; i++) {
            final int row = i / gridSize;
            final int col = i % gridSize;
            
            JPanel cell = new JPanel();
            cell.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            
            // Add mouse listener for placing elements
            cell.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    handleCellClick(row, col, e);
                }
            });
            
            mapPanel.add(cell);
        }
        
        // Add map panel to frame
        add(mapPanel, BorderLayout.CENTER);
        
        // Add toolbar for element selection
        JPanel toolbar = new JPanel();
        JButton pipeTool = new JButton("Pipe");
        JButton cisternTool = new JButton("Cistern");
        JButton springTool = new JButton("Spring");
        JButton pumpTool = new JButton("Pump");
        
        toolbar.add(pipeTool);
        toolbar.add(cisternTool);
        toolbar.add(springTool);
        toolbar.add(pumpTool);
        
        add(toolbar, BorderLayout.SOUTH);
    }
    
    private void handleCellClick(int row, int col, MouseEvent e) {
        // Will be implemented to place elements on the map
        System.out.println("Cell clicked: " + row + ", " + col);
    }
    
    public void updateMap() {
        // Update map display based on game state
        // This will be implemented later
    }
}
