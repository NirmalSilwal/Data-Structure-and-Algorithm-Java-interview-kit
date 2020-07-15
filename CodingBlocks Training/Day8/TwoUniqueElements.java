package Lecture8;

// quesion: given n = 9 and array of elements, where array has elements in range 1 to n
// and array contains (n-2) elements, so 2 elements are missing there
// find those 2 elements in O(1), you cannot use another array also

public class TwoUniqueElements {

	public static void main(String[] args) {

		int n = 9;
		int[] arr = { 3, 1, 5, 6, 8, 9, 7 };

		int mask = 0;

		for (int i = 0; i < arr.length; i++) {
			mask = mask ^ arr[i]; // XOR 0^3^1^5^6^8^9^7
		}

		for (int i = 1; i <= n; i++) {
			mask = mask ^ i; // XOR 0^3^1^5^6^8^9^7^1^2^3^4^5^6^7^8^9
		}

		// System.out.println(mask); // 6

		// System.out.println(right_most_set_bit(6)); // 2

		int right_most_bit = right_most_set_bit(mask);

		int group1 = 0;
		int group2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & right_most_bit) == right_most_bit) {
				group1 = arr[i] ^ group1;
			} else {
				group2 = arr[i] ^ group2;
			}
		}

		for (int i = 1; i <= n; i++) {
			if ((i & right_most_bit) == right_most_bit) {
				group1 = i ^ group1; // XOR
			} else {
				group2 = i ^ group2;
			}
		}

		System.out.println(group1); // 2
		System.out.println(group2); // 4

	}

	public static int right_most_set_bit(int n) {
		return n & (~(n - 1));
	}
}
