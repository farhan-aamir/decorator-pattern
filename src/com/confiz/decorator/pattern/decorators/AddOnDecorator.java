package com.confiz.decorator.pattern.decorators;

import com.confiz.decorator.pattern.Beverage;

public abstract class AddOnDecorator extends Beverage{
	
	public void showDescription() {
		System.out.println("This is an AddOn Decorator");
	}

}
