package framework;

import java.net.URL;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		URL url = ClassLoader.getSystemResource("msedgedriver.exe");
		System.setProperty("webdriver.edge.driver", url.getFile());

		this.driver = new EdgeDriver();			
	}
}
