package Lecture16.package2;

import Lecture16.package1.*;

public class NormalClass {
	// different package, normal class - only public visible
	
	public void fun() {
		Child obj = new Child();

		System.out.println(obj.d1); // visible as d1 is public

		// not visible - protected, default/friendly, private variables
		// not allowed
		// System.out.println(obj.d2); // The field Parent.d2 is not visible
		// System.out.println(obj.d3); // The field Parent.d3 is not visible
		// System.out.println(obj.d4); // The field Parent.d4 is not visible
	}
}
