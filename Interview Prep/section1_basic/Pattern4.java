package section1_basic;

public class Pattern4 {

	public static void main(String[] args) {

		int n = 5;

		for (int row = 1; row <= n; row++) {
			int blank = n - row;

			for (int space = 1; space <= blank; space++) {
				System.out.print("  ");
			}

			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/* output:

        * 
      * * 
    * * * 
  * * * * 
* * * * * 

*/
