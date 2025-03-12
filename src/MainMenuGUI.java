import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Main GUI class for the game
 */
public class MainMenuGUI extends JFrame {
    
    public MainMenuGUI() {
        setTitle("Pipes In The Desert");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        JLabel titleLabel = new JLabel("Pipes In The Desert", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        
        JButton startButton = new JButton("Start Game");
        JButton optionsButton = new JButton("Options");
        JButton exitButton = new JButton("Exit");
        
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ConfigurationGUI configGUI = new ConfigurationGUI();
                configGUI.setVisible(true);
            }
        });
        
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        buttonPanel.add(startButton);
        buttonPanel.add(optionsButton);
        buttonPanel.add(exitButton);
        
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        
        add(mainPanel);
        setVisible(true);
    }
}
