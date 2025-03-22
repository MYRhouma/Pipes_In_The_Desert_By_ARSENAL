/**
 * Represents a saboteur who breaks pipes
 */
public class Saboteur extends Player {
    
    public Saboteur(String name) {
        super(name);
    }
    
    @Override
    public void takeTurn(Game game) {
        // Reset actions at the start of turn
        resetActions();
        System.out.println("Saboteur " + getName() + " is taking their turn");
    }
    
    public void breakPipe(Pipe pipe) {
        if (pipe != null && !pipe.isBroken() && actionsRemaining > 0) {
            pipe.setBroken(true);
            actionsRemaining--;
        }
    }
}
