package Lecture8;

public class UniqueElementArray {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 4, 1, 3, 5, 4, 6, 5 };
		System.out.println(find_unique(arr));

	}

	public static int find_unique(int[] arr) {
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer = answer ^ arr[i]; // XOR operation
		}
		return answer;
	}
}
