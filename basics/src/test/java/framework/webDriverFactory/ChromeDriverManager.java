package framework.webDriverFactory;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	private final String SYSTEM_PROPERTY_KEY = "webdriver.chrome.driver";
	private final String DRIVER_EXE = "chromedriver.exe";
	
	@Override
	public void createDriver() {
		URL url = ClassLoader.getSystemResource(DRIVER_EXE);
		System.setProperty(this.SYSTEM_PROPERTY_KEY , url.getFile());
		
		this.driver = new ChromeDriver();			
	}
}
