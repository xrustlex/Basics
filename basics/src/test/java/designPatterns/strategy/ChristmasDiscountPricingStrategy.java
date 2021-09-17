package designPatterns.strategy;

public class ChristmasDiscountPricingStrategy implements IDiscountStrategy {

	public double computeDiscountedPrice(double listPrice) {
		return listPrice * .5;
	}
}
