package basics.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public WebDriverDocumentationPage clickReadMoreButtonSeleniumWebDriver() {
		long elementToBeClickableTimeoutSeconds = 5;
		WebElement button = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']/ancestor::div[@class='card h-100 border-0 bg-transparent']//a"));
		WebDriverWait wait = new WebDriverWait(driver, elementToBeClickableTimeoutSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();

		return new WebDriverDocumentationPage(driver, baseUrl);
	}
	
	private MenuComponent getMenu() {
		WebElement menuRootElement = driver.findElement(By.id("main_navbar"));

		MenuComponent menu = new MenuComponent(menuRootElement, this.driver);
		
		return menu;
	}

}
