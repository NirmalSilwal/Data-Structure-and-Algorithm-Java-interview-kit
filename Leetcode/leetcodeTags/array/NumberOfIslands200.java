package leetcodeTags.array;

/*
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
*/

public class NumberOfIslands200 {

	public static int numIslands(char[][] grid) {

		int count = 0; // counts total connected components

		// keeps track of visited vertex / position in grid
		boolean[][] visited = new boolean[grid.length][grid[0].length];

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {

				// if it is land and not visited
				// here 1 denotes land and 0 denotes water

				if (grid[row][col] == '1' && visited[row][col] == false) {
					dfsTraverse(grid, row, col, visited);
					count++;
				}
			}
		}

		return count;
	}

	private static void dfsTraverse(char[][] grid, int row, int col, boolean[][] visited) {

		// see if row and col are in boundary of matrix, if it is already
		// visited or if it is water

		if (row < 0 || col >= grid[0].length || row >= grid.length || col < 0 || visited[row][col] == true
				|| grid[row][col] == '0') {
			return;
		}

		visited[row][col] = true;

		// doing DFS traversal in four direction in matrix
		dfsTraverse(grid, row, col + 1, visited);
		dfsTraverse(grid, row, col - 1, visited);
		dfsTraverse(grid, row + 1, col, visited);
		dfsTraverse(grid, row - 1, col, visited);
	}

	public static void main(String[] args) {

		char[][] grid = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };

		char[][] grid2 = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };

		// System.out.println(numIslands(grid)); // 1
		System.out.println(numIslands(grid2)); // 1
	}
}
