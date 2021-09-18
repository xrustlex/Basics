package basics;

public class ConvertibleCar extends ConvertibleVehicle {

	private boolean isTopLowered;
	private boolean isStarted;

	public ConvertibleCar(String model, IEngine engine) {
		super();
	}

	public void lowerTop() {
		this.isTopLowered = true;		
	}

	public void raiseTop() {
		this.isTopLowered = false;			
	}

	public boolean isTopLowered() {
		return this.isTopLowered;
	}

	public void start() {
		this.isStarted = true;
	}

	public boolean getIsStarted() {
		return isStarted;
	}
}
