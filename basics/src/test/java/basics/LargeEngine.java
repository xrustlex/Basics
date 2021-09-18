package basics;

public class LargeEngine implements IEngine {

	private final int cylinderCount = 8;

	public void start() {
		System.out.println("Engine started");	
	}

	public int getCylinderCount() {
		return cylinderCount;
	}
}
