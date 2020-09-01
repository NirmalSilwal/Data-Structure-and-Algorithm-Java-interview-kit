package OOPS;

public class personClient {

	public static void main(String[] args) {

		person p1 = new person();
		person p2 = new person();
		
		System.out.println(p1.name); // null
		System.out.println(p1.age); // 0
		System.out.println(p2.name); // null
		System.out.println(p2.age); // 0
		
		p1.name = "Sujan";
		p1.age = 28;
		
		System.out.println(p1.name); // Sujan
		System.out.println(p1.age); // 28
	}

}
