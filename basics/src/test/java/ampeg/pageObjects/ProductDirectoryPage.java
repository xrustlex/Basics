package ampeg.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObject;

public class ProductDirectoryPage extends PageObject {

	@FindBy(how=How.XPATH, using="//table[@id='tableMain']//img[@alt='SVT Pro Series: Bass heads']/parent::a")
	private WebElement svtProSeriesLink;

	@FindBy(how=How.XPATH, using="//table[@id='tableMain']//img[@alt='Classic Series: Bass heads & enclosures']/parent::a")
	private WebElement classicSeriesLink;

	public ProductDirectoryPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public ProSeriesPage viewSvtProSeriesProductLineDetails() {
		svtProSeriesLink.click();

		return new ProSeriesPage(this.driver, this.baseUrl);
	}

	public ClassicSeriesPage viewClassicSeriesProductLineDetails() {
		classicSeriesLink.click();

		return new ClassicSeriesPage(this.driver, this.baseUrl);
	}
}
