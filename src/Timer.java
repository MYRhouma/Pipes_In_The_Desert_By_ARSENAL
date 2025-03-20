/**
 * Game timer for managing turn time and overall game duration
 */
public class Timer {
    private long startTime;
    private long duration;
    private boolean isRunning;
    
    public Timer(long durationInMillis) {
        this.duration = durationInMillis;
        this.isRunning = false;
    }
    
    public void start() {
        startTime = System.currentTimeMillis();
        isRunning = true;
    }
    
    public void stop() {
        isRunning = false;
    }
    
    public boolean isTimeUp() {
        if (!isRunning) {
            return false;
        }
        
        long currentTime = System.currentTimeMillis();
        return (currentTime - startTime) >= duration;
    }
    
    public long getRemainingTime() {
        if (!isRunning) {
            return duration;
        }
        
        long currentTime = System.currentTimeMillis();
        long elapsed = currentTime - startTime;
        return Math.max(0, duration - elapsed);
    }
    
    public int getRemainingSeconds() {
        return (int)(getRemainingTime() / 1000);
    }
}
