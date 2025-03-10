/**
 * Represents the end of a pipe network
 */
public class EndOfPipe extends Element {
    private boolean isConnected = false;
    
    public EndOfPipe(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void update() {
        // End of pipe update logic
    }
    
    public boolean isConnected() {
        return isConnected;
    }
    
    public void setConnected(boolean connected) {
        isConnected = connected;
    }
}
