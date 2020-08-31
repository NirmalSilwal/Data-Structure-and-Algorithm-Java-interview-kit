package Lecture15;

public class student {

	private String name;
	private int rollno;
	
	student(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public int getRollno() {
		return this.rollno;
	}

	public String getName() {
		return this.name;
	}
}
