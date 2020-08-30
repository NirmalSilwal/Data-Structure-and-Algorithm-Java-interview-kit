package Lecture14;

public class searchMatrix2 {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30, 40 }, 
						{ 11, 21, 31, 41 },
						{ 12, 22, 32, 42 }, 
						{ 13, 23, 33, 43 } };

		System.out.println(searchKeyMatrix(arr, 22)); // true
		System.out.println(searchKeyMatrix(arr, 10)); // true
		System.out.println(searchKeyMatrix(arr, 42)); // true
		System.out.println(searchKeyMatrix(arr, 23)); // true
		System.out.println(searchKeyMatrix(arr, 13)); // true
		System.out.println(searchKeyMatrix(arr, 2)); // false

	}

	public static boolean searchKeyMatrix(int[][] arr, int key) {
		int start = 0, end = arr.length - 1;
		int mid = (start + end) / 2;
		if (arr[0][mid] == key || arr[mid][0] == key) {
			return true;
		}

		int startcol = 0;
		int endcol = arr.length - 1;
		if (key < arr[0][mid]) {
			endcol = mid;
		} else {
			startcol = mid;
		}

		int startrow = 0;
		int endrow = arr.length - 1;
		if (key < arr[mid][0]) {
			endrow = mid;
		} else {
			startrow = mid;
		}
		for (int row = startrow; row <= endrow; row++) {
			for (int col = startcol; col <= endcol; col++) {
				if (arr[row][col] == key) {
					return true;
				}
			}
		}
		return false;
	}
}
