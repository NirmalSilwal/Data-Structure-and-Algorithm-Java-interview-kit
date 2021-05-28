package array;

public class TwoMissingNumberInArray {

	// O(N) time | O(N) space
	public static void printTwoMissingNumbers(int[] arr) {
		int n = arr.length + 2;
		// initialized with zero
		int[] binaryArr = new int[n + 1];

		// set 1 in binaryArr for existing items in arr
		for (int num : arr) {
			binaryArr[num] = 1;
		}
		// print missing numbers
		for (int i = 1; i <= n; i++) {
			if (binaryArr[i] == 0) {
				System.out.println(i);
			}
		}
	}

	// O(N) time | O(1) Space
	public static void findMissingTwo(int[] arr) {
		int n = arr.length + 2;

		int totalSum = n * (n + 1) / 2;
		int arraySum = 0;

		for (int num : arr) {
			arraySum += num;
		}
		int missingSum = totalSum - arraySum;
		int missingAverage = missingSum / 2;

		int missingAvgSum = missingAverage * (missingAverage + 1) / 2;
		int firstMissing = totalSum - missingAvgSum;
		int secondMissing = missingSum - firstMissing;

		System.out.println(firstMissing);
		System.out.println(secondMissing);
	}

	public static void findMissingTwoXORapproach(int[] arr) {
		
		int n = arr.length;
		int missingXOR = n + 2; // [1, n+2] range of arr distinct items
		
		// finding xor of two missing elements
		for (int i = 0; i < n; i++) {
			missingXOR = missingXOR ^ arr[i]; // xored with all array items
			missingXOR = missingXOR ^ (i + 1); // xored in range 1 to n + 2
		}
		missingXOR = missingXOR ^ (n + 1);

		// finding the set bit, & then grouping based on bit is set or not in
		// that position
		// using left shift operation on 1 to get the set bit position, in LSB
		int setBitPosition = 0;
		for (int i = 0; i < 32; i++) {
			if ((missingXOR & (1 << i)) != 0) {
				setBitPosition = i;
				break;
			}
		}
		
		// grouping based on set bit position, if setBitPosition is set or not
		int group1 = 0, group2 = 0, setBitNumber = 1 << setBitPosition;
		
		// checking set bit in array items
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & setBitNumber) == 0) {
				group1 = group1 ^ arr[i]; // bit is set
			} else {
				group2 = group2 ^ arr[i]; // bit is not set
			}
		}

		// checking set bit in range 1 to n+2
		for (int i = 1; i <= n + 2; i++) {
			if ((i & setBitNumber) == 0) {
				group1 = group1 ^ i; // bit is set
			} else {
				group2 = group2 ^ i; // bit is not set
			}
		}

		System.out.println(group1);
		System.out.println(group2);
	}

	public static void main(String[] args) {
		// printTwoMissingNumbers(new int[] { 2, 1, 3, 5 });
		// findMissingTwo(new int[] { 2, 1, 4 });
		// findMissingTwoXORapproach(new int[] { 2, 1, 4 });
		findMissingTwoXORapproach(new int[] { 2, 3, 4, 5 });
	}
}
