package Lecture16;

import java.util.Stack;

public class inbuiltStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println(stack.peek()); // 50

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}

/*
output:  
50
40
30
20
10
 */
