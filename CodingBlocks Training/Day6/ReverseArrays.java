package Lecture6;

public class ReverseArrays {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 5, 8, 7 };

		// first approach
		System.out.println("using first approach");

		int[] answer = new int[arr.length];
		int start = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			// System.out.println(arr[i]);

			answer[start] = arr[i];
			start++;
		}
		display(answer);

		// second approach
		int front = 0;
		int back = arr.length - 1;
		for (int j = front; j <= arr.length / 2; j++) {
			swap(front, back, arr);
			front++;
			back--;
		}
		System.out.println("using second approach");
		display(arr);
	}

	public static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
