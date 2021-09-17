package seleniumDev.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.PageObject;

public class WebDriverDocumentationPage extends PageObject {
	public String url = "documentation/webdriver/";
	
	public WebDriverDocumentationPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
		
		String fullUrl = this.baseUrl + url;
		long navigateWaitTimeoutSecond = 5;
		WebDriverWait urlChangedWait = new WebDriverWait(driver, navigateWaitTimeoutSecond);
		urlChangedWait.until(ExpectedConditions.urlToBe(fullUrl));
	}

	public UnderstandingTheComponentsPage clickUnderstandingTheComponentsLink() {
		WebElement link = driver.findElement(By.linkText("Understanding the components"));
		link.click();
		
		return new UnderstandingTheComponentsPage(driver, this.baseUrl);
	}
}
