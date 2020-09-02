package OOPS;

public class studentClient {

	public static void main(String[] args) throws Exception {

		student s1 = new student();

		s1.setRollno(-10); // Exception in thread "main" java.lang.Exception: rollno cannot be negative
		
	}

}
