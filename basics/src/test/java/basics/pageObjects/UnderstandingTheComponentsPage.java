package basics.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingTheComponentsPage {
	public String url = "documentation/webdriver/understanding_the_components/";

	private ChromeDriver driver;
	private String baseUrl;
	
	public UnderstandingTheComponentsPage(ChromeDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;
	}

	public SeleniumDevHomePage ClickSeleniumLogo() {
		WebElement homePageLink = driver.findElement(By.id("selenium_logo"));
		homePageLink.click();
		
		return new SeleniumDevHomePage(driver, this.baseUrl);
	}
}
