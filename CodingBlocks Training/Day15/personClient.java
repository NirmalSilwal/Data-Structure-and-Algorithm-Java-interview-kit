package Lecture15;

public class personClient {

	public static void main(String[] args) {
		
		person obj1 = new person();
		
		System.out.println(obj1.name);	// null
		System.out.println(obj1.age);	// 0
		
		person p2 = new person();
		
		System.out.println(p2.name);	// null
		System.out.println(p2.age);	// 0
		
		person p3 = new person();
		p3.name = "Nirmal";
		p3.age = 24;
		
		System.out.println(p3.name);	// Nirmal
		System.out.println(p3.age);	// 24
	}

}
