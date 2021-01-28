package section1_basic;

public class Pattern27 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		int space = n - 1;

		while (row <= n) {
			int val = 1;

			int count = 1;
			while (count <= space) {
				System.out.print("  ");
				count++;
			}

			count = 1;
			while (count <= row) {
				System.out.print(val + " ");
				val++;
				count++;
			}

			count = 1;
			val = row - 1;
			while (count <= row - 1) {
				System.out.print(val + " ");
				val--;
				count++;
			}

			row++;
			System.out.println();

			space--;
		}
	}

}


/* output: 

        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

*/