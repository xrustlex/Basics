package basics.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuComponent {

	// passed #main_navbar
	private WebElement mappedElement;

	private By menuItemRoot = By.tagName("ul");

	private WebElement menuItemRootElement;

	public MenuComponent(WebElement mappedElement) {
		this.mappedElement = mappedElement;
	}

	public void navigate(String menuItem) {
		this.menuItemRootElement = this.mappedElement.findElement(menuItemRoot);
		WebElement menuItemListItem = getMenuListItemElement(menuItem);
		WebElement menuItemAnchor = menuItemListItem.findElement(By.tagName("a"));
		menuItemAnchor.click();		
	}	

	private WebElement getMenuListItemElement(String menuItem) {
		return this.menuItemRootElement.findElement(By.xpath(".//li/a/span[text()='" + menuItem + "']/../.."));
	}
}
