package OOPS;

public class person2 {
	
	private String name;
	private int age;
	private int rollno;
	
	// go to "Source > Generate Getters and Setters" and select variables you want 
	// to generate getter and setter by IDE
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
