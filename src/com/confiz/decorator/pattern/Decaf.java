package com.confiz.decorator.pattern;

public class Decaf extends Beverage {

	@Override
	public void showDescription() {
		super.showDescription();
		System.out.println("This is a Defac!");
	}

	@Override
	public int calculateCost() {
		return 3;
	}
}
