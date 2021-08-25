package basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTests {

	@Test
	public void test() {
		// arrange - setup for this test	
		int dayOfTheMonth = 24;
		
		// act - actions for this test
		SomeClass myInstance = new SomeClass();
		int dayOfMonth = myInstance.getDayOfMonth();
		
		// assert - assertions for this test
		assertTrue("Days of the month should match", dayOfTheMonth == dayOfMonth);
	}

	@Test
	public void test2() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test4() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test5() {
		fail("Not yet implemented");
	}
}
