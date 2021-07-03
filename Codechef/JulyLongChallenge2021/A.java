package JulyLongChallenge2021;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tt = 0; tt < t; tt++) {
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			int ans = maximumProduction(d, x, y, z);

			System.out.println(ans);
		}
		sc.close();
	}

	private static int maximumProduction(int d, int x, int y, int z) {
		int ans1 = 7 * x;
		int remainingDays = 7 - d;
		int ans2 = (y * d) + (z * remainingDays);
		return Math.max(ans1, ans2);
	}
}
