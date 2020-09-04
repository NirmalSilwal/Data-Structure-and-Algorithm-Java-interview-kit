package Lecture16.package1;

public class Child extends Parent{
	// derived class in same package, except private others are visible here
	
	Child obj = new Child();
	
	public void fun(){

		// allowed: here d1, d2, d3 are visible in this class
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(obj.d3);
		
		// not allowed
//		System.out.println(obj.d4); // The field Parent.d4 is not visible
		
	}
}
