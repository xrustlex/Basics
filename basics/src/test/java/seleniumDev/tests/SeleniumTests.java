package seleniumDev.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.DocumentationGridPage;
import seleniumDev.foundation.SeleniumDevTestBase;
import seleniumDev.pageObjects.DownloadsPage;
import seleniumDev.pageObjects.EventsPage;
import seleniumDev.pageObjects.NederlandsPage;
import seleniumDev.pageObjects.SponsorsPage;

public class SeleniumTests extends SeleniumDevTestBase {

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingNederlands() {
		String expectedUrl = this.baseUrl + "nl/";

		new NederlandsPage(driver, baseUrl)
		.navigate();

		assertEquals("Did not navigate to the expected URL", expectedUrl, getCurrentUrl());
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingEventsInAbout() {
		String expectedUrl = this.baseUrl + "events/";

		new EventsPage(driver, baseUrl)
		.navigate();

		assertEquals("Did not navigate to the expected URL", expectedUrl, getCurrentUrl());
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingDownloads() {
		String expectedUrl = this.baseUrl + "downloads/";

		new DownloadsPage(driver, baseUrl)
		.navigate();

		assertEquals("Did not navigate to the expected URL", expectedUrl, getCurrentUrl());
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingSponsor() {
		String expectedUrl = this.baseUrl + "sponsors/";

		new SponsorsPage(driver, baseUrl)
		.navigate();

		assertEquals("Did not navigate to the expected URL", expectedUrl, getCurrentUrl());
	}
	
	@Test
	public void canNavigateToSeleniumGridPage() { 
		String expectedUrl = this.baseUrl + "documentation/grid/";
		
		new DocumentationGridPage(driver, baseUrl)
		.navigate();
		
		assertEquals("Did not navigate to the expected URL", expectedUrl, getCurrentUrl());
	}
	
	private String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}
}

