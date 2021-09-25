package basics;

import org.openqa.selenium.WebDriver;
import framework.PageObject;

public class DocumentationGridPage extends PageObject {

	public String url = "documentation/grid/";

	public DocumentationGridPage(WebDriver webDriver, String baseUrl) {
		super(webDriver, baseUrl);	
	}

	public void navigate() {
		super.goToUrl(url);		
	}
}
