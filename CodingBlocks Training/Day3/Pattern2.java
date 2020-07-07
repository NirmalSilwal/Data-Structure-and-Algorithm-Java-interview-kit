/*
		*
		**
		***
		****
		*****
 */
package Lecture3;

public class Pattern2 {

	public static void main(String[] args) {

		int n = 5;
		int row = 1;
		int nst = 1;

		while (row <= n) {
			int col = 1;

			while (col <= nst) {
				System.out.print("*");
				col++;
			}

			System.out.println();
			row++;
			nst = row;
		}
	}

}
