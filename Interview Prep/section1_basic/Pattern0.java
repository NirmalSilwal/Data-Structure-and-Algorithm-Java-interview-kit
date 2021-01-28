package section1_basic;

public class Pattern0 {

	public static void main(String[] args) {
		int rows = 6;
		System.out.println("---------------");

		// using while loop
		while (rows >= 1) {
			System.out.println("*");
			rows--;
		}

		// using for loop
		System.out.println("---------------");
		rows = 6;
		for (int i = 1; i <= rows; i++) {
			System.out.println("*");
		}
		System.out.println("---------------");

	}

}

/* output:
---------------
*
*
*
*
*
*
---------------
*
*
*
*
*
*
---------------
*/