package Lecture15;

public class stackUsingArraysClient {

	public static void main(String[] args) throws Exception {

		stackUsingArrays stack = new stackUsingArrays(5);

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			stack.display();
		}
		System.out.println("\nsize of stack: " + stack.getSize() + "\n");

		System.out.println("---------- stack after all push operations -----\n");
		stack.display();
		System.out.println("top of stack after push: " + stack.top());
		// stack.push(60); // Exception in thread "main" java.lang.Exception: Stack is full

		System.out.println("\n popping elements from stack\n");
		while (!stack.isEmpty()) {
			stack.display();
			stack.pop();
		}

		System.out.println("\n stack after popping all elements\n");
		stack.display();
		System.out.println("\nstack size after popping: " + stack.getSize());

		// stack.pop(); // Exception in thread "main" java.lang.Exception: Stack is empty

	}

}


/* output:
10
End
*************
20
10
End
*************
30
20
10
End
*************
40
30
20
10
End
*************
50
40
30
20
10
End
*************

size of stack: 5

---------- stack after all push operations -----

50
40
30
20
10
End
*************
top of stack after push: 50

 popping elements from stack

50
40
30
20
10
End
*************
40
30
20
10
End
*************
30
20
10
End
*************
20
10
End
*************
10
End
*************

 stack after popping all elements

End
*************

stack size after popping: 0

*/