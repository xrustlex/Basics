package basics;

public class Bicycle {

	protected int odometer;

	public int getOdometer() {
		return this.odometer;
	}

	public void drive(int distance) {
		this.odometer += distance;
	}
}
