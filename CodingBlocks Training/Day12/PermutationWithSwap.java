package Lecture12;

public class PermutationWithSwap {

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c' };
		int front = 0, back = arr.length - 1;
		printPermutation(arr, front, back);
	}

	public static void printPermutation(char[] arr, int front, int back) {
		if (front > back) {
			display(arr);
		}
		for (int i = front; i < arr.length; i++) {
			swap(arr, front, i);
			printPermutation(arr, front + 1, back);
			swap(arr, front, i);
		}
	}

	public static void display(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static void swap(char[] arr, int index1, int index2) {
		char temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}


/* output:
abc
acb
bac
bca
cab
cba
*/