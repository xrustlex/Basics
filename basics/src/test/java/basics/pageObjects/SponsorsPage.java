package basics.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class SponsorsPage extends PageObject {

	public final String url = this.baseUrl + MenuPaths.AboutSponsors.getRelativeUrl();

	public SponsorsPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public SponsorsPage navigate() {
		getMenu().navigate(MenuPaths.AboutSponsors);	

		return this;		
	}
}
