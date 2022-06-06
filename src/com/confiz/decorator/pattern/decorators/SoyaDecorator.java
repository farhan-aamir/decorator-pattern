package com.confiz.decorator.pattern.decorators;

import com.confiz.decorator.pattern.Beverage;

public class SoyaDecorator extends AddOnDecorator{
	
	Beverage beverage;
	
	public SoyaDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int calculateCost() {
		return beverage.calculateCost() + 1;
	}
}
