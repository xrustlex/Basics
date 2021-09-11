package basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {

	final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	
	@Test
	public void test() {
		String chromeDriverPath = "C:\\\\Users\\dtaylor\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
		String url = "https://www.selenium.dev/";

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);

		String currentUrl = driver.getCurrentUrl();
		assertTrue("Did not navigate to the url " + url, currentUrl.equals(url));
	}
}
