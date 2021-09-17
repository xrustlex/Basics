package designPatterns;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class SingletonTests {

	@Test
	public void verifySingletonReturnsSameInstance() {
		Singleton instanceOne = Singleton.getInstance();
		Singleton instanceTwo = Singleton.getInstance();
		
		assertTrue("Singleton is not returning same instance.", instanceOne.equals(instanceTwo));
	}
	
	@Test
	public void verifyCannotInstantiateSingleton() throws NoSuchMethodException, SecurityException {
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		
		assertTrue("Singleton constructor is not private.", Modifier.isPrivate(constructor.getModifiers()));
	}
}
