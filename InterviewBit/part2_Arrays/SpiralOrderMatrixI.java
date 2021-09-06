package part2_Arrays;

import java.util.ArrayList;
import java.util.List;

/*
Given the following matrix:

[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
You should return

[1, 2, 3, 6, 9, 8, 7, 4, 5]
 */

public class SpiralOrderMatrixI {

	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {

		ArrayList<Integer> ans = new ArrayList<>();

		int left = 0, right = A.get(0).size() - 1;
		int top = 0, bottom = A.size() - 1;
		int direction = 1;
		int countElements = (right + 1) * (bottom + 1);

		while (left <= right && top <= bottom) {

			if (countElements > 0) {
				if (direction == 1) {
					for (int i = left; i <= right; i++) {
						ans.add(A.get(top).get(i));
						countElements--;
					}
					direction = 2;
					top++;
				}
			}

			if (countElements > 0) {
				if (direction == 2) {
					for (int i = top; i <= bottom; i++) {
						ans.add(A.get(i).get(right));
						countElements--;
					}
					direction = 3;
					right--;
				}
			}

			if (countElements > 0) {
				if (direction == 3) {
					for (int i = right; i >= left; i--) {
						ans.add(A.get(bottom).get(i));
						countElements--;
					}
					direction = 4;
					bottom--;
				}
			}

			if (countElements > 0) {
				if (direction == 4) {
					for (int i = bottom; i >= top; i--) {
						ans.add(A.get(i).get(left));
						countElements--;
					}
					direction = 1;
					left++;
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		List<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();

		input.add(new ArrayList<Integer>());
		input.add(new ArrayList<Integer>());
		input.add(new ArrayList<Integer>());

		input.get(0).add(1);
		input.get(0).add(2);
		input.get(0).add(3);
		input.get(1).add(4);
		input.get(1).add(5);
		input.get(1).add(6);
		input.get(2).add(7);
		input.get(2).add(8);
		input.get(2).add(9);

		System.out.println(input);

		System.out.println(spiralOrder(input));
	}
}
