package basics.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuComponent {
	final long ATTRIBUTE_TO_MATCH_TIMEOUT_SECONDS = 5;
	private WebElement mappedElement;
	private By menuItemRoot = By.tagName("ul");
	private WebElement menuItemRootElement;
	private WebDriver driver;
	
	public MenuComponent(WebElement mappedElement, WebDriver driver) {
		this.mappedElement = mappedElement;
		this.driver = driver;
	}

	public void navigate(String menuItemPath) {
		String[] menuPathSegments = menuItemPath.split("/");

		String menuItem = menuPathSegments[0];
		this.menuItemRootElement = this.mappedElement.findElement(menuItemRoot);
		WebElement listItemElement = getMenuListItemElement(menuItem);
		WebElement anchorElement = listItemElement.findElement(By.tagName("a"));
		anchorElement.click();	

		if(menuPathSegments.length < 2) {
			return;
		}

		WebDriverWait wait = new WebDriverWait(this.driver, ATTRIBUTE_TO_MATCH_TIMEOUT_SECONDS);
		wait.until(ExpectedConditions.attributeToBe(anchorElement, "aria-expanded", "true"));	
			
		String popupMenuItem = menuPathSegments[1];
		WebElement popupMenuElement = listItemElement.findElement(By.xpath("./div//a[text()='" + popupMenuItem + "']"));
		
		popupMenuElement.click();
	}	

	private WebElement getMenuListItemElement(String menuItem) {
		return this.menuItemRootElement.findElement(By.xpath("//li/a[.//text()='"+menuItem+"']/parent::li"));
	}
}
