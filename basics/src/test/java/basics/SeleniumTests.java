package basics;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.pageObjects.EventsPage;
import basics.pageObjects.HistoryPage;
import basics.pageObjects.NederlandsPage;
import basics.pageObjects.SeleniumDevHomePage;
import basics.pageObjects.WebDriverDocumentationPage;

public class SeleniumTests extends TestBase {

	@Test
	public void canShowExplicitWait() {

		WebDriverDocumentationPage page = 
				new SeleniumDevHomePage(driver, baseUrl)
				.clickReadMoreButtonSeleniumWebDriver();

		String currentUrl = driver.getCurrentUrl();
		String fullUrl = this.baseUrl + page.url;

		assertTrue("Did not navigate to the url " + fullUrl, currentUrl.equals(fullUrl));	
	}

	@Test
	public void canDemonstratePageObjectPattern() {
		//1. Navigate to the Selenium Dev Homepage. 
		//Expected: Page is shown.			
		//2. Click on Read More Button in Selenium WebDriver tile. 
		//Expected: User is taken to the Selenium WebDriver information page.
		//3. Click on the 'Understanding the Components' hyperlink. 
		//Expected: User is taken to the Understanding Components information page.
		//4. Click on the Selenium logo.
		//Expected: User is taken back to the Selenium Dev Homepage.

		SeleniumDevHomePage page = 
				new SeleniumDevHomePage(driver, baseUrl)
				.clickReadMoreButtonSeleniumWebDriver()
				.clickUnderstandingTheComponentsLink()
				.clickSeleniumLogo();
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingEnglish() {
		NederlandsPage page = 
				new SeleniumDevHomePage(driver, baseUrl)
				.clickOnNederlandsItemInEnglishPopupMenu();
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingEventsInAbout() {
		EventsPage page = 
				new SeleniumDevHomePage(driver, baseUrl)
				.clickOnEventsItemInPopupMenu();
	}
}
