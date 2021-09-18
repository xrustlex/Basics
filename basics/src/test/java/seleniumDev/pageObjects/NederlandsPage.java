package seleniumDev.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

import framework.PageObject;
import seleniumDev.controlExtensions.MenuPaths;

public class NederlandsPage extends PageObject {

	public NederlandsPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public NederlandsPage navigate() {
		getMenu().navigate(MenuPaths.EnglishNederlands);	

		return this;
	}
}
