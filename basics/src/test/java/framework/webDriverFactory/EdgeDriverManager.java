package framework.webDriverFactory;

import java.net.URL;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {
	
	private final String SYSTEM_PROPERTY_KEY = "webdriver.edge.driver";
	private final String DRIVER_EXE = "msedgedriver.exe";
	
	@Override
	public void createDriver() {
		URL url = ClassLoader.getSystemResource(DRIVER_EXE);
		System.setProperty(SYSTEM_PROPERTY_KEY, url.getFile());

		this.driver = new EdgeDriver();			
	}
}
