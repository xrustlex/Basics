package theInternet;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import theInternet.foundation.TheInternetTestBase;
import theInternet.pageObjects.DropdownPage;

public class DecoratorTests extends TheInternetTestBase {

	@Test
	public void canDemonstrateDecorator() {
		String option = "Option 2";
		
		String selectedOption = new DropdownPage(driver, this.baseUrl)
				.navigate()
				.selectDropdownOption(option)
				.getSelectedDropdownOption();
		
		assertEquals("Incorrect state was selected.", option, selectedOption);
	}
}
