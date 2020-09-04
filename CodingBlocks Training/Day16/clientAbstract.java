package Lecture16;

public class clientAbstract {

	public static void main(String[] args) {

		// not allowed
		// parentAbstract obj = new parentAbstract(); // Cannot instantiate the type parentAbstract
		// since parentAbstract class is abstract, you cannot make object of
		// that class it can only be inherited

		// not allowed
		// childAbstract obj = new parentAbstract(); // Cannot instantiate the type parentAbstract

		parentAbstract obj = new childAbstract();

		obj.fun();
		obj.fun1();
		obj.fun2();

		// not allowed as fun3() presence is checked in parentAbstract by compiler
		// obj.fun3(); // The method fun3() is undefined for the type parentAbstract

		System.out.println("=========================");

		childAbstract obj2 = new childAbstract();

		obj2.fun();
		obj2.fun1();
		obj2.fun2();
		obj2.fun3();

	}

}


/* output:
Inside child fun
Inside child fun1
Inside parent fun2
=========================
Inside child fun
Inside child fun1
Inside parent fun2
Inside child fun2
*/