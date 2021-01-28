package section1_basic;

public class Pattern23 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		int space = n - 1;
		int star = 1;

		while (row <= n) {

			int count = 1;
			while (count <= space) {
				System.out.print("  ");
				count++;
			}

			count = 1;
			while (count <= star) {
				System.out.print("1 ");
				count++;
			}

			space--;
			star = star + 2;

			row++;
			System.out.println();
		}
	}

}


/* output:

1 
1 1 1 
1 1 1 1 1 
1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 

*/