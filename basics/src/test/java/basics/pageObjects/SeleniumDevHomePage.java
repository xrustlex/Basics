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

	public SponsorPage clickOnSponsorMenuItem() {
		getMenu().navigate(MenuPaths.AboutSponsors);
		
		return new SponsorPage(this.driver, this.baseUrl);
	}
	
	private MenuComponent getMenu() {
		WebElement menuRootElement = driver.findElement(By.id("main_navbar"));

		MenuComponent menu = new MenuComponent(menuRootElement, this.driver);
		
		return menu;
	}
}
