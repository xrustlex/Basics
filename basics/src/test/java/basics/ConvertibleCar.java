package basics;

public class ConvertibleCar extends Car {

	private boolean isTopLowered;

	public ConvertibleCar(String model, IEngine engine) {
		super(model, engine);
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
}
