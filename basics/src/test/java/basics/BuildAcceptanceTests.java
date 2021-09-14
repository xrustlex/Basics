package basics;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.pageObjects.SeleniumDevHomePage;

public class BuildAcceptanceTests extends TestBase {

	@Test
	public void sanityTest() {
		String currentUrl = this.driver.getCurrentUrl();
		
		assertTrue("Did not navigate to the url " + this.baseUrl, currentUrl.equals(this.baseUrl));
	}
	
	@Test
	public void canGetTextFromUnderstandingComponentsPage() {
		String expectedText = "Building a test suite using WebDriver will require you to understand and effectively use a number of different components. As with everything in software, different people use different terms for the same idea. Below is a breakdown of how terms are used in this description.";
		
		String textFromPage = 
				new SeleniumDevHomePage(driver, baseUrl)
				.clickReadMoreButtonSeleniumWebDriver()
				.clickUnderstandingTheComponentsLink()
				.getFirstParagraph();
		
		assertTrue("Text did not match. Actual text was '" + textFromPage + "'", textFromPage.equals(expectedText));
	}
}
