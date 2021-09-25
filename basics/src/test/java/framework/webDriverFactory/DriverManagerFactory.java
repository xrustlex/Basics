package framework.webDriverFactory;

public class DriverManagerFactory {
	public static DriverManager getManager(String browserType) {

		switch(browserType)
		{
			case BrowserTypes.chrome:
				return new ChromeDriverManager();
			case BrowserTypes.edge:
				return new EdgeDriverManager();
			default:
				throw new IllegalArgumentException(browserType + " is not a supported browser.");		
		}
	}
}
