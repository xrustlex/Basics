package ampeg.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ampeg.foundation.AmpegTestBase;
import ampeg.pageObjects.HomePage;

public class AmpegTests extends AmpegTestBase {

	@Test
	public void canNavigateToHomepageFromProductDetailsPage() {
		String expectedUrl = "https://ampeg.com/index.html";

		new HomePage(this.getDriver(), this.baseUrl)
			.clickProductsMenuLink()
			.viewSvtProSeriesProductLineDetails()
			.viewSvt3ProProductDetails()
			.clickHomeBreadcrumb();

		String actualUrl = this.getDriver().getCurrentUrl();

		assertEquals("Did not navigate to the homepage.", expectedUrl , actualUrl);
	}

	@Test
	public void canGetHandlingWeightOfSvt410Hlf() {
		String expectedHandlingWeight = "85 Pounds";

		String handlingWeight = new HomePage(this.getDriver(), this.baseUrl)
				.clickProductsMenuLink()
				.viewClassicSeriesProductLineDetails()
				.viewSvt410HlfProductDetails()
				.getHandlingWeight();

		assertEquals("Handling weight is not as expected.", expectedHandlingWeight , handlingWeight);
	}
}
