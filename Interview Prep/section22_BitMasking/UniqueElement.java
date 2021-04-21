package section22_BitMasking;

/*
 * Given set of numbers, every number is occuring twice. Find one unique number
 */
public class UniqueElement {

	public static void main(String[] args) throws Exception {

		int[] arr = { 2, 1, 1, 3, 9, 3, 4, 4, 2 };
		System.out.println(unique(arr));
	}

	public static int unique(int[] arr) throws Exception {
		if (arr.length < 1) {
			throw new Exception("no item found...");
		}
		int ans = arr[0];

		for (int i = 1; i < arr.length; i++) {
			// bitwise XOR operation
			ans = ans ^ arr[i];
		}

		return ans;
	}
}
