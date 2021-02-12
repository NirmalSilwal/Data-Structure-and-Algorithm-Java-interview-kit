package section10_Stacks;

import java.util.Stack;

public class NextGreaterElementUsingStack {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 3, 8, 6, 7, 5 };
		nextGreaterElement(arr);
	}

	// O(N) Time | O(N) Space
	static void nextGreaterElement(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[i] > stack.peek()) {
				int topItem = stack.pop();
				System.out.println(topItem + " > " + arr[i]);
			}

			stack.push(arr[i]);
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " > " + -1);
		}
	}
}
/* output:
1 > 3
2 > 3
3 > 8
6 > 7
5 > -1
7 > -1
8 > -1
*/