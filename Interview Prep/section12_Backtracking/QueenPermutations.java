package section12_Backtracking;

public class QueenPermutations {

	static int count = 0;

	public static void main(String[] args) {
		boolean[] board = new boolean[4];
		int queens = 2;
		int queenPlacedSoFar = 0;
		String ans = "";
		queenPermutation(board, queens, queenPlacedSoFar, ans);
	}

	public static void queenPermutation(boolean[] boxes, int q, int placedCount, String ans) {

		if (q == placedCount) {
			count++;
			System.out.println(count + ". " + ans);
			return;
		}

		for (int boxNum = 0; boxNum < boxes.length; boxNum++) {
			if (boxes[boxNum] == false) {

				boxes[boxNum] = true;

				queenPermutation(boxes, q, placedCount + 1, ans + "q" + placedCount + "b" + boxNum + " ");

				boxes[boxNum] = false;
			}
		}
	}
}

/* output:
1. q0b0 q1b1 
2. q0b0 q1b2 
3. q0b0 q1b3 
4. q0b1 q1b0 
5. q0b1 q1b2 
6. q0b1 q1b3 
7. q0b2 q1b0 
8. q0b2 q1b1 
9. q0b2 q1b3 
10. q0b3 q1b0 
11. q0b3 q1b1 
12. q0b3 q1b2 
*/
