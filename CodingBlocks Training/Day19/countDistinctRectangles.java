package Lecture19;

// time complexity: O(N^2)

public class countDistinctRectangles {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int maxArea = 10;
		System.out.println(totalRectangles(arr, maxArea));
	}

	public static int totalRectangles(int[] arr, int maxArea) {
		int count = 0;

		for (int index = 0; index < arr.length; index++) {
			for (int cursor = 0; cursor < arr.length; cursor++) {
				if (arr[index] * arr[cursor] < maxArea) {
					count++;
				}
			}
		}

		return count;
	}

}

/*
 * output: 15 
 * 
 * explanation: given array arr, find total distinct possible way to
 * make rectangle from arr elements, having area less than maxArea, eg: 1*2 <
 * maxArea, count++, here (1*2) is one way, (2*1) is another way as length and
 * breadth are different for different
 */