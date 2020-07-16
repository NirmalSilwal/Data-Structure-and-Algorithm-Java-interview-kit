package Lecture9;

// time complexity: O(m+n)

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6 };

		int[] sorted = mergeArray(arr1, arr2);
		display(sorted);
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int ans[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;

		while (i < arr1.length & j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}

		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			ans[j] = arr2[j];
			j++;
			k++;
		}

		return ans;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
