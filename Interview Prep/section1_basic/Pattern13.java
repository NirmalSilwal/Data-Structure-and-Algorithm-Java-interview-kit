package section1_basic;

public class Pattern13 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		int stars = 1;

		while (row < 2 * n) {

			int count = 1;
			while (count <= stars) {
				System.out.print("* ");
				count++;
			}

			System.out.println();
			row++;
			if (row <= n) {
				stars++;
			} else {
				stars--;
			}
		}
	}

}

/* output 

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
