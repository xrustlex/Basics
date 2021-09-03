package basics;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VehicleTests {

	@Test
	public void canBuildCar() {
		Car corvette = buildCorvette();
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
		Car car = buildCorvette();
		int distance = 1;
		
		int odometerBefore = car.getOdometer();
		car.start();
		car.drive(distance);
		int odometerAfter = car.getOdometer();
		
		assertTrue("Could not drive car.", odometerAfter == odometerBefore + distance);
	}
	
	@Test
	public void carsHaveCorrectEngineSize() {
		int smallEngineCylinderCount = 4;
		int largeEngineCylinderCount = 8;
		LargeEngine largeEngine = new LargeEngine();
		SmallEngine smallEngine = new SmallEngine();
		
		assertTrue("Large engine should have cylinder count of " + largeEngineCylinderCount, largeEngine.getCylinderCount() == largeEngineCylinderCount);
		assertTrue("Small engine should have cylinder count of " + smallEngineCylinderCount, smallEngine.getCylinderCount() == smallEngineCylinderCount);	
	}
	
	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar convertibleCar = buildCabrio();
		convertibleCar.start();
		
		assertTrue("Convertible car was not started", convertibleCar.getIsStarted());
	}
	
	@Test
	public void canToggleConvertibleTop() {
		ConvertibleCar convertibleCar = buildCabrio();
		
		convertibleCar.lowerTop();
		boolean isTopLowered = convertibleCar.isTopLowered();
		
		assertTrue("Convertible top was not lowered", isTopLowered);
		
		convertibleCar.raiseTop();
		boolean	isTopRaised = !convertibleCar.isTopLowered();
		
		assertTrue("Convertible top was not raised", isTopRaised);
	}
	
	private Car buildCorvette() {
		LargeEngine engine = new LargeEngine();
		return new Car("Corvette", engine);
	}
	
	private ConvertibleCar buildCabrio() {
		SmallEngine engine = new SmallEngine();
		return new ConvertibleCar("Cabrio", engine);
	}
}
