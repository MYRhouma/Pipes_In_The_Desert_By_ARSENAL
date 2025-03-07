/**
 * Abstract base class for all player types
 */
public abstract class Player {
    protected String name;
    protected int x;
    protected int y;
    
    public Player(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
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
        x += dx;
        y += dy;
    }
    
    public abstract void takeTurn(Game game);
}
