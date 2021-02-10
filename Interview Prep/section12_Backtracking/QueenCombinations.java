package section12_Backtracking;

public class QueenCombinations {

	static int count = 0;

	public static void main(String[] args) {
		boolean[] board = new boolean[4];
		int queens = 2;
		int queenPlacedSoFar = 0;
		String ans = "";
		int lastBoxPlaced = -1;

		queenCombination(board, queens, queenPlacedSoFar, ans, lastBoxPlaced);
	}

	static void queenCombination(boolean[] boxes, int q, int placed, String ans, int lastBoxPlaced) {

		if (q == placed) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		for (int boxid = lastBoxPlaced + 1; boxid < boxes.length; boxid++) {
			boxes[boxid] = true;
			queenCombination(boxes, q, placed + 1, ans + "q" + placed + "b" + boxid + " ", boxid);
		}
	}
}

/* output:

1. q0b0 q1b1 
2. q0b0 q1b2 
3. q0b0 q1b3 
4. q0b1 q1b2 
5. q0b1 q1b3 
6. q0b2 q1b3 
*/