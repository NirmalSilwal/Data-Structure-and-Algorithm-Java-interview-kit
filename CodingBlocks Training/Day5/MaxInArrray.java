package Lecture5;

public class MaxInArrray {

	public static void main(String[] arr) {

		int[] list = { 10, 20, -1, 5, 40, 6 };
		int max = maxValue(list);
		System.out.println(max);
	}

	public static int maxValue(int[] arr) {
		int max = Integer.MIN_VALUE; // you can initialize it to any value
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}
}
