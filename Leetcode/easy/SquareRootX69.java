package easy;

public class SquareRootX69 {

	// binary search technique
	public static int mySqrt(int x) {

		int left = 1, right = x;

		if (x < 2)
			return x;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (mid == x / mid) {
				return mid;

			} else if (mid > x / mid) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return right;
	}

	public static void main(String[] args) {
		System.out.println(mySqrt(20));
	}
}
