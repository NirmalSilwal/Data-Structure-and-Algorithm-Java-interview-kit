package GeeksForGeeks;

/*input:
2
5 12
1 2 3 7 5
2 4

output:
2 4 
*/

import java.util.Scanner;

public class subarraySum2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int S = sc.nextInt();
			int[] arr = new int[N];
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
			}
			subarraySum(arr, S);
		}
	}

	public static void subarraySum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int total = 0;
				for (int k = i; k <= j; k++) {
					total = total + arr[k];
				}
				if (total == sum) {
					System.out.println((i + 1) + " " + (j + 1));
					return;
				}

			}
		}
		System.out.println(-1);
	}
}
