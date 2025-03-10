/**
 * Represents a pump that increases water pressure in pipes
 */
public class Pump extends Element {
    private boolean isWorking = true;
    private int pressureBoost = 5;
    
    public Pump(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void update() {
        // Pump update logic
    }
    
    public boolean isWorking() {
        return isWorking;
    }
    
    public void setWorking(boolean working) {
        isWorking = working;
    }
    
    public int getPressureBoost() {
        return pressureBoost;
    }
}
