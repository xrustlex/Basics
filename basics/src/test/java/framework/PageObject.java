package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import seleniumDev.controlExtensions.Menu;

public abstract class PageObject {
	protected ChromeDriver driver;
	protected String baseUrl;

	protected PageObject(ChromeDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;

		PageFactory.initElements(driver, this);
	}

	protected Menu getMenu() {
		WebElement menuRootElement = driver.findElement(By.id("main_navbar"));

		Menu menu = new Menu(menuRootElement, this.driver);

		return menu;
	}

	public void goToUrl(String relativeUrl) {
		String fullUrl = this.baseUrl + relativeUrl;

		this.driver.navigate().to(fullUrl);		
	}

	public Object executeJavascript(String script, Object arguments) {
		JavascriptExecutor js = (JavascriptExecutor) this.driver;  
		return js.executeScript(script, arguments);
	}
}
