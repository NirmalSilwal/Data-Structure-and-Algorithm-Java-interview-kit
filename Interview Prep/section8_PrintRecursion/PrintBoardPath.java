package section8_PrintRecursion;

public class PrintBoardPath {

	public static void main(String[] args) {
		int start = 0, end = 10;
		String ans = "";
		printBoardpath(start, end, ans);
	}

	static void printBoardpath(int start, int end, String ans) {

		if (start == end) {
			System.out.println(ans);
			return;
		}

		if (start > end)
			return;

		for (int dice = 1; dice <= 6; dice++) {
			printBoardpath(start + dice, end, dice + ans);
		}
	}
}
