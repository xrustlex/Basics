package basics;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.pageObjects.DownloadsPage;
import basics.pageObjects.EventsPage;
import basics.pageObjects.NederlandsPage;
import basics.pageObjects.SponsorPage;

public class SeleniumTests extends TestBase {

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingNederlands() {
		String expectedUrl = this.baseUrl + "nl/";

		new NederlandsPage(driver, baseUrl)
		.navigate();

		assertTrue("Did not navigate to the expected URL " + expectedUrl, this.driver.getCurrentUrl().equals(expectedUrl));
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingEventsInAbout() {
		String expectedUrl = this.baseUrl + "events/";

		new EventsPage(driver, baseUrl)
		.navigate();

		assertTrue("Did not navigate to the expected URL " + expectedUrl, this.driver.getCurrentUrl().equals(expectedUrl));
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingDownloads() {
		String expectedUrl = this.baseUrl + "downloads/";

		new DownloadsPage(driver, baseUrl)
		.navigate();

		assertTrue("Did not navigate to the expected URL " + expectedUrl, this.driver.getCurrentUrl().equals(expectedUrl));
	}

	@Test
	public void canDemonstratePageObjectPatternForFragmentsClickingSponsor() {
		String expectedUrl = this.baseUrl + "sponsors/";

		new SponsorPage(driver, baseUrl)
		.navigate();

		assertTrue("Did not navigate to the expected URL " + expectedUrl, this.driver.getCurrentUrl().equals(expectedUrl));
	}
}
