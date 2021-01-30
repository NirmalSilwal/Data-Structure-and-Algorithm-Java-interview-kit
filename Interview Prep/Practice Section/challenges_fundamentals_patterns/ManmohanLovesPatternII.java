package challenges_fundamentals_patterns;

import java.util.Scanner;

public class ManmohanLovesPatternII {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter total rows:");
		int n = sc.nextInt();

		if (n < 1) {
			sc.close();
			return;
		}

		int row = 1;

		while (row <= n) {
			int count;

			if (row <= 2) {
				count = 1;

				while (count <= row) {
					System.out.print(1);
					count++;
				}

			} else {
				count = 1;
				int val = row - 1;
				System.out.print(val);
				while (count <= row - 2) {
					System.out.print(0);
					count++;
				}
				System.out.print(val);
			}

			System.out.println();
			row++;
		}

		sc.close();
	}

}


/* output:

enter total rows: 7

1
11
202
3003
40004
500005
6000006

*/