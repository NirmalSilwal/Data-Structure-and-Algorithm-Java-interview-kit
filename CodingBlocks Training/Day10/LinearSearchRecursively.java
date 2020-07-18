package Lecture10;

public class LinearSearchRecursively {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 5, 8, 6, 8, -3 };
		int data = 8;

		System.out.println(first_index(arr, 0, data));

		// for second occurrance
		int counter = 0;
		System.out.println(second_index(arr, 0, data, counter));

	}

	// first occurrance index
	public static int first_index(int[] arr, int index, int data) {
		if (index == arr.length) {
			return -1;
		}
		if (arr[index] == data) {
			return index;
		}
		return first_index(arr, index + 1, data);

	}

	// second occurrance index
	public static int second_index(int[] arr, int index, int data, int counter) {
		if (index == arr.length) {
			return -1;
		}
		if (arr[index] == data) {
			counter++;
			if (counter == 2) {
				return index;
			}
		}
		return second_index(arr, index + 1, data, counter);

	}
}
