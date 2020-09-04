package Lecture16.package2;

import Lecture16.package1.*;

public class DerivedClass extends Child {
	// other package, derived class

	public void fun() {

		// here d1 and d2 are visible as public & protected are visible in this
		// scope - other package, derived class
		// here default variable is not visible as it is different package
	}
}
