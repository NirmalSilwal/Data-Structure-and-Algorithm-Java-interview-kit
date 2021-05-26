package array;

public class FindMissingElement {

	public static int missingElement(int[] arr) {
		int n = arr.length;
		int ans = n + 1;
		for (int i = 0; i < n; i++) {
			ans = ans ^ arr[i];
			ans = ans ^ (i + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 5 };
		System.out.println(missingElement(nums)); // 4
	}
}
