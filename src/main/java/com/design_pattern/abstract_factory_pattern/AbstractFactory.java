package com.design_pattern.abstract_factory_pattern;

import com.design_pattern.factory_pattern.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape) ;
}
