package seleniumDev.pageObjects;

import org.openqa.selenium.WebDriver;
import framework.PageObject;
import seleniumDev.controlExtensions.MenuPaths;

public class DownloadsPage extends PageObject {

	public DownloadsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public DownloadsPage navigate() {
		getMenu().navigate(MenuPaths.Downloads);

		return this;
	}
}
