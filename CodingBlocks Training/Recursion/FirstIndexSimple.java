package Recursion;

public class FirstIndexSimple {

	public static void main(String[] args) {

		int[] arr = { 6, 8, 1, 3, 8, 3, 4 };

		int data = 8;
		int startIndex = 0;

		System.out.println(firstIndexSimple(arr, startIndex, data));
	}

	public static int firstIndexSimple(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == data) {
			return si;
		} else {
			int restAnswer = firstIndexSimple(arr, si + 1, data);
			return restAnswer;
		}
	}
}
