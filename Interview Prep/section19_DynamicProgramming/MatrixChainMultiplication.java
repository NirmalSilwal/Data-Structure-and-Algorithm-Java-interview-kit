package section19_DynamicProgramming;

public class MatrixChainMultiplication {

	// to test exact running time
	public static long start() {
		return System.currentTimeMillis();
	}

	public static long end() {
		return System.currentTimeMillis();
	}

	public static void main(String[] args) {
		/*
		 * matrices dimensions:
		 * 
		 * M1: 4 x 2
		 * 
		 * M2: 2 x 3
		 * 
		 * M3: 3 x 5
		 * 
		 * M4: 5 x 1
		 */
		int[] matricesDimensions = { 4, 2, 3, 5, 1 };
		int len = matricesDimensions.length;
		int startIndex = 0, endIndex = len - 1;

		System.out.println(MCMRecursion(matricesDimensions, startIndex, endIndex)); // 29
		System.out.println(MCMTopDownDP(matricesDimensions, startIndex, endIndex, new int[len][len]));
		System.out.println(+MCMBottomUpDP(matricesDimensions));

		System.out.println("\ntesting large input...");

		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		int n = arr.length;

		System.out.println("\ntesting top down");

		long startTime = start();
		System.out.println("operations: " + MCMTopDownDP(arr, 0, n - 1, new int[n][n]));
		long stopTime = end();
		System.out.println("time taken: " + (stopTime - startTime) + " milliseconds");

		System.out.println("\ntesting bottom up");

		long startTime2 = start();
		System.out.println("operations: " + MCMBottomUpDP(arr));
		long stopTime2 = end();
		System.out.println("time taken: " + (stopTime2 - startTime2) + " milliseconds");

	}

	public static int MCMRecursion(int[] matrices, int si, int ei) {

		// for single matrix
		if (ei == (si + 1)) {
			return 0;
		}
		int min = Integer.MAX_VALUE;

		for (int splits = si + 1; splits <= ei - 1; splits++) {

			int firstHalf = MCMRecursion(matrices, si, splits); // matrices[si]*matrices[splits]
			int secondHalf = MCMRecursion(matrices, splits, ei); // matrices[splits]*matrices[ei]

			int selfWork = matrices[si] * matrices[splits] * matrices[ei];
			int total = firstHalf + secondHalf + selfWork;

			if (total < min) {
				min = total;
			}
		}
		return min;
	}

	public static int MCMTopDownDP(int[] matrices, int si, int ei, int[][] storage) {

		if (ei == (si + 1)) {
			return 0;
		}
		if (storage[si][ei] != 0) { // reuse
			return storage[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int splits = si + 1; splits <= ei - 1; splits++) {

			int firstHalf = MCMTopDownDP(matrices, si, splits, storage);
			int secondHalf = MCMTopDownDP(matrices, splits, ei, storage);

			int selfWork = matrices[si] * matrices[splits] * matrices[ei];
			int total = firstHalf + secondHalf + selfWork;

			if (total < min) {
				min = total;
			}
		}
		storage[si][ei] = min; // store

		return min;
	}
	
	// O(n^3) Time | O(n^2) Space
	public static int MCMBottomUpDP(int[] matrices) {
		int n = matrices.length;
		int[][] storage = new int[n][n];

		// filling diagonally
		for (int slide = 1; slide < n; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;

				// logic used in top down approach
				if (ei == (si + 1)) {
					storage[si][ei] = 0;
				} else {
					int min = Integer.MAX_VALUE;

					for (int splits = si + 1; splits <= ei - 1; splits++) {

						int firstHalf = storage[si][splits];
						int secondHalf = storage[splits][ei];

						int selfWork = matrices[si] * matrices[splits] * matrices[ei];
						int total = firstHalf + secondHalf + selfWork;

						if (total < min) {
							min = total;
						}
					}
					storage[si][ei] = min; // store
				}
			}
		}

		return storage[0][n - 1];
	}

}

/* output:
29
29
29

testing large input...

testing top down
operations: -2147334086
time taken: 3881 milliseconds

testing bottom up
operations: -2147334086
time taken: 1848 milliseconds
*/