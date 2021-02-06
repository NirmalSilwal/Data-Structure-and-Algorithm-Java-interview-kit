package section8_PrintRecursion;

public class CountBoardPath {

	public static void main(String[] args) {
		int start = 0, end = 10;
		System.out.println(countBoardpath(start, end)); // 492
	}

	public static int countBoardpath(int start, int end) {

		if (start > end)
			return 0;

		if (start == end)
			return 1;

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countBoardpath(start + dice, end);
		}
		return count;
	}
}
