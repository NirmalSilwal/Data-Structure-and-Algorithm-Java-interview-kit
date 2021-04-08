package section19_DynamicProgramming;

// application of Catalan series

public class UniqueBSTsCount {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(uniqueBSTsRecursion(n)); // 5
		System.out.println(uniqueBSTsRecursion(5)); // 42
		System.out.println(uniqueBSTsRecursion(6)); // 132
		// System.out.println(uniqueBSTsRecursion(70)); // 5

		System.out.println(uniqueBSTsTopDownDP(n, new int[n + 1]));
		System.out.println(uniqueBSTsTopDownDP(6, new int[7]));
		System.out.println(uniqueBSTsTopDownDP(70, new int[71]));

		System.out.println(uniqueBSTsBottomUpDP(n));
		System.out.println(uniqueBSTsBottomUpDP(70));

	}

	public static int uniqueBSTsRecursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int count = 0;

		for (int i = 1; i <= n; i++) {

			int leftSubtreeCount = uniqueBSTsRecursion(i - 1);
			int rightSubtreeCount = uniqueBSTsRecursion(n - i);

			int totalBSTiRootNode = leftSubtreeCount * rightSubtreeCount;
			count += totalBSTiRootNode;
		}
		return count;
	}

	public static int uniqueBSTsTopDownDP(int n, int[] storage) {
		if (n <= 1) {
			return 1;
		}
		int count = 0;

		if (storage[n] != 0) {
			return storage[n];
		}

		for (int i = 1; i <= n; i++) {

			int leftSubtreeCount = uniqueBSTsTopDownDP(i - 1, storage);
			int rightSubtreeCount = uniqueBSTsTopDownDP(n - i, storage);

			int totalBSTiRootNode = leftSubtreeCount * rightSubtreeCount;
			count += totalBSTiRootNode;
		}
		storage[n] = count;

		return count;
	}

	public static int uniqueBSTsBottomUpDP(int n) {
		int[] storage = new int[n + 1];
		// base case initialization
		storage[0] = 1;
		storage[1] = 1;

		for (int root = 2; root <= n; root++) {
			// logic from top down
			int count = 0;
			for (int i = 1; i <= root; i++) {
				int leftSubtreeCount = storage[i - 1];
				int rightSubtreeCount = storage[root - i];

				int totalBSTiRootNode = leftSubtreeCount * rightSubtreeCount;
				count += totalBSTiRootNode;
			}
			storage[root] = count;
		}

		return storage[n];
	}
}
