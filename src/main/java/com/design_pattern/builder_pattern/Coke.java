package com.design_pattern.builder_pattern;

public class Coke extends ColdDrink {

	public String name() {
		 return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
