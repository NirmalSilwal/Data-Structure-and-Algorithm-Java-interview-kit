package OOPS;

public class student {

	private String name;
	private int rollno;

	public void setRollno(int rollno) throws Exception {
		if (rollno < 0) {
			throw new Exception("rollno cannot be negative");
		}
		this.rollno = rollno;
	}
}
