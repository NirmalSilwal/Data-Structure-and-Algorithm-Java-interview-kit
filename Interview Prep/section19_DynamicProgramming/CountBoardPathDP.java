package section19_DynamicProgramming;

public class CountBoardPathDP {

	public static void main(String[] args) {

		int n = 10;
		System.out.println(countBoardPath(n, 0, new int[n + 1])); // 492
		System.out.println(countBoardPathIterative(n)); // 492
	}

	// O(N) Time - recursive storage
	public static int countBoardPath(int end, int current, int[] storage) {
		if (current == end)
			return 1;
		if (current > end)
			return 0;

		if (storage[current] != 0)
			return storage[current];

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + countBoardPath(end, current + dice, storage);
		}
		storage[current] = count;

		return count;
	}

	// iterative storage
	// O(6N) ~ O(N) Time | O(N) Space
	public static int countBoardPathIterative(int n) {
		int[] storage = new int[n + 1];

		// seed
		storage[n] = 1;

		for (int index = n - 1; index >= 0; index--) {
			int currSum = 0;
			for (int dice = index + 1; dice <= index + 6 && dice <= n; dice++) {
				currSum = currSum + storage[dice];
			}
			storage[index] = currSum;
		}

		return storage[0];
	}
}
