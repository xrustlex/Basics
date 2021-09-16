package basics.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class EventsPage extends PageObject {

	public EventsPage(ChromeDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public void navigate() {
		getMenu().navigate(MenuPaths.AboutEvents);	
	}
}
