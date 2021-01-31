package section3_Function_1DArray;

public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = { 12, 4, 63, 6, 3, 0, -1, -45 };
		System.out.println(maxArray(arr));
	}

	static int maxArray(int[] arr) {
		if (arr.length < 1)
			return -1;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
