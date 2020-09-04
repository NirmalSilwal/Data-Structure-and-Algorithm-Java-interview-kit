package Lecture16.package1;

public class Parent {

	public int d1 = 10; // public access specifier
	protected int d2 = 20; // protected access specifier
	int d3 = 30; // default access specifier
	private int d4 = 40; // private access specifier

	public void fun() {
		System.out.println("inside package1 fun");
	}
}
