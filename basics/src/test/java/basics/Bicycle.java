package basics;

public class Bicycle {

	private int odometer;

	public int getOdometer() {
		return odometer;
	}

	public void drive(int distance) {
		odometer += distance;
	}
}
