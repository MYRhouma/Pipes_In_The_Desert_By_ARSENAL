/**
 * Represents a pipe in the water distribution network
 */
public class Pipe extends Element {
    private boolean hasWater = false;
    private boolean isBroken = false;
    
    public Pipe(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void update() {
        // Basic update logic
    }
    
    public boolean hasWater() {
        return hasWater;
    }
    
    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }
    
    public boolean isBroken() {
        return isBroken;
    }
    
    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
