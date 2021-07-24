package StartersJuly2021;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tt = 0; tt < t; tt++) {
			int r1 = sc.nextInt();
			int w1 = sc.nextInt();
			int c1 = sc.nextInt();

			int r2 = sc.nextInt();
			int w2 = sc.nextInt();
			int c2 = sc.nextInt();

			solveTask(r1, w1, c1, r2, w2, c2);
		}
		sc.close();
	}

	private static void solveTask(int r1, int w1, int c1, int r2, int w2, int c2) {

		int awin = 0, bwin = 0;

		if (r1 > r2)
			awin++;
		else
			bwin++;

		if (w1 > w2)
			awin++;
		else
			bwin++;

		if (c1 > c2)
			awin++;
		else
			bwin++;

		if (awin > bwin) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}
