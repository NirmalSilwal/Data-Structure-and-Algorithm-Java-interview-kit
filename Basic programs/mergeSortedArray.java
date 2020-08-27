package BasicPractice;

public class mergeSortedArray {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 15, 18, 24, 30 };
		int[] sorted = merge(arr1, arr2);
		display(sorted); // 10 15 18 20 24 30 30 40

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		int[] sorted = new int[arr1.length + arr2.length];
		int index = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				sorted[index] = arr1[i];
				i++;
				index++;
			} else {
				sorted[index] = arr2[j];
				j++;
				index++;
			}
		}

		if (i < arr1.length) {
			for (int pos = i; pos < arr1.length; pos++) {
				sorted[index] = arr1[pos];
				index++;
			}
		} else {
			for (int pos = j; pos < arr2.length; pos++) {
				sorted[index] = arr2[pos];
				index++;
			}
		}

		return sorted;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
