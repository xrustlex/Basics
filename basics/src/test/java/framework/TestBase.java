package framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {
	final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	protected ChromeDriver driver;
	protected String baseUrl;

	protected TestBase(String baseUrl) {
		this.baseUrl = baseUrl;
		String chromeDriverPath = "C:\\\\Users\\dtaylor\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
	}

	@Before
	public void setup() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.navigate().to(this.baseUrl);		
	}

	@After
	public void cleanup() {
		this.driver.quit();
	}
}