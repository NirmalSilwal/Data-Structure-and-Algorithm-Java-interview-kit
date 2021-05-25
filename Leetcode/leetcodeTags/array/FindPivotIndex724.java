package leetcodeTags.array;

public class FindPivotIndex724 {

	public static int pivotIndex(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int lsum = sumLeft(i, nums);
			int rsum = sumRight(i, nums);
			if (lsum == rsum) {
				if (i == 0 ) {
					return 0;
				} else {
					return i;
				}
			}
		}
		return -1;
	}

	private static int sumLeft(int i, int[] arr) {
		if (i == 0) {
			return 0;
		}
		int sum = 0;
		for (int idx = 0; idx < i; idx++) {
			sum += arr[idx];
		}
		return sum;
	}

	private static int sumRight(int i, int[] arr) {
		if (i == arr.length - 1) {
			return 0;
		}
		int sum = 0;
		for (int idx = i + 1; idx < arr.length; idx++) {
			sum += arr[idx];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { -1, -1, 0, 1, 1, 0 };
		System.out.println(pivotIndex(nums));
	}
}
