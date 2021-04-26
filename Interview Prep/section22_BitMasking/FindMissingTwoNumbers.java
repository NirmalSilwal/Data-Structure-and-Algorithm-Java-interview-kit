package section22_BitMasking;

/*
 * Given N, total items in final array, arr is array having N - 2 items 
 * in the range 1 to N. Find missing two elements in O(N)T, O(1)S
 */
public class FindMissingTwoNumbers {

	public static void main(String[] args) {

		int N = 6;
		int[] arr = { 1, 3, 4, 6 };
		findMissingTwo(N, arr);

		findMissingTwo(4, new int[] { 1, 4 });

		findMissingTwo(7, new int[] { 1, 4, 5, 2, 7 });

	}

	// O(N) Time | O(1) Space
	public static void findMissingTwo(int N, int[] arr) {

		// stores XOR of all items
		int missingSum = 0;

		for (int i = 0; i < arr.length; i++) {
			missingSum = missingSum ^ arr[i];
		}
		// now missingSum will hold sum of missing two elements
		// XOR of same number will get zero
		for (int num = 1; num <= N; num++) {
			missingSum = missingSum ^ num;
		}

		// get the set bit
		int setBit = missingSum & ~(missingSum - 1);

		int group1 = 0, group2 = 0;

		// check righmost setbit in array elements
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & setBit) == setBit) {
				group1 = group1 ^ arr[i];
			} else {
				group2 = group2 ^ arr[i];
			}
		}

		// now check setbit in range 1 to N
		for (int item = 1; item <= N; item++) {
			// set bit
			// (item & ~(item-1)) == 1
			if ((item & setBit) == setBit) {
				group1 = group1 ^ item;
			} else {
				// not a set bit
				group2 = group2 ^ item;
			}
		}

		System.out.println("missing elements: " + group1 + " and " + group2);
	}
}

/*
 * output: missing elements: 5 and 2 
 * missing elements: 3 and 2 
 * missing elements: 3 and 6
 */