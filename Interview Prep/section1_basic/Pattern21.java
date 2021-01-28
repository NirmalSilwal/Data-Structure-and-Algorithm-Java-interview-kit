package section1_basic;

public class Pattern21 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		int star = 1;
		int space = 2 * n - 3;

		while (row <= n) {

			int count = 1;
			while (count <= star) {
				System.out.print("* ");
				count++;
			}

			count = 1;
			while (count <= space) {
				System.out.print("  ");
				count++;
			}

			if (row != n) {

				count = 1;
				while (count <= star) {
					System.out.print("* ");
					count++;
				}
			}

			row++;
			System.out.println();

			if (row < n) {
				star++;
				space = space - 2;
			} else {
				space = 0;
				star = 2 * n - 1;
			}
		}
	}

}


/* output:

*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 

*/
