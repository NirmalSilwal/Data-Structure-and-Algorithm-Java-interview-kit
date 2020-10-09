package facebookInterview;

// time complexity: O(n)

public class moveZerosToLeft {

	public static void main(String[] args) {

		int[] arr = { 1, 10, 20, 0, 59, 63, 0, 88, 0 };

		display(arr);

		moveZeroLeft(arr);

		display(arr);
	}

	public static void moveZeroLeft(int[] arr) {
		int reader = arr.length - 1;
		int writer = arr.length - 1;

		while (reader >= 0) {
			if (arr[reader] != 0) {
				arr[writer] = arr[reader];
				writer--;
			}
			reader--;
		}

		while (writer >= 0) {
			arr[writer] = 0;
			writer--;
		}
	}

	public static void display(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
	}
}
