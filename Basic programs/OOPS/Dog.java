package practice;

public class Dog {

	private String name;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String dogDetails() {
		return "Dog name: " + this.name + " age: " + this.age;
	}
}
