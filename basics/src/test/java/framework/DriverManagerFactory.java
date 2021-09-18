package framework;

public class DriverManagerFactory {
	public static DriverManager getManager(String driverType) {

		switch(driverType)
		{
			case DriverTypes.chrome:
				return new ChromeDriverManager();
			case DriverTypes.edge:
				return new EdgeDriverManager();
			default:
				throw new IllegalArgumentException(driverType + " is not a supported browser.");		
		}
	}
}
