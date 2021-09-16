package basics.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	
	protected MenuComponent getMenu() {
		WebElement menuRootElement = driver.findElement(By.id("main_navbar"));

		MenuComponent menu = new MenuComponent(menuRootElement, this.driver);
		
		return menu;
	}

	public void goToUrl(String url) {
		String fullUrl = this.baseUrl + url;
		
		driver.navigate().to(fullUrl);		
	}
}
