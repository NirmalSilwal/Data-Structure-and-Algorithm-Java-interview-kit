package Lecture13;

public class waysToReachNStairs {

	public static void main(String[] args) {

		int stairs = 4;
		System.out.println(nStairs(stairs)); // 7
		System.out.println(nStairs(3)); // 4

	}

	public static int nStairs(int n) {
		/**
		 * Takes a number of stairs and return total ways you can reach top of it.
		 * @param n number of stairs
		 * @return total ways you can reach top of that stair, 
		 * at once you can either jump 1/2/3 stairs only
		 */
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		int ans = nStairs(n - 1) + nStairs(n - 2) + nStairs(n - 3);

		return ans;
	}
}
