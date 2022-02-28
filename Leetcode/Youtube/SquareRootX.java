package Leetcode.Youtube;

public class SquareRootX {

	public static int mySqrt(int x) {

		for (int i = 0; i <= x; i++) {

			if (i * i == x)
				return i;

			if (i * i > x) {
				return i - 1;
			}
		}

		return -1;
	}

	// optimal approach using binary search
	public static int mySqrt2(int x) {
		if (x < 2)
			return x;

		long low = 1, high = x / 2;
		long ans = 0;

		while (low <= high) {
			
			long mid = low + (high - low) / 2;

			if (mid * mid <= x) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return (int)ans;
	}

	public static void main(String[] args) {

		System.out.println(mySqrt(4));
		System.out.println(mySqrt(8));
		System.out.println(mySqrt(2));
		System.out.println(mySqrt(67));
		System.out.println(mySqrt(86));
		System.out.println(mySqrt(40));
		System.out.println(mySqrt(999999999));
		
		System.out.println();
		
		System.out.println(mySqrt2(4));
		System.out.println(mySqrt2(8));
		System.out.println(mySqrt2(2));
		System.out.println(mySqrt2(67));
		System.out.println(mySqrt2(86));
		System.out.println(mySqrt2(40));
		System.out.println(mySqrt2(999999999));
	}
}
