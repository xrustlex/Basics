package basics;

import org.openqa.selenium.chrome.ChromeDriver;

import framework.PageObject;

public class DocumentationGridPage extends PageObject {

	public String url = "documentation/grid/";
	
	public DocumentationGridPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);	
	}

	public void navigate() {
		super.goToUrl(url);		
	}
}
