package ampeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObject;

public class Svt3ProDetailsPage extends PageObject {

	@FindBy(how=How.XPATH, using="//div[@id='navLinks']//a[text()='Home']")
	private WebElement homeBreadCrumb;

	public Svt3ProDetailsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public HomePage clickHomeBreadcrumb() {
		homeBreadCrumb.click();

		return new HomePage(this.driver, this.baseUrl);
	}
}
