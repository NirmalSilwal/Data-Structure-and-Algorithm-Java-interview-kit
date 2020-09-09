package Lecture17;

import java.util.Stack;

public class nextGreaterOptimal {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 1, 5, 2, 6, 4 };

		nextGreaterElement(arr);
	}

	// time complexity ~~ O(2N) ~ O(N)
	public static void nextGreaterElement(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(arr[0]);

		for (int index = 1; index < arr.length; index++) {

			while (!stack.isEmpty() && arr[index] > stack.peek()) {
				int top = stack.pop();
				System.out.println(top + " -> " + arr[index]);
			}

			stack.push(arr[index]);
		}

		// now for those having no greater next element, they are left in stack
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " -> -1");
		}
	}

}


/* output
3 -> 8
1 -> 5
2 -> 6
5 -> 6
4 -> -1
6 -> -1
8 -> -1
*/