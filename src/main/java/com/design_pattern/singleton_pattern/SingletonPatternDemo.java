package com.design_pattern.singleton_pattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	      System.out.println(object.hashCode());
	      
	      SingleObject object2 = SingleObject.getInstance();

	      //show the message
	      object2.showMessage();
	      System.out.println(object2.hashCode());
	      
	   }
}
