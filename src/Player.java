/**
 * Abstract base class for all player types
 */
public abstract class Player {
    protected String name;
    protected int x;
    protected int y;
    protected int actionsRemaining;
    
    public Player(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
        this.actionsRemaining = 3; // Default actions per turn
    }
    
    public String getName() {
        return name;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void move(int dx, int dy) {
        if (actionsRemaining > 0) {
            x += dx;
            y += dy;
            actionsRemaining--;
        }
    }
    
    public void resetActions() {
        actionsRemaining = 3;
    }
    
    public int getActionsRemaining() {
        return actionsRemaining;
    }
    
    public abstract void takeTurn(Game game);
}
