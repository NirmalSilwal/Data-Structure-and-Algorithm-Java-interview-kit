package Lecture15;

public class person3 {

	private String name;
	private int age;

	// default constructor
	person3() {
		System.out.println("Hi everyone, default constructor is initialized!");
		System.out.println("setting default values");
		name = "defaultName";
		age = 10;
	}

	// parameterized constructor
	person3(String name, int age) {
		System.out.println("Hi there, parameterized constructor is initialized!");
		System.out.println("setting given parameter values in instance variables");
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int myage) {
		if (myage < 0) {
			return;
		}
		this.age = myage;
	}

	public void setName(String name) {
		this.name = name;
	}
}
