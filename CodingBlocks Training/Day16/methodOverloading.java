package Lecture16;

public class methodOverloading {

	public static void main(String[] args) {

		add(1, 2); // 3
		add("100", "200"); // 100200
		add(50); // 50
		add(20, "c"); // 20c
		add("a", 30); // a30

	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(String a, String b) {
		System.out.println(a + b);
	}

	public static void add(int a) {
		System.out.println(a);
	}

	public static void add(int a, String b) {
		System.out.println(a + b);
	}
	
	public static void add(String a, int b){
		System.out.println(a + b);
	}
}
