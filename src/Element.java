/**
 * Abstract base class for all game elements
 */
public abstract class Element {
    protected int x;
    protected int y;
    
    public Element(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public abstract void update();
}
