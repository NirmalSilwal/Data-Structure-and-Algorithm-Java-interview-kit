package Lecture15;

public class personClient2 {

	public static void main(String[] args) {

		person2 obj = new person2();

//		 System.out.println(obj.name); // The field person2.name is not visible
//		 System.out.println(obj.age); // The field person2.age is not visible

//		 note: since name and age were private variables, another class can't access it directly
		
		System.out.println(obj.getAge()); // 0
		System.out.println(obj.getName()); // null
		
//		 obj.name = "can'tSet"; // The field person2.name is not visible
//		 obj.age = 100; // The field person2.age is not visible
		
//		 note: to set private variables from another class, use public method of that class
		
		obj.setName("canSetNow");
		obj.setAge(100);
		
		System.out.println(obj.getAge()); // 100
		System.out.println(obj.getName()); // canSetNow
		
		obj.setAge(-10);
		System.out.println(obj.getAge()); // 100, returns prev value as it couldn't set negative age
	}

}
