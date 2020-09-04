package Lecture16;

public class childAbstract extends parentAbstract {

	public int age = 20;

	public void fun1() {
		System.out.println("Inside child fun1");
	}

	// overriding parent class fun() as it is defined abstract, you need to
	// provide it's implementation
	public void fun() {
		System.out.println("Inside child fun");
	}

	public void fun3() {
		System.out.println("Inside child fun2");
	}
}
