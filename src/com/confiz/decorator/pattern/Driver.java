package com.confiz.decorator.pattern;

import com.confiz.decorator.pattern.decorators.AddOnDecorator;
import com.confiz.decorator.pattern.decorators.CeramelDecorator;
import com.confiz.decorator.pattern.decorators.SoyaDecorator;

public class Driver {

	public static void main(String... args) {
		System.out.println("<====================>");
		System.out.println("   Decortor Pattern");
		System.out.println("<====================>");

		Beverage esspresso = new Esspresso();
		AddOnDecorator esspressoWIthCeramel = new CeramelDecorator(esspresso);
		AddOnDecorator espressoWithCaramelAndSoya = new SoyaDecorator(esspressoWIthCeramel);

		System.out.println("Esspresso cost is: " + esspresso.calculateCost() + "$");
		System.out.println("Esspresso cost with Caremel is: " + esspressoWIthCeramel.calculateCost() + "$");
		System.out.println("Esspresso cost with Caremel and Soya is: " + espressoWithCaramelAndSoya.calculateCost() + "$");

		System.out.println();
		System.out.println("<=========================================================>");

		Beverage decaf = new Decaf();
		AddOnDecorator decafWIthCeramel = new CeramelDecorator(decaf);

		System.out.println("Decaf cost is: " + decaf.calculateCost() + "$");
		System.out.println("Decaf cost with Caremel is: " + decafWIthCeramel.calculateCost() + "$");
		System.out.println();
		System.out.println("<=========================================================>");
	}
}
