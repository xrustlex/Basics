package seleniumDev.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObject;

public class UnderstandingTheComponentsPage extends PageObject {
	public String url = "documentation/webdriver/understanding_the_components/";

	@FindBy(how=How.ID, using="selenium_logo")
	private WebElement seleniumLogo;

	@FindBy(how=How.TAG_NAME, using="p")
	private WebElement firstParagraph;

	public UnderstandingTheComponentsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public SeleniumDevHomePage clickSeleniumLogo() {
		seleniumLogo.click();

		return new SeleniumDevHomePage(driver, this.baseUrl);
	}

	public String getFirstParagraph() {
		return firstParagraph.getText();
	}
}
