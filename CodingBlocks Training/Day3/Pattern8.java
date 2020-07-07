/*
			      1 
			    2 3 2 
			  3 4 5 4 3 
			4 5 6 7 6 5 4 
 */

package Lecture3;

public class Pattern8 {

	public static void main(String[] args) {

		int n = 4;
		int row = 1;
		int items = 1;

		while (row <= n) {
			int spaces = n - row;
			int counter = 1;

			while (counter <= spaces) {
				System.out.print("  ");
				counter++;
			}

			counter = 1;
			int value = row - 1;

			while (counter <= items) {
				if (counter <= row) {
					value++;
					System.out.print(value+" ");
					counter++;

				} else {
					value--;
					System.out.print(value+" ");
					counter++;
				}
			}

			System.out.println();
			items += 2;
			row++;
		}
	}
}
