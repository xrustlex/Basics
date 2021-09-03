package basics;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VehicleTests {

	@Test
	public void canBuildCar() {
		Car corvette = new Car("Corvette");
		corvette.start();
	}
	
	@Test
	public void canBuildBicycle() {
		// arrange
		Bicycle bike = new Bicycle();
		int distance = 1;
		
		// act
		int odometerBefore = bike.getOdometer();
		bike.drive(distance);
		int odometerAfter = bike.getOdometer();
		
		// assert
		assertTrue("Could not drive bicycle.", odometerAfter == odometerBefore + distance);
	}
}
