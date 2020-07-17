package Lecture9;

//time complexity: O(n^6)

public class SumOfAllSubMatrices1 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 1 }, { 1, 1 } };

		System.out.println(sum_of_submatrices(arr));
	}

	public static int sum_of_submatrices(int[][] arr) {
		int sum = 0;
		int len = arr.length;

		for (int tli = 0; tli < len; tli++) {
			for (int tlj = 0; tlj < len; tlj++) {
				for (int bri = tli; bri < len; bri++) {
					for (int brj = tlj; brj < len; brj++) {
						for (int i = tli; i <= bri; i++) {
							for (int j = tlj; j <= brj; j++) {
								sum = sum + arr[i][j];
							}
						}
					}
				}
			}
		}

		return sum;
	}
}
