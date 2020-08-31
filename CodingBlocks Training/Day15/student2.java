package Lecture15;

public class student2 {

	private String name;
	private int rollno;

	public static int MAX_STUDENTS = 50;
	private static int CURRENT_STUDENTS = 0;

	private static String UNIFORM_COLOR = "RED";

	student2(String name, int rollno) {
		System.out.println("prameterized constructor initializing...");
		this.name = name;
		this.rollno = rollno;
		student2.CURRENT_STUDENTS++;
	}

	public int getCurrentStudents() {
		return student2.CURRENT_STUDENTS;
	}

	public int getMaxStudents() {
		return student2.MAX_STUDENTS;
	}

	public String getUniformColor() {
		return student2.UNIFORM_COLOR;
	}

	public void setUniformColor(String color) {
		student2.UNIFORM_COLOR = color;
	}

	public int getRollno() {
		return this.rollno;
	}

	public String getName() {
		return this.name;
	}
}
