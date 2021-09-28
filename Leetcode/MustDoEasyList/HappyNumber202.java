package MustDoEasyList;

import java.util.HashMap;

public class HappyNumber202 {

	public static boolean isHappy(int n) {
		if (n < 1)
			return false;

		// to put intermediate squares value
		HashMap<Integer, Boolean> map = new HashMap<>();
		map.put(n, true);

		while (n != 1) {
			n = getSquareDigits(n);

			if (!map.containsKey(n)) {
				map.put(n, true);
			} else {
				return false;
			}
		}

		return n == 1 ? true : false;
	}

	private static int getSquareDigits(int n) {
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			ans += rem * rem;
			n /= 10;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(isHappy(19));
		System.out.println(isHappy(2));
	}
}
