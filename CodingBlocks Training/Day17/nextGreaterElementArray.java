package Lecture17;

public class nextGreaterElementArray {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 1, 5, 2, 6, 4 };

		nextGreaterElement(arr);
	}

	// o(n^2) time
	public static void nextGreaterElement(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (index == arr.length - 1) {
				System.out.println("next greater of: " + arr[index] + " is: -1");
				break;
			}
			for (int position = index + 1; position < arr.length; position++) {
				if (arr[position] > arr[index]) {
					System.out.println("next greater of: " + arr[index]+ " is: " + arr[position]);
					break;
				} else if (position == arr.length - 1) {
					System.out.println("next greater of: " + arr[index]+ " is: -1");
				}
			}

		}
	}

}
