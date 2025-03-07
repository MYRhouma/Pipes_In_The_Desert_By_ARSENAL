/**
 * Represents a plumber who builds and repairs pipes
 */
public class Plumber extends Player {
    private boolean hasPickedUpPipe = false;
    
    public Plumber(String name) {
        super(name);
    }
    
    @Override
    public void takeTurn(Game game) {
        // Plumber turn logic will go here
    }
    
    public void placePipe(Game game, int x, int y) {
        if (hasPickedUpPipe) {
            Pipe pipe = new Pipe(x, y);
            game.addElement(pipe);
            hasPickedUpPipe = false;
        }
    }
    
    public void pickUpPipe() {
        hasPickedUpPipe = true;
    }
    
    public void repairPipe(Pipe pipe) {
        if (pipe != null && pipe.isBroken()) {
            pipe.setBroken(false);
        }
    }
}
