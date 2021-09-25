package theInternet.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends framework.PageObject {

	private String url = "/dropdown";

	@FindBy(how=How.ID, using="dropdown")
	private WebElement dropdownElement;

	public DropdownPage(WebDriver webDriver, String baseUrl) {
		super(webDriver, baseUrl);
	}

	public DropdownPage navigate() {
		super.goToUrl(url );

		return this;
	}

	public DropdownPage selectDropdownOption(String option) {
		getDropdown().selectByVisibleText(option);

		return this;
	}

	public String getSelectedDropdownOption() {
		return getDropdown().getFirstSelectedOption().getText();
	}

	private Select getDropdown() {
		return new Select(dropdownElement);		
	}
}
