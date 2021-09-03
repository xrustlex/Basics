package basics;

public class Car extends Vehicle {
	public String model;

	private IEngine engine;
	
	public Car(String model) {
		this.model = model;
		this.engine = new LargeEngine();		
	}

	public void start() {
		this.engine.start();
	}
}
