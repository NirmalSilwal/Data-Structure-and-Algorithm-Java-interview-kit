package lesson13;

import java.util.Stack;

/*
 * @author Nirmal Silwal
 * @contact nsilwal@miu.edu
*/

public class BalanceParanthesis {

	private static boolean validParanthesis(String expression) {
		if (expression.length() == 0)
			return true;

		Stack<Character> stack = new Stack<>();
		boolean valid = false;

		for (Character ch : expression.toCharArray()) {

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}

			if (ch == ')' || ch == '}' || ch == ']') {

				if (stack.isEmpty())
					return false; // nothing to match
				char topchar = stack.pop();

				if ((topchar == '(' && ch == ')') || (topchar == '{' && ch == '}') || (topchar == '[' && ch == ']'))
					valid = true;
				else
					return false;
			}

		}
		if (!stack.isEmpty()) // still there is some character in the Stack at the end
			valid = false;

		return valid;
	}

	public static void main(String[] args) {
		String expression = "(a+b)-{c/d}";
		System.out.println(validParanthesis(expression));
		System.out.println(validParanthesis("(a*b(a-b))"));
		System.out.println(validParanthesis("(a*b](a-b)"));
		System.out.println(validParanthesis("[A+25*(Y*(B+C-X-K/D)*(E+13)]+M"));

		// from LC judge
		String s = "([]){";
		System.out.println(validParanthesis(s));
	}

}
