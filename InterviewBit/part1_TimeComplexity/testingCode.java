package part1_TimeComplexity;

public class testingCode {

	private static int searchNumOccurrence(int[] V, int k, int start, int end) {

		if (start > end)
			return 0;

		int mid = (start + end) / 2;

		if (V[mid] < k)
			return searchNumOccurrence(V, k, mid + 1, end);

		if (V[mid] > k)
			return searchNumOccurrence(V, k, start, mid - 1);

		return searchNumOccurrence(V, k, start, mid - 1) + 1 + searchNumOccurrence(V, k, mid + 1, end);
	}

}

/*
 * Time complexity: O(N) in worst case
 */