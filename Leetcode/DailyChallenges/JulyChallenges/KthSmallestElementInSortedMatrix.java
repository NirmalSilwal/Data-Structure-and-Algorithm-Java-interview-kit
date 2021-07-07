package DailyChallenges.JulyChallenges;

import java.util.Arrays;

public class KthSmallestElementInSortedMatrix {

	public static int kthSmallest(int[][] matrix, int k) {

		int rows = matrix.length, cols = matrix[0].length;

		if (rows == cols && k == 1)
			return matrix[0][0];

		int[] allData = new int[rows * cols];
		int idx = 0;

		for (int ro = 0; ro < rows; ro++) {

			for (int col = 0; col < cols; col++) {
				allData[idx] = matrix[ro][col];
				idx++;
			}
		}

		Arrays.sort(allData);

		return allData[k - 1];
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		int k = 8;
		System.out.println(kthSmallest(matrix, k));

		int[][] matrix2 = { { -5 } };

		System.out.println(kthSmallest(matrix2, 1));
	}
}
