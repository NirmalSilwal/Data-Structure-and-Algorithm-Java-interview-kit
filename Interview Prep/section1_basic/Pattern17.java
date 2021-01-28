package section1_basic;

public class Pattern17 {

	public static void main(String[] args) {

		int n = 7;

		int row = 1;
		int stars = n / 2;
		int space = 1;

		while (row <= n) {

			int count = 1;
			while (count <= stars) {
				System.out.print("* ");
				count++;
			}

			count = 1;
			while (count <= space) {
				System.out.print("  ");
				count++;
			}

			count = 1;
			while (count <= stars) {
				System.out.print("* ");
				count++;
			}

			row++;
			System.out.println();

			if (row <= n / 2 + 1) {
				stars--;
				space = space + 2;
			} else {
				stars++;
				space = space - 2;
			}
		}
	}

}


/* output 

* * *   * * * 
* *       * * 
*           * 
              
*           * 
* *       * * 
* * *   * * * 

*/