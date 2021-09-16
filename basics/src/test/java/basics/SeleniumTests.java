package basics;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.pageObjects.SeleniumDevHomePage;

public class SeleniumTests extends TestBase {
	
	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingNederlands() {
		String expectedUrl = this.baseUrl + "nl/";

		new SeleniumDevHomePage(driver, baseUrl)
		.clickOnNederlandsItemInEnglishPopupMenu();

		assertTrue("Did not navigate to the expected URL " + expectedUrl, this.driver.getCurrentUrl().equals(expectedUrl));
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingEventsInAbout() {
		String expectedUrl = this.baseUrl + "events/";

		new SeleniumDevHomePage(driver, baseUrl)
		.clickOnEventsItemInPopupMenu();

		assertTrue("Did not navigate to the expected URL " + expectedUrl, this.driver.getCurrentUrl().equals(expectedUrl));
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingDownloads() {
		String expectedUrl = this.baseUrl + "downloads/";

		new SeleniumDevHomePage(driver, baseUrl)
		.clickOnDownloadsItemMenu();

		assertTrue("Did not navigate to the expected URL " + expectedUrl, this.driver.getCurrentUrl().equals(expectedUrl));
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingSponsor() {
		String expectedUrl = this.baseUrl + "sponsors/";

		new SeleniumDevHomePage(driver, baseUrl)
		.clickOnSponsorMenuItem();

		assertTrue("Did not navigate to the expected URL " + expectedUrl, this.driver.getCurrentUrl().equals(expectedUrl));
	}
}
