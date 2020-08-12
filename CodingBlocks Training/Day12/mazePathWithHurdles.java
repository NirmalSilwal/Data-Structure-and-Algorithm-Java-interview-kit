package Lecture12;

public class mazePathWithHurdles {

	public static void main(String[] args) {

		int[][] arr = { { 0, 0, 9, 0 }, { 0, 0, 9, 0 }, { 9, 0, 0, 0 },
				{ 0, 9, 0, 0 } };
		// here 9 is the hurdle
		System.out.println("given board: ");
		displayMatrix(arr);
		int currentRow = 0, currentCol = 0, endRow = 3, endCol = 3;
		System.out.println("possible paths: \n");
		printMazePathHurdle(arr, endRow, endCol, currentRow, currentCol);

	}

	public static void printMazePathHurdle(int[][] arr, int endRow, int endCol,
			int currentRow, int currentCol) {

		if (currentRow == endRow && currentCol == endCol) {
			arr[currentRow][currentCol] = 1;
			displayMatrix(arr);
			return;
		}
		if (currentRow > endRow | currentCol > endCol) {
			return;
		}

		if (arr[currentRow][currentCol] == 9) {
			return; // back-track to previous cell
		}

		arr[currentRow][currentCol] = 1; // set to 1 to indicate the cell is
											// traversed

		printMazePathHurdle(arr, endRow, endCol, currentRow, currentCol + 1); // traverse
																				// horizontally
		printMazePathHurdle(arr, endRow, endCol, currentRow + 1, currentCol); // traverse
																				// vertically
		arr[currentRow][currentCol] = 1;
	}

	public static void displayMatrix(int[][] arr) {
		for (int row = 0; row < arr[0].length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		System.out.println("--------------");
	}
}

/*
output:

given board: 
0090
0090
9000
0900
--------------
possible paths: 

1190
0190
9111
0901
--------------
1190
0190
9111
0911
--------------
1190
1190
9111
0911
--------------
1190
1190
9111
0911
--------------

*/