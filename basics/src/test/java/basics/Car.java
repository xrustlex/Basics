package basics;

public class Car {
	public String model;

	private int odometer;

	private IEngine engine;
	
	public Car(String model) {
		this.model = model;
		this.engine = new LargeEngine();		
	}
	
	public void drive(int distance) {
		
	}
	
	public void start() {
		engine.start();
	}

	public int getOdometer() {
		return odometer;
	}
}
