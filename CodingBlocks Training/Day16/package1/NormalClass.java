package Lecture16.package1;

public class NormalClass {
	
	public void fun() {

		// same package, normal class- public, protected, default variables are
		// visible here
		Child obj = new Child();

		// allowed: here d1, d2, d3 are visible in this class
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(obj.d3);

		// not allowed, since d4 is private
		// System.out.println(obj.d4); //The field Parent.d4 is not visible
	}
}
