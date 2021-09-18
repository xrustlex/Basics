package ampeg.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ampeg.foundation.AmpegTestBase;
import ampeg.pageObjects.HomePage;

public class AmpegTests extends AmpegTestBase {

	@Test
	public void canNavigateToHomepageFromProductDetailsPage() {
		String expectedUrl = "https://ampeg.com/index.html";

		new HomePage(this.driver, this.baseUrl)
		.clickProductsMenuLink()
		.viewSvtProSeriesProductLineDetails()
		.viewSvt3ProProductDetails()
		.clickHomeBreadcrumb();

		String actualUrl = this.driver.getCurrentUrl();

		assertEquals("Did not navigate to the homepage.", expectedUrl , actualUrl);
	}
}
