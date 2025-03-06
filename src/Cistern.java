/**
 * Represents a cistern that collects water
 */
public class Cistern extends Element {
    private int waterLevel = 0;
    private int capacity = 100;
    
    public Cistern(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void update() {
        // Water collection logic
    }
    
    public void addWater(int amount) {
        waterLevel = Math.min(waterLevel + amount, capacity);
    }
    
    public int getWaterLevel() {
        return waterLevel;
    }
    
    public int getCapacity() {
        return capacity;
    }
}
