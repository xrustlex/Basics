package designPatterns.strategy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StrategyTests {

	@Test
	public void canComputeDiscount() {
		double listPrice = 100.00;
		double expectedPriceAfterDiscount = 50.00;

		PricingContext pricingContext = new PricingContext();
		pricingContext.setDiscountStrategy(new ChristmasDiscountPricingStrategy());
		double priceAfterDiscount = pricingContext.applyDiscount(listPrice);

		assertTrue("Discount strategy was not applied.", expectedPriceAfterDiscount == priceAfterDiscount);
	}
}
