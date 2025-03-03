public class Game {
    private boolean isRunning = false;
    
    public Game() {
        // Constructor
    }
    
    public void start() {
        isRunning = true;
        System.out.println("Game started");
    }
    
    public void stop() {
        isRunning = false;
        System.out.println("Game stopped");
    }
}
