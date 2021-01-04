package gfg.Arrays;

public class SecondLargestElement {

	public static void main(String... args) {

		int[] arr = { 10, 5, 8, 25 };
		System.out.println("2nd largest element is: " + secondLargest(arr)); // 10
		System.out.println("2nd largest element is: " + secondLargestSingleLoop(arr)); // 10

		int[] arr2 = { 20, 10, 20, 8, 20, 12 };
		System.out.println("2ndlargest element is: " + secondLargest(arr2)); // 12
		System.out.println("2ndlargest element is: " + secondLargestSingleLoop(arr2)); // 12

		int[] arr3 = { 10, 10, 10 };
		System.out.println("2nd largest element is: " + secondLargest(arr3)); // -1
		System.out.println("2nd largest element is: " + secondLargestSingleLoop(arr3)); // -1

		int[] arr4 = { 1, 2, 3, 3, 2 };
		System.out.println("2nd largest element is: " + secondLargest(arr4)); // 2
		System.out.println("2nd largest element is: " + secondLargestSingleLoop(arr4)); // 2

	}

	// O(n) time
	public static int secondLargest(int[] arr) {
		if (arr.length <= 1) {
			return -1;
		}
		int first = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[first]) {
				first = i;
			}
		}
		int firstLargest = arr[first];

		int second = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[second] == firstLargest) {
				second++;
				continue;
			}
			if (arr[j] > arr[second] && arr[j] < firstLargest) {
				second = j;
			}
		}
		if (firstLargest == arr[second]) {
			return -1;
		}
		return arr[second];
	}

	
	
	// in single traversal - O(n) time
	public static int secondLargestSingleLoop(int[] arr) {
		if (arr.length <= 1) {
			return -1;
		}
		
		int first = arr[0];
		int second = arr[1];

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}
//			if (second != first && second > first) {
//				first = second;
//				second = first;
//			}
			if (arr[i] != first) {
				if (arr[i] > second && arr[i] < first) {
					second = arr[i];
				}
			}
		}
		if (first == second) {
			return -1;
		}
		return second;
	}
}
