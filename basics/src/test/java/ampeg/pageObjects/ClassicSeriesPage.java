package ampeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObject;

public class ClassicSeriesPage extends PageObject {

	@FindBy(how=How.XPATH, using="//table[@id='prodContent']//a[@href='svt410hlf/']")
	private WebElement svt410HlfLink;

	public ClassicSeriesPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public Svt410HlfProductDetailsPage viewSvt410HlfProductDetails() {
		svt410HlfLink.click();

		return new Svt410HlfProductDetailsPage(this.driver, this.baseUrl);
	}
}
