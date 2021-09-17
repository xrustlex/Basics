package designPatterns.strategy;

public class LaborDayDiscountStrategy implements IDiscountStrategy{

	public double computeDiscountedPrice(double listPrice) {
		return listPrice * .75;
	}
}
