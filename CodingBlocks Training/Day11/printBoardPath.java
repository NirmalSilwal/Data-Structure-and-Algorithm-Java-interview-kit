package Lecture11;

public class printBoardPath {

	public static void main(String[] args) {

		int start = 1;
		int end = 10;
		String result = "";

		displayBoardPath(end, start, result);
	}

	public static void displayBoardPath(int end, int current, String result) {

		if (current == end) {
			System.out.println(result);
			return;
		}
		if (current > end) {
			return;
		}

		for (int dice = 1; dice <= 6; dice++) {
			displayBoardPath(end, current + dice, result + dice);
		}
	}
}

/*
example output: - these are only few of the sample output
111111111
11111112
11111121
1111113
3222
3231
216
441
45
51111
5112
5121
513
5211
522
531
54
612
621
63
*/