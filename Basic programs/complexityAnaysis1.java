package BasicPractice;

// complexity: O(N)
// This will take 0 (N) time. The fact that we iterate through the array twice doesn't matter. 

public class complexityAnaysis1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		SumProduct(arr);
	}

	public static void SumProduct(int[] arr) {
		int sum = 0;
		int product = 1;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}

		System.out.println("sum: " + sum + " product: " + product);
	}
}

// output: sum: 21 product: 720
