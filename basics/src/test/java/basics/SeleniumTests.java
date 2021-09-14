package basics;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	public void test() {
		String currentUrl = this.driver.getCurrentUrl();
		
		assertTrue("Did not navigate to the url " + this.baseUrl, currentUrl.equals(this.baseUrl));
	}

	@Test
	public void canShowExplicitWait() {
		String chromeDriverPath = "C:\\\\Users\\dtaylor\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
		String baseUrl = "https://www.selenium.dev/";
		String documentationPageUrl = baseUrl + "documentation/webdriver/";
		long elementToBeClickableTimeoutSeconds = 5;
		long navigateWaitTimeoutSecond = 5;

		WebDriver driver = new ChromeDriver();
		driver.navigate().to(baseUrl);

		WebElement button = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']/ancestor::div[@class='card h-100 border-0 bg-transparent']//a"));
		WebDriverWait wait = new WebDriverWait(driver, elementToBeClickableTimeoutSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();

		WebDriverWait urlChangedWait = new WebDriverWait(driver, navigateWaitTimeoutSecond);
		urlChangedWait.until(ExpectedConditions.urlToBe(documentationPageUrl));

		String currentUrl = driver.getCurrentUrl();

		assertTrue("Did not navigate to the url " + documentationPageUrl, currentUrl.equals(documentationPageUrl));	

		driver.quit();
	}
	
	@Test
	public void canShowExplicitFluentWait() {
		String chromeDriverPath = "C:\\\\Users\\dtaylor\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
		String baseUrl = "https://www.selenium.dev/";
		String documentationPageUrl = baseUrl + "documentation/webdriver/";
		long elementToBeClickableTimeoutSeconds = 5;
		Duration navigateWaitTimeoutSecond = Duration.ofSeconds(5);
		Duration pollingIntervalMilliseconds = Duration.ofMillis(100);
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(baseUrl);

		WebElement button = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']/ancestor::div[@class='card h-100 border-0 bg-transparent']//a"));
		WebDriverWait wait = new WebDriverWait(driver, elementToBeClickableTimeoutSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();

		FluentWait<WebDriver> urlChangedWait = new FluentWait<WebDriver>(driver)
				.withTimeout(navigateWaitTimeoutSecond)
				.pollingEvery(pollingIntervalMilliseconds)
				.ignoring(NoSuchElementException.class);
				
		urlChangedWait.until(ExpectedConditions.urlToBe(documentationPageUrl));

		String currentUrl = driver.getCurrentUrl();

		assertTrue("Did not navigate to the url " + documentationPageUrl, currentUrl.equals(documentationPageUrl));	

		driver.quit();
	}

	@Test
	public void canDemonstratePageObjectPattern() {
		String chromeDriverPath = "C:\\\\Users\\dtaylor\\chromedriver.exe";
		System.setProperty(WEB_DRIVER_SYSTEM_PROPERTY, chromeDriverPath);
		String baseUrl = "https://www.selenium.dev/";
		
		WebDriver driver = new ChromeDriver();

		//1. Navigate to the Selenium Dev Homepage. 
		driver.navigate().to(baseUrl);
		//Expected: Page is shown.		
	
		//2. Click on Read More Button in Selenium WebDriver tile. 
		WebElement button = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']/ancestor::div[@class='card h-100 border-0 bg-transparent']//a"));
		button.click();
		//Expected: User is taken to the Selenium WebDriver information page.
		
		//3. Click on the 'Understanding the Components' hyperlink. 
		WebElement link = driver.findElement(By.linkText("Understanding the components"));
		link.click();

		//Expected: User is taken to the Understanding Components information page.
		
		//4. Click on the Selenium logo. 
		WebElement homePageLink = driver.findElement(By.id("selenium_logo"));
		homePageLink.click();
		
		//Expected: User is taken back to the Selenium Dev Homepage.
	}


	@After
	public void cleanup() {
		this.driver.quit();
	}
}
