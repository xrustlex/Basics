package basics.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDevHomePage extends PageObject {
	public SeleniumDevHomePage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public WebDriverDocumentationPage clickReadMoreButtonSeleniumWebDriver() {
		long elementToBeClickableTimeoutSeconds = 5;
		WebElement button = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']/ancestor::div[@class='card h-100 border-0 bg-transparent']//a"));
		WebDriverWait wait = new WebDriverWait(driver, elementToBeClickableTimeoutSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		return new WebDriverDocumentationPage(driver, baseUrl);
	}

	public HistoryPage clickOnHistoryItemInPopupMenu() {
		clickPopupMenuItem("History");
		
		return new HistoryPage(this.driver, this.baseUrl);
	}

	public EventsPage clickOnEventsItemInPopupMenu() {
		WebElement element = clickOnMenuItem("About");
		expandMenuItem(element);
		clickPopupMenuItem("Events");

		return new EventsPage(this.driver, this.baseUrl);
	}

	public NederlandsPage clickOnNederlandsItemInEnglishPopupMenu() {
		WebElement menuElement = getMenuListItemElement("English");
		expandMenuItem(menuElement);
		
		WebElement popupMenuElement = menuElement.findElement(By.tagName("div"));
		
		PopupMenuComponent popupMenu = new PopupMenuComponent(popupMenuElement);
		popupMenu.clickItem("Nederlands");	
		
		return new NederlandsPage(this.driver, this.baseUrl);
	}
	
	private void clickPopupMenuItem(String itemName) {
		WebElement menuElement = getMenuListItemElement("About");
		menuElement.click();
		
		WebElement popupMenuElement = menuElement.findElement(By.tagName("div"));
		PopupMenuComponent popupMenu = new PopupMenuComponent(popupMenuElement);		
		popupMenu.clickItem(itemName);	
	}
	
	private WebElement clickOnMenuItem(String menuItem) {
		WebElement element = getMenuListItemElement(menuItem).findElement(By.tagName("a"));
		element.click();	
		
		return element;
	}

	private WebElement getMenuListItemElement(String menuItem) {
		return driver.findElement(By.xpath("//div[@id='main_navbar']/ul//li/a[text()='"+menuItem+"']/parent::li"));
	}
	
	private void expandMenuItem(WebElement menuItemElement) {
		WebElement anchorElement = menuItemElement.findElement(By.tagName("a"));
		
		if(anchorElement.getAttribute("aria-expanded") == "true") {
			return;
		}
		
		menuItemElement.click();
		
		long attributeToMatchTimeoutSeconds = 5;
		WebDriverWait wait = new WebDriverWait(driver, attributeToMatchTimeoutSeconds);
		wait.until(ExpectedConditions.attributeToBe(anchorElement, "aria-expanded", "true"));	
	}
}
