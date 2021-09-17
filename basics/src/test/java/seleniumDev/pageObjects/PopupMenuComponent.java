package seleniumDev.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopupMenuComponent {
	private WebElement mappedElement;

	public PopupMenuComponent(WebElement mappedElement) {
		this.mappedElement = mappedElement;
	}

	public void clickItem(String itemName) {
		WebElement menuItem = this.mappedElement.findElement(By.xpath(".//a[text()='" + itemName + "']"));
		
		menuItem.click();
	}	
}
