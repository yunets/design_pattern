package com.design_pattern.abstract_factory_pattern;

import com.design_pattern.factory_pattern.Circle;
import com.design_pattern.factory_pattern.Rectangle;
import com.design_pattern.factory_pattern.Shape;
import com.design_pattern.factory_pattern.Square;

public class ShapeFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if(shapeType == null){
	         return null;
	      }

	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();

	      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();

	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }

	      return null;
	}

}
