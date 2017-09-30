package com.design_pattern.builder_pattern;

public class ChickenBurger extends Burger{

	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
