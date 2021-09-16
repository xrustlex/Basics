package basics.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class SponsorPage extends PageObject {

	public final String url = this.baseUrl + MenuPaths.AboutSponsors.getRelativeUrl();
	
	public SponsorPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
}
