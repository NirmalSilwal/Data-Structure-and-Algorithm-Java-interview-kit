package section19_DynamicProgramming;

import java.util.Arrays;

public class MixutureColors {

	public static void main(String[] args) {
		
		// int[] colors = { 40, 60, 20, 50};
		int[] colors = { 40, 60, 20, 50, 45, 12, 34 };
		int n = colors.length;
		int[] colors2 = { 40, 60, 20 };
		int n2 = colors2.length;

		int[][] storage = new int[n][n];
		for (int i = 0; i < storage.length; i++) {
			Arrays.fill(storage[i], -1);
		}

		System.out.println(mixtureRecursion(colors2, 0, n2 - 1));
		// System.out.println(mixtureTopDownDP(colors2, 0, n2 - 1, storage));

		System.out.println(mixtureRecursion(colors, 0, n - 1));
		System.out.println(mixtureTopDownDP(colors, 0, n - 1, storage));

		System.out.println("\nusing bottom up..");
		System.out.println(mixtureBottomUpDp(colors));
		System.out.println(mixtureBottomUpDp(colors2));

	}

	public static int mixtureRecursion(int[] colors, int si, int ei) {
		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int split = si; split < ei; split++) {

			int firstSmoke = mixtureRecursion(colors, si, split);
			int secondSmoke = mixtureRecursion(colors, split + 1, ei);

			int mixtureColor1 = giveColor(colors, si, split);
			int mixtureColor2 = giveColor(colors, split + 1, ei);

			int selfWork = mixtureColor1 * mixtureColor2;

			int totalSmoke = firstSmoke + secondSmoke + selfWork;
			if (totalSmoke < min) {
				min = totalSmoke;
			}
		}
		return min;
	}

	private static int giveColor(int[] colors, int i, int j) {
		int colorSum = 0;
		for (int id = i; id <= j; id++) {
			colorSum += colors[id];
		}

		return colorSum % 100;
	}

	public static int mixtureTopDownDP(int[] colors, int si, int ei, int[][] storage) {
		if (si == ei) {
			return 0;
		}

		if (storage[si][ei] != -1) {
			return storage[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int split = si; split < ei; split++) {

			int firstSmoke = mixtureTopDownDP(colors, si, split, storage);
			int secondSmoke = mixtureTopDownDP(colors, split + 1, ei, storage);

			int mixtureColor1 = giveColor(colors, si, split);
			int mixtureColor2 = giveColor(colors, split + 1, ei);

			int selfWork = mixtureColor1 * mixtureColor2;

			int totalSmoke = firstSmoke + secondSmoke + selfWork;
			if (totalSmoke < min) {
				min = totalSmoke;
			}
			storage[si][ei] = min;
		}
		return min;
	}

	public static int mixtureBottomUpDp(int[] colors) {
		int n = colors.length;
		int[][] storage = new int[n][n];

		for (int slide = 0; slide < n; slide++) {

			for (int si = 0; si < n - slide; si++) {

				int ei = si + slide;

				// logic from top-down DP
				if (si == ei) {
					storage[si][ei] = 0;
				} else {
					int min = Integer.MAX_VALUE;

					for (int split = si; split < ei; split++) {

						int firstSmoke = storage[si][split];
						int secondSmoke = storage[split + 1][ei];

						int mixtureColor1 = giveColor(colors, si, split);
						int mixtureColor2 = giveColor(colors, split + 1, ei);

						int selfWork = mixtureColor1 * mixtureColor2;

						int totalSmoke = firstSmoke + secondSmoke + selfWork;
						if (totalSmoke < min) {
							min = totalSmoke;
						}
						storage[si][ei] = min;
					}
				}
			}
		}

		return storage[0][n - 1];
	}
}
