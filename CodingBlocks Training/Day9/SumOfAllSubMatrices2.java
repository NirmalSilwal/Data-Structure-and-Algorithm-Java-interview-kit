package Lecture9;

// time complexity: O(n^2)

public class SumOfAllSubMatrices2 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 1 }, { 1, 1 } };

		System.out.println(sum_of_submatrices(arr));
	}

	public static int sum_of_submatrices(int[][] arr) {
		int sum = 0;
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {

				int tl = (i + 1) * (j + 1);
				int br = (len - i) * (len - j);

				sum = sum + (tl * br) * arr[i][j];
			}
		}

		return sum;
	}
}
