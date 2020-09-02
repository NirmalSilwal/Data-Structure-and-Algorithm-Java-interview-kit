package OOPS;

public class personClient2 {

	public static void main(String[] args) {

		person2 obj = new person2();

		// System.out.println(obj.name); // The field person2.name is not visible

		// obj.age = 10; // The field person2.age is not visible

		// note: since name and age are declared private you cannot access them directly

		System.out.println(obj.getName()); // null

		obj.setName("Java");

		System.out.println(obj.getName()); // Java
		
		System.out.println(obj.getRollno()); // 0
		obj.setRollno(1);
		
		System.out.println(obj.getRollno()); // 1
	}

}
