package ampeg.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import framework.PageObject;

public class ProSeriesPage extends PageObject {

	@FindBy(how=How.XPATH, using="//table[@id='prodContent']//img[@alt='SVT-3PRO']/parent::a")
	private WebElement svt3ProLink;
	
	public ProSeriesPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public Svt3ProDetailsPage viewSvt3ProProductDetails() {
		svt3ProLink.click();
		
		return new Svt3ProDetailsPage(this.driver, this.baseUrl);
	}
}
