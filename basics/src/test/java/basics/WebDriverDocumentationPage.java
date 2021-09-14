package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDocumentationPage {
	public String url = "/documentation/webdriver/";
	
	private ChromeDriver driver;
	private String baseUrl;

	public WebDriverDocumentationPage(ChromeDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;

		String fullUrl = this.baseUrl + url;
		long navigateWaitTimeoutSecond = 5;
		WebDriverWait urlChangedWait = new WebDriverWait(driver, navigateWaitTimeoutSecond);
		urlChangedWait.until(ExpectedConditions.urlToBe(fullUrl));
	}
}
