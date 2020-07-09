package Lecture5;

public class Functions {

	public static void main(String[] args) {
		
		helloFun();
		helloFun();
		int si = simpleInterest(10000, 2, 4);
		System.out.println("inside main: simple interest is: " + si);

		// block scope
		int test = 10;
		if (test > 5) {
			int localVar = 12;
			System.out.println("test inside if block: " + test);
			System.out.println("local inside if block: " + localVar);
			test = 1;
			System.out.println("test inside if block: " + test);

		}

		System.out.println("test outside if block: " + test);
		// System.out.println("local outside if block: "+localVar); // localVar cannot
		// be resolved to a variable

		System.out.println("\nvariable scope experiment: ");
		int i = 1;
		for (i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("final i value: "+i);
	}

	public static void helloFun() {
		System.out.println("Hello Fun");
		helloGun();
	}

	public static void helloGun() {
		System.out.println("Hello *******GUN*******");
	}

	public static int simpleInterest(int principle, int time, int rate) {
		int si = principle * time * rate;
		System.out.println("inside simpleInterest() function: " + si);
		return si;
	}
}
