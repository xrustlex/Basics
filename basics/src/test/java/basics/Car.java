package basics;

public class Car extends Vehicle {
	public String model;

	private IEngine engine;
	
	public Car(String model, IEngine engine) {
		this.model = model;
		this.engine = engine;		
	}

	public void start() {
		this.engine.start();
	}
}
