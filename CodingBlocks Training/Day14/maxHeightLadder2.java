package Lecture14;

// complexity: O(n)
public class maxHeightLadder2 {

	public static void main(String[] args) {

		int n = 20;
		System.out.println(maxHeight(n)); // 5

		System.out.println(maxHeight(21)); // 6
		System.out.println(maxHeight(100)); // 13
		System.out.println(maxHeight(1)); // 1
		System.out.println(maxHeight(0)); // -1
		System.out.println(maxHeight(6)); // 3
		System.out.println(maxHeight(7)); // 3
	}

	public static int maxHeight(int n) {
		if (n < 1) {
			return -1;
		}
		int answer = 0;
		for (int height = 1; height <= n; height++) {
			int blocksNeeded = height * (height + 1) / 2;
			if (blocksNeeded <= n) {
				answer = height;
			}
		}
		return answer;
	}
}
