package ampeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObject;

public class HomePage extends PageObject {

	@FindBy(how=How.CSS, using="#global-topnav ul li>a[title=Products]")
	private WebElement productsLink;

	public HomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public ProductDirectoryPage clickProductsMenuLink() {
		productsLink.click();

		return new ProductDirectoryPage(this.driver, this.baseUrl);
	}
}
