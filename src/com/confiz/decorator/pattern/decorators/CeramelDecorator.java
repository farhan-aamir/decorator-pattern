package com.confiz.decorator.pattern.decorators;

import com.confiz.decorator.pattern.Beverage;

public class CeramelDecorator extends AddOnDecorator{
	Beverage beverage;

	public CeramelDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int calculateCost() {
		return beverage.calculateCost() + 2;
	}
}
