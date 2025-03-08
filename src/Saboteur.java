/**
 * Represents a saboteur who breaks pipes
 */
public class Saboteur extends Player {
    
    public Saboteur(String name) {
        super(name);
    }
    
    @Override
    public void takeTurn(Game game) {
        // Saboteur turn logic will go here
    }
    
    public void breakPipe(Pipe pipe) {
        if (pipe != null && !pipe.isBroken()) {
            pipe.setBroken(true);
        }
    }
}
