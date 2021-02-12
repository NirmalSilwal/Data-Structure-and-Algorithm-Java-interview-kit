package section12_Backtracking;

public class BlockedMazePathMove4Directions {

	public static void main(String[] args) {

		int N = 4, row = 0, col = 0;
		String ans = "";
		boolean[][] visitedBlock = new boolean[N][N];
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };

		mazePathBlocked(maze, row, col, ans, visitedBlock);
	}

	static void mazePathBlocked(int[][] maze, int row, int col, String ans, boolean[][] visited) {

		// positive base case
		if (row == maze.length - 1 && col == maze.length - 1) {
			System.out.println(ans);
			return;
		}

		// negative base case
		
		// note: use condition-> "row == -1 || col == -1" before other condition
		// to avoid ArrayIndexOutOfBounds Exception
		if (row == -1 || col == -1 || row == maze.length || col == maze[row].length || maze[row][col] == 1
				|| visited[row][col])
			return;

		// mark current block as visited
		visited[row][col] = true;

		// move top/upward
		mazePathBlocked(maze, row - 1, col, ans + "T", visited);

		// move down
		mazePathBlocked(maze, row + 1, col, ans + "D", visited);

		// move left
		mazePathBlocked(maze, row, col - 1, ans + "L", visited);

		// move right
		mazePathBlocked(maze, row, col + 1, ans + "R", visited);

		// undo / backtrack
		visited[row][col] = false;

	}
}

/* output:
DRRTRDDD
DRRDRD
DRRRDD
*/
