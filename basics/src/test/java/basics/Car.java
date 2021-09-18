package basics;

public class Car extends Vehicle {
	public String model;

	private IEngine engine;

	private boolean isStarted;

	public Car(String model, IEngine engine) {
		this.model = model;
		this.engine = engine;		
	}

	public void start() {
		this.engine.start();
		this.isStarted = true;
	}

	public boolean getIsStarted() {
		return isStarted;
	}

	public void drive(int distance) {
		if(getIsStarted()) {
			this.odometer += distance;
		}
	}
}
