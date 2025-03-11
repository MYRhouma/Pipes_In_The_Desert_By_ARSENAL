import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Configuration screen for game settings
 */
public class ConfigurationGUI extends JFrame {
    private JTextField playersField;
    private JSlider gameDurationSlider;
    
    public ConfigurationGUI() {
        setTitle("Game Configuration");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        
        // Players configuration
        JPanel playersPanel = new JPanel();
        playersPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        playersPanel.add(new JLabel("Number of players: "));
        playersField = new JTextField("4", 2);
        playersPanel.add(playersField);
        
        // Game duration configuration
        JPanel durationPanel = new JPanel();
        durationPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        durationPanel.add(new JLabel("Game duration (minutes): "));
        gameDurationSlider = new JSlider(1, 10, 5);
        gameDurationSlider.setMajorTickSpacing(1);
        gameDurationSlider.setPaintTicks(true);
        gameDurationSlider.setPaintLabels(true);
        durationPanel.add(gameDurationSlider);
        
        // Add panels to main panel
        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new GridLayout(2, 1, 10, 10));
        settingsPanel.add(playersPanel);
        settingsPanel.add(durationPanel);
        mainPanel.add(settingsPanel, BorderLayout.CENTER);
        
        // Buttons panel
        JPanel buttonsPanel = new JPanel();
        JButton startButton = new JButton("Start Game");
        JButton backButton = new JButton("Back");
        
        buttonsPanel.add(startButton);
        buttonsPanel.add(backButton);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
    }
}
