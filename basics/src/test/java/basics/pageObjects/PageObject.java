package basics.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageObject {
	protected ChromeDriver driver;
	protected String baseUrl;
	
	protected PageObject(ChromeDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;

		PageFactory.initElements(driver, this);
	}
}
