package com.confiz.decorator.pattern;

public abstract class Beverage {
	public void showDescription(){
		System.out.println("This is a Beverage class");
	}

	public abstract int calculateCost();
}
