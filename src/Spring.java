/**
 * Represents a water spring that acts as the source of water
 */
public class Spring extends Element {
    private int waterOutput = 10; // Water units per second
    
    public Spring(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void update() {
        // Water generation logic will go here
    }
    
    public int getWaterOutput() {
        return waterOutput;
    }
}
