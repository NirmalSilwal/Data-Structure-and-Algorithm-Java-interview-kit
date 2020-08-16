package GeeksForGeeks;

/*
 * Given an unsorted array A of size N of non-negative integers, 
 * find a continuous sub-array which adds to a given number S.*/

public class SubarraySum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 7, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 12;
		subarraySum(arr, sum);
		subarraySum(arr2, 15);
	}

	public static void subarraySum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int total = 0;
				for (int k = i; k <= j; k++) {
					total = total + arr[k];
				}
				if (total == sum) {
					System.out.println((i + 1) + " " + (j + 1));
					return;
				}

			}
		}
	}

}
