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
        // Reset actions at the start of turn
        resetActions();
        System.out.println("Plumber " + getName() + " is taking their turn");
    }
    
    public void placePipe(Game game, int x, int y) {
        if (hasPickedUpPipe && actionsRemaining > 0) {
            Pipe pipe = new Pipe(x, y);
            game.addPipe(pipe);
            hasPickedUpPipe = false;
            actionsRemaining--;
        }
    }
    
    public void pickUpPipe() {
        if (actionsRemaining > 0) {
            hasPickedUpPipe = true;
            actionsRemaining--;
        }
    }
    
    public void repairPipe(Pipe pipe) {
        if (pipe != null && pipe.isBroken() && actionsRemaining > 0) {
            pipe.setBroken(false);
            actionsRemaining--;
        }
    }
}
