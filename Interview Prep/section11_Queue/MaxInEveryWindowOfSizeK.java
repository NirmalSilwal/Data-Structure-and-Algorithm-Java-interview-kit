package section11_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxInEveryWindowOfSizeK {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int windowSize = 3;
		maxInEveryWindow(arr, windowSize);
		System.out.println();
		maxInEveryWindowOptimal(arr, windowSize);
	}

	// O(NK) Time where K is windowSize | O(1) Space
	static void maxInEveryWindow(int[] arr, int windowSize) {
		int totalAnswers = arr.length - windowSize + 1;

		for (int slots = 0; slots < totalAnswers; slots++) {
			int currentMax = arr[slots];

			for (int pos = slots; pos < slots + windowSize; pos++) {
				if (arr[pos] > currentMax)
					currentMax = arr[pos];
			}

			System.out.print(currentMax + " ");
		}
	}

	// optimal approach

	// O(N) Time | O(1) Space
	static void maxInEveryWindowOptimal(int[] arr, int k) {

		Deque<Integer> q = new LinkedList<Integer>();
		int i;

		// processing first k elements
		for (i = 0; i < k; i++) {
			// for every element the previous smaller elements will not be the
			// max value so remove it
			while (!q.isEmpty() && arr[i] > arr[q.getLast()]) {
				q.removeLast();
			}

			// add new index to last of deque
			q.addLast(i);
		}

		// for remaining elements (n-k)
		for (; i < arr.length; i++) {

			// first index in deque has max corresponding value
			System.out.print(arr[q.getFirst()] + " ");

			// remove the elements which are out of this window
			while (!q.isEmpty() && q.getFirst() <= i - k) {
				q.removeFirst();
			}

			// removing all elements that are smaller than current element
			while (!q.isEmpty() && arr[i] > arr[q.getLast()]) {
				q.removeLast();
			}

			q.addLast(i);
		}
		System.out.print(arr[q.getFirst()]);
	}

}


/* output:

3 3 4 5 5 5 6 
3 3 4 5 5 5 6

*/