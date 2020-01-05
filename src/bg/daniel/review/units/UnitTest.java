package bg.daniel.review.units;

public abstract class UnitTest {
	Runtime run = Runtime.getRuntime();
	long startTime;
	
	public void init() {
		startTime = System.currentTimeMillis();
		
		load();
	}
    abstract void load();

    public long getTime() {
    	return System.currentTimeMillis() - startTime;
    }
    
    public long getFreeMemory() {
    	return run.freeMemory();
    }
    public long getTotalMemory() {
    	return run.totalMemory();
    }
}
