package demoQa;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFormPracticePage extends framework.PageObject {

	private String url = "/automation-practice-form";

	public AutomationFormPracticePage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AutomationFormPracticePage navigate() {
		super.goToUrl(url);
		
		return this;
	}
}
