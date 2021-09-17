package designPatterns.strategy;

public class PricingContext {

	private IDiscountStrategy discountStrategy;

	public void setDiscountStrategy(IDiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public double applyDiscount(double listPrice) {
		return discountStrategy.computeDiscountedPrice(listPrice);
	}
}
