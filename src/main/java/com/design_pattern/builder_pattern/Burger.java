package com.design_pattern.builder_pattern;

public abstract class Burger implements Item{

	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();

}
