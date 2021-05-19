package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> finalList = new ArrayList<>();

		for (int row = 1; row <= numRows; row++) {

			ArrayList<Integer> currentRowPrint = new ArrayList<>();

			if (row == 1) {
				currentRowPrint.add(1);
				finalList.add(currentRowPrint);
			} else {
				currentRowPrint.add(1);

				// filling the middle elements in row
				List<Integer> toLoop = finalList.get(row - 2);
				int slow = 0, fast = 1, high = toLoop.size() - 1;

				while (fast <= high) {
					int addItem = toLoop.get(slow) + toLoop.get(fast);
					slow++;
					fast++;
					currentRowPrint.add(addItem);
				}

				currentRowPrint.add(1);
				finalList.add(currentRowPrint);
			}
		}

		return finalList;
	}

	public static void main(String[] args) {
		System.out.println(generate(5));
	}
}

/* ouptut:
[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
*/