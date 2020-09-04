package Lecture16;

public abstract class parentAbstract {

	public int age = 10;
	public static int num = 20;

	public void fun1() {
		System.out.println("Inside parent fun1");
	}

//	 public abstract void fun(); // error if class is not abstract
	// The abstract method fun in type parentAbstract can only be defined by an abstract class

	public abstract void fun(); // abstract method

	// not allowed to have static abstract method 
//	 public static abstract void funny();

	// The abstract method funny in type parentAbstract can only set a
	// visibility modifier, one of public or protected

	public void fun2() {
		System.out.println("Inside parent fun2");
	}
}
