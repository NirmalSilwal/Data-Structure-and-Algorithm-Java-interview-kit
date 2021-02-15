package section11_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumInEverySubarray {

	public static void main(String[] args) {

		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int windowSize = 3;
		firstNegativeInSubarray(arr, windowSize);
	}

	static void firstNegativeInSubarray(int[] arr, int k) {
		Queue<Integer> q = new LinkedList<Integer>();
		int i;
		for (i = 0; i < k; i++) {
			if (arr[i] < 0) {
				q.add(i);
			}
		}
		for (; i < arr.length; i++) {
			if (!q.isEmpty()) {
				System.out.print(arr[q.peek()] + " ");
			} else {
				System.out.print(0 + " ");
			}

			while (!q.isEmpty() && q.peek() <= i - k) {
				q.remove();
			}

			if (arr[i] < 0) {
				q.add(i);
			}
		}

		if (!q.isEmpty()) {
			System.out.print(arr[q.peek()] + " ");
		} else {
			System.out.print(0 + " ");
		}
	}

}

/* output:
-1 -1 -7 -15 -15 0 
 */
