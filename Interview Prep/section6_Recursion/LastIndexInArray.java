package section6_Recursion;

public class LastIndexInArray {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		int startIndex = 0;

		System.out.println(lastIndexRecursive(arr, startIndex, 8)); // 4
		System.out.println(lastIndexRecursive(arr, startIndex, 1)); // 3
		System.out.println(lastIndexRecursive(arr, startIndex, 10)); // -1
		System.out.println(lastIndexRecursive(arr, startIndex, 4)); // 6
	}

	static int lastIndexRecursive(int[] arr, int si, int data) {
		int ans = -1;
		int index = lastIndex(arr, si, data, ans);
		return index;
	}

	private static int lastIndex(int[] arr, int si, int data, int ans) {

		if (si == arr.length)
			return ans;

		if (arr[si] == data)
			ans = si;

		ans = lastIndex(arr, si + 1, data, ans);

		return ans;
	}
}
