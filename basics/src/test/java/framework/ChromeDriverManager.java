package framework;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		URL url = ClassLoader.getSystemResource("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", url.getFile());
		
		this.driver = new ChromeDriver();			
	}
}
