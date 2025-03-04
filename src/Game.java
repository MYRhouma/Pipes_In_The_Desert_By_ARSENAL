import java.util.ArrayList;
import java.util.List;

public class Game {
    private boolean isRunning = false;
    private List<Element> elements = new ArrayList<>();
    
    public Game() {
        // Constructor
    }
    
    public void start() {
        isRunning = true;
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
}
