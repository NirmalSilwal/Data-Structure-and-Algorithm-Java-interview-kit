package OOPS;

public class student2 {

	private int age;
	
	public void setAge(int age) throws Exception{
		if (age < 0) {
			throw new Exception("age cannot be negative");
		}
		this.age = age;
	}
}
