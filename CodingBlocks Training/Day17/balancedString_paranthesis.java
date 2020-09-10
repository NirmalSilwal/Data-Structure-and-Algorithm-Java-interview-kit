package Lecture17;

import java.util.Stack;

public class balancedString_paranthesis {

	public static void main(String[] args) {

		String str = "{([a+b]+[c+d])}";

		System.out.println(isBalanced(str));

		System.out.println(isBalanced("")); // case 0
		System.out.println(isBalanced("[a+b"));
		System.out.println(isBalanced("a+b)])")); // case 2.1
		System.out.println(isBalanced("a+b+c+d*e-e")); // case 3
		System.out.println(isBalanced("{[a+b]}"));
	}

	public static boolean isBalanced(String str) {

		// case 0
		if (str.equals("")) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		
		int notParanthesiscount = 0;
		
		for (int index = 0; index < str.length(); index++) {

			char cc = str.charAt(index);

			// case 1
			if (cc == '{' || cc == '[' || cc == '(') {
				stack.push(cc);
			}

			// case 2
			else if (cc == '}' || cc == ']' || cc == ')') {

				// case 2.1
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.peek();

				// case 2.2
				if (cc == ']') {
					if (top == '[') {
						return true;
					} else {
						return false;
					}

					// case 2.3
				} else if (cc == '}') {
					if (top == '{') {
						return true;
					} else {
						return false;
					}
				}

				// case 2.4
				else if (cc == ')') {
					if (top == '(') {
						return true;
					} else {
						return false;
					}
				}

			}

			// case 3
			else {
				// do nothing for any other character in string rather than
				// parenthesis
				notParanthesiscount++;
			}
		}
		if (stack.isEmpty() && notParanthesiscount != str.length()) {
			return true;
		} else {
			return false;
		}
	}

}


/* output
true
false
false
false
false
true
*/