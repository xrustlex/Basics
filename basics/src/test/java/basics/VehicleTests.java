package basics;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VehicleTests {

	@Test
	public void canBuildCar() {
		LargeEngine engine = new LargeEngine();
		Car corvette = new Car("Corvette", engine);
		corvette.start();
	}
	
	@Test
	public void canBuildBicycle() {
		Bicycle bike = new Bicycle();
		int distance = 1;
		
		int odometerBefore = bike.getOdometer();
		bike.drive(distance);
		int odometerAfter = bike.getOdometer();
		
		assertTrue("Could not drive bicycle.", odometerAfter == odometerBefore + distance);
	}
	
	@Test
	public void canIncrementOdometer() {
		LargeEngine engine = new LargeEngine();
		Car car = new Car("corvette", engine);
		int distance = 1;
		
		int odometerBefore = car.getOdometer();
		car.start();
		car.drive(distance);
		int odometerAfter = car.getOdometer();
		
		assertTrue("Could not drive car.", odometerAfter == odometerBefore + distance);
	}
}
