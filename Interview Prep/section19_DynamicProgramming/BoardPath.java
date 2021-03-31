package section19_DynamicProgramming;

public class BoardPath {

	public static void main(String[] args) {
		int n = 10;
		int start = 0, end = n;
		System.out.println(boardPathRecursive(start, end)); // 492
	}

	// O(6^n) Time
	public static int boardPathRecursive(int start, int end) {

		if (start == end) {
			return 1;
		}
		if (start > end) {
			return 0;
		}

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += boardPathRecursive(start + dice, end);
		}

		return count;
	}
}
