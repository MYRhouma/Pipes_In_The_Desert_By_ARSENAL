import java.util.ArrayList;
import java.util.List;

public class Game {
    private boolean isRunning = false;
    private List<Element> elements = new ArrayList<>();
    private List<Pipe> pipes = new ArrayList<>();
    private List<Pump> pumps = new ArrayList<>();
    private List<Cistern> cisterns = new ArrayList<>();
    private List<Spring> springs = new ArrayList<>();
    private Player[] players;
    private Plumber[] plumbers;
    private Saboteur[] saboteurs;
    private int currentPlayerIndex = 0;
    
    private int turnDuration = 30; // seconds
    private int gameDuration = 300; // seconds
    
    private Timer turnTimer;
    private Timer gameTimer;
    
    public MapGUI mapGUI;
    
    public Game() {
        turnTimer = new Timer(turnDuration * 1000);
        gameTimer = new Timer(gameDuration * 1000);
    }
    
    public void configureGame(int numPlayers) {
        // Create players (half plumbers, half saboteurs)
        players = new Player[numPlayers];
        plumbers = new Plumber[numPlayers / 2];
        saboteurs = new Saboteur[numPlayers / 2];
        
        // Create plumbers
        for (int i = 0; i < numPlayers / 2; i++) {
            plumbers[i] = new Plumber("Plumber " + (i + 1));
            players[i * 2] = plumbers[i];
        }
        
        // Create saboteurs
        for (int i = 0; i < numPlayers / 2; i++) {
            saboteurs[i] = new Saboteur("Saboteur " + (i + 1));
            players[i * 2 + 1] = saboteurs[i];
        }
    }
    
    public void initMap() {
        mapGUI = new MapGUI(this);
        mapGUI.setVisible(true);
    }
    
    public void start() {
        isRunning = true;
        initMap();
        gameTimer.start();
        gameLoop();
    }
    
    public void stop() {
        isRunning = false;
        gameTimer.stop();
        System.out.println("Game stopped");
    }
    
    private void gameLoop() {
        while (isRunning && !gameTimer.isTimeUp()) {
            // Start player turn
            turnTimer.start();
            Player currentPlayer = players[currentPlayerIndex];
            System.out.println("Current player: " + currentPlayer.getName());
            
            // Player takes their turn
            currentPlayer.takeTurn(this);
            
            // Wait for turn to end
            while (!turnTimer.isTimeUp() && isRunning) {
                // Update all game elements
                for (Element element : elements) {
                    element.update();
                }
                
                // Update map GUI
                if (mapGUI != null) {
                    mapGUI.updateMap();
                }
                
                // Sleep to control game speed
                try {
                    Thread.sleep(16); // ~60 FPS
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            // Move to next player
            currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
        }
        
        // Game over
        System.out.println("Game over!");
        endGame();
    }
    
    public void endGame() {
        // Determine winner and show results
        // Will be implemented later
    }
    
    public void addElement(Element element) {
        elements.add(element);
    }
    
    public void addPipe(Pipe pipe) {
        elements.add(pipe);
        pipes.add(pipe);
    }
    
    public void addPump(Pump pump) {
        elements.add(pump);
        pumps.add(pump);
    }
    
    public void addCistern(Cistern cistern) {
        elements.add(cistern);
        cisterns.add(cistern);
    }
    
    public void addSpring(Spring spring) {
        elements.add(spring);
        springs.add(spring);
    }
}
