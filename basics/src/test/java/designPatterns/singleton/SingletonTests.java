package designPatterns.singleton;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class SingletonTests {

	@Test
	public void verifySingletonReturnsSameInstance() {
		DatabaseSingleton instanceOne = DatabaseSingleton.getInstance();
		DatabaseSingleton instanceTwo = DatabaseSingleton.getInstance();
		
		assertTrue("Singleton is not returning same instance.", instanceOne.equals(instanceTwo));
	}
	
	@Test
	public void verifyCannotInstantiateSingleton() throws NoSuchMethodException, SecurityException {
		Constructor<DatabaseSingleton> constructor = DatabaseSingleton.class.getDeclaredConstructor();
		
		assertTrue("Singleton constructor is not private.", Modifier.isPrivate(constructor.getModifiers()));
	}
}
