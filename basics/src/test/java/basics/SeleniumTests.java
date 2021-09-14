package basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import basics.pageObjects.SeleniumDevHomePage;
import basics.pageObjects.WebDriverDocumentationPage;

public class SeleniumTests {

	final String WEB_DRIVER_SYSTEM_PROPERTY = "webdriver.chrome.driver";
	private ChromeDriver driver;
	private String baseUrl;

	@Before
	public void setup() {
		String chromeDriverPath = "C:\\\\Users\\dtaylor\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
		this.baseUrl = "https://www.selenium.dev/";		

		this.driver = new ChromeDriver();
		this.driver.navigate().to(this.baseUrl);
	}
	
	@Test
	public void sanityTest() {
		String currentUrl = this.driver.getCurrentUrl();
		
		assertTrue("Did not navigate to the url " + this.baseUrl, currentUrl.equals(this.baseUrl));
	}

	@Test
	public void canShowExplicitWait() {
		
		WebDriverDocumentationPage page = 
				new SeleniumDevHomePage(driver, baseUrl)
				.ClickReadMoreButtonSeleniumWebDriver();

		String currentUrl = driver.getCurrentUrl();
		String fullUrl = this.baseUrl + page.url;

		assertTrue("Did not navigate to the url " + fullUrl, currentUrl.equals(fullUrl));	
	}
	
	@Test
	public void canDemonstratePageObjectPattern() {
		//1. Navigate to the Selenium Dev Homepage. 
		//Expected: Page is shown.			
		//2. Click on Read More Button in Selenium WebDriver tile. 
		//Expected: User is taken to the Selenium WebDriver information page.
		//3. Click on the 'Understanding the Components' hyperlink. 
		//Expected: User is taken to the Understanding Components information page.
		//4. Click on the Selenium logo.
		//Expected: User is taken back to the Selenium Dev Homepage.

		SeleniumDevHomePage page = 
				new SeleniumDevHomePage(driver, baseUrl)
				.ClickReadMoreButtonSeleniumWebDriver()
				.ClickUnderstandingTheComponentsLink()
				.ClickSeleniumLogo();
	}


	@After
	public void cleanup() {
		this.driver.quit();
	}
}
