package Lecture15;

public class personClient3 {

	public static void main(String[] args) {

		// now constructor is initialized and default values are set while
		// making object

		person3 obj = new person3(); // Hi everyone, default constructor is initialized!
		person3 obj2 = new person3(); // Hi everyone, default constructor is initialized!

		System.out.println(obj.getName()); // defaultName
		System.out.println(obj.getAge()); // 10

		person3 obj3 = new person3("Rahul", 26); // Hi there, parameterized constructor is initialized!

		System.out.println(obj3.getName()); // Rahul
		System.out.println(obj3.getAge()); // 26

	}

}

/*
 * output: 
 * 
 * Hi everyone, default constructor is initialized! 
 * setting default values
 * Hi everyone, default constructor is initialized! 
 * setting default values 
 * defaultName 
 * 10 
 * Hi there, parameterized constructor is initialized!
 * setting given parameter values in instance variables 
 * Rahul 
 * 26
 */
