package Lecture15;

public class studentClient {

	public static void main(String[] args) {

		student[] studentArray = new student[100];

		System.out.println(studentArray); // [LLecture15.student;@1db9742

		System.out.println(studentArray[0]); // null

		studentArray[0] = new student("nirmal", 7);
		
		System.out.println(studentArray[0].getName()); // nirmal
		System.out.println(studentArray[0].getRollno()); // 7
		
		
	}

}
