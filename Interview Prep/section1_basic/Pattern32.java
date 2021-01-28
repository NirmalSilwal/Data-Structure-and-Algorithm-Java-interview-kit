package section1_basic;

public class Pattern32 {

	public static void main(String[] args) {

		int n = 7;

		int row = 1;
		int val = row;

		while (row < 2 * n) {

			int count = 1;
			while (count <= val) {
				if (count == val)
					System.out.print(val);
				else
					System.out.print(val + " * ");
				count++;
			}

			row++;
			System.out.println();

			if (row <= n) {
				val++;
			} else {
				val--;
			}

		}
	}

}


/* output:

1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
5 * 5 * 5 * 5 * 5
6 * 6 * 6 * 6 * 6 * 6
7 * 7 * 7 * 7 * 7 * 7 * 7
6 * 6 * 6 * 6 * 6 * 6
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1

*/