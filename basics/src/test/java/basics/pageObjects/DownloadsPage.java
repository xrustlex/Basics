package basics.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadsPage extends PageObject {

	public DownloadsPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public DownloadsPage navigate() {
		getMenu().navigate(MenuPaths.Downloads);
		
		return this;
	}
}
