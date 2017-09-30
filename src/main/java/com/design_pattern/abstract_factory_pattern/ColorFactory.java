package com.design_pattern.abstract_factory_pattern;

import com.design_pattern.factory_pattern.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		if(color == null){
	         return null;
	      }        

	      if(color.equalsIgnoreCase("RED")){
	         return new Red();

	      }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();

	      }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }

	      return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}