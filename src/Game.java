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
    private int currentPlayerIndex = 0;
    
    public MapGUI mapGUI;
    
    public Game() {
        // Constructor
    }
    
    public void initMap() {
        mapGUI = new MapGUI(this);
        mapGUI.setVisible(true);
    }
    
    public void start() {
        isRunning = true;
        initMap();
        gameLoop();
    }
    
    public void stop() {
        isRunning = false;
        System.out.println("Game stopped");
    }
    
    private void gameLoop() {
        while (isRunning) {
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
