package BasicPractice;

// complexity: O(N)
//This algorithm runs in O( N) time. The fact that it only goes through half of the array 
//(in terms of iterations) does not impact the Big O time. 

public class complexityAnalysis4 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		display(arr);
		reverseArray(arr);
		System.out.println();
		display(arr);
	}

	public static void reverseArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int other = arr.length - i - 1;
			int temp = arr[i];
			arr[i] = arr[other];
			arr[other] = temp;
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
