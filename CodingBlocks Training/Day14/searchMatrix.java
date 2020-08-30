package Lecture14;

public class searchMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30, 40 }, 
						{ 11, 21, 31, 41 },
						{ 12, 22, 32, 42 }, 
						{ 13, 23, 33, 43 } };

		System.out.println(searchKeyMatrix(arr, 22));
	}

	public static boolean searchKeyMatrix(int[][] arr, int key) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == key) {
					System.out.println("element present at: (" + row + ","
							+ col + ")");
					return true;
				}
			}
		}
		return false;
	}

}
