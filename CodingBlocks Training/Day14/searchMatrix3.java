package Lecture14;

public class searchMatrix3 {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30, 40 }, 
						{ 11, 21, 31, 41 },
						{ 12, 22, 32, 42 }, 
						{ 13, 23, 33, 43 } };

		System.out.println(staircase(arr, 22)); // true
		System.out.println(staircase(arr, 10)); // true
		System.out.println(staircase(arr, 42)); // true
		System.out.println(staircase(arr, 23)); // true
		System.out.println(staircase(arr, 13)); // true
		System.out.println(staircase(arr, 2)); // false

	}

	public static boolean staircase(int[][] arr, int key) {
		int row = 0, col = arr.length - 1;

		while (row < arr.length && col >= 0) {
			if (arr[row][col] == key) {
				return true;
			} else if (key > arr[row][col]) {
				row++;
			} else {
				col--;
			}
		}

		return false;
	}
}
