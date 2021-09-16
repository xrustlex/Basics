package basics.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDevHomePage extends PageObject {
	public SeleniumDevHomePage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public DownloadsPage clickOnDownloadsItemMenu() {
		getMenu().navigate(MenuPaths.Downloads);

		return new DownloadsPage(this.driver, this.baseUrl);
	}

	public EventsPage clickOnEventsItemInPopupMenu() {
		getMenu().navigate(MenuPaths.AboutEvents);

		return new EventsPage(this.driver, this.baseUrl);
	}

	public NederlandsPage clickOnNederlandsItemInEnglishPopupMenu() {
		getMenu().navigate(MenuPaths.EnglishNederlands);

		return new NederlandsPage(this.driver, this.baseUrl);
	}

	public SponsorsPage clickOnSponsorMenuItem() {
		getMenu().navigate(MenuPaths.AboutSponsors);
		
		return new SponsorsPage(this.driver, this.baseUrl);
	}
}
