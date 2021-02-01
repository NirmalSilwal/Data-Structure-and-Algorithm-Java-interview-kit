package section4_2DArray;

public class WavePatternPrint {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		display(arr);
		wavePrint(arr);
	}

	static void wavePrint(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int col = arr[row].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}

	static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}


/* output:

11 12 13 14 
21 22 23 24 
31 32 33 34 
41 42 43 44 
11 12 13 14 24 23 22 21 31 32 33 34 44 43 42 41 
*/