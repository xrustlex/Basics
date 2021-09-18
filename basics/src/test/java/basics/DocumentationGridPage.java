package basics;

import org.openqa.selenium.WebDriver;

import framework.PageObject;

public class DocumentationGridPage extends PageObject {

	public String url = "documentation/grid/";

	public DocumentationGridPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);	
	}

	public void navigate() {
		super.goToUrl(url);		
	}
}
