package Lecture15;

public class person2 {

	private String name;
	private int age;

//	 to access private member of class, using getter/setter methods

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int myage) {
		if (myage < 0){
			return;
		}
		this.age = myage;
	}

	public void setName(String name) {
		this.name = name;
	}
}
