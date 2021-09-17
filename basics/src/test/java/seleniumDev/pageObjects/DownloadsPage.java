package seleniumDev.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

import framework.PageObject;
import seleniumDev.controlExtensions.MenuPaths;

public class DownloadsPage extends PageObject {

	public DownloadsPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public DownloadsPage navigate() {
		getMenu().navigate(MenuPaths.Downloads);
		
		return this;
	}
}
