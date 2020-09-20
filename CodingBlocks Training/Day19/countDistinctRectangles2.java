package Lecture19;

// time complexity: O(N)

public class countDistinctRectangles2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int maxArea = 10;
		System.out.println(totalRectangles(arr, maxArea)); // 15
	}

	// two pointer approach
	public static int totalRectangles(int[] arr, int area) {
		int count = 0;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			if (arr[left] * arr[right] < area) {
				count = count + 1 + 2 * (right - left);
				left++;
			} else {
				right--;
			}
		}

		return count;
	}
}
