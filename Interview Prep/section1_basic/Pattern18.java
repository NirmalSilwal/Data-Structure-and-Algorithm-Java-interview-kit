package section1_basic;

public class Pattern18 {

	public static void main(String[] args) {

		int n = 7;

		int row = 1;
		int space = n / 2;
		int star = 1;

		while (row <= n) {

			int count = 1;
			while (count <= space) {
				System.out.print("  ");
				count++;
			}

			count = 1;
			while (count <= star) {
				System.out.print("* ");
				count++;
			}

			row++;
			System.out.println();

			if (row <= n / 2 + 1) {
				space--;
				star = star + 2;
			} else {
				space++;
				star -= 2;
			}
		}
	}

}

/* output 

      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 

*/
