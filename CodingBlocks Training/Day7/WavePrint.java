/*
input:			11 12 13 14 
			21 22 23 24 
			31 32 33 34 
			41 42 43 44 
		
output:			11 12 13 14 24 23 22 21 31 32 33 34 44 43 42 41 
 */
package Lecture7;

public class WavePrint {

	public static void main(String[] args) {

		// int[][] arr = new int[3][3];
		// arr[0][0] = 11;

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 },
				{ 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		display(arr);
		System.out.println();

		// wave print logic
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int k = arr[i].length - 1; k >= 0; k--) {
					System.out.print(arr[i][k] + " ");
				}
			}
		}
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
