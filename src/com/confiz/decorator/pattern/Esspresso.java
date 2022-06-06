package com.confiz.decorator.pattern;

public class Esspresso extends Beverage {

	@Override
	public void showDescription() {
		super.showDescription();
		System.out.println("This is a Esspresso!");
	}
	
	@Override
	public int calculateCost() {
		return 2; 

	}

}
