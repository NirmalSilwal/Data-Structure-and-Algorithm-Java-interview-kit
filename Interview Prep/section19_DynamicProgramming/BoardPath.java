package section19_DynamicProgramming;

public class BoardPath {

	public static void main(String[] args) {
		int n = 100000;
		// int start = 0, end = n;
		// System.out.println(boardPathRecursive(start, end)); // 492
		// System.out.println(boardPathTopDown(start, end, new int[n]));
		System.out.println(boardPathBottomUp(n));
		System.out.println(boardPathBottomUpSpaceEfficient(n));
	}

	// O(6^n) Time | Space - recursion extra space
	public static int boardPathRecursive(int start, int end) {

		if (start == end) {
			return 1;
		}
		if (start > end) {
			return 0;
		}

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += boardPathRecursive(start + dice, end);
		}

		return count;
	}

	// O(N) Time | O(N) Space + recursion extra space
	// for large N, this will throw Stack overflow exception
	public static int boardPathTopDown(int current, int end, int[] storage) {

		if (current == end) {
			return 1;
		}
		if (current > end) {
			return 0;
		}

		if (storage[current] != 0) {
			return storage[current];
		}

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += boardPathTopDown(current + dice, end, storage);
		}

		storage[current] = count;

		return count;
	}

	// O(N) Time | O(N) Space
	public static int boardPathBottomUp(int end) {
		int[] storage = new int[end + 6];

		storage[end] = 1;

		for (int index = end - 1; index >= 0; index--) {
			storage[index] = storage[index + 1] + storage[index + 2] + storage[index + 3] + storage[index + 4]
					+ storage[index + 5] + storage[index + 6];
		}

		return storage[0];
	}

	// O(N) Time | O(1) Space
	public static int boardPathBottomUpSpaceEfficient(int end) {

		int[] storage = new int[6];

		storage[0] = 1; // store

		for (int slide = end - 1; slide >= 0; slide--) {
			int sum = 0;
			for (int idx = 5; idx > 0; idx--) {
				sum += storage[idx];
				storage[idx] = storage[idx - 1];
			}
			sum += storage[0];
			storage[0] = sum;
		}

		return storage[0];
	}
}
