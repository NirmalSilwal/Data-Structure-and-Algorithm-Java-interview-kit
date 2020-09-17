package Lecture19;

public class StackUsingLLClient {

	public static void main(String[] args) throws Exception {

		stackUsingLinkedList stack = new stackUsingLinkedList();

		System.out.println("stack is empty: " + stack.isEmpty());
		System.out.println("size of stack: " + stack.size());
		System.out.println("----------------------");

		for (int value = 10; value <= 50; value += 10) {
			stack.push(value);
			stack.display();
		}
		System.out.println("----------------------");

		System.out.println("popped item: " + stack.pop());
		stack.display();
		System.out.println("popped item: " + stack.pop());
		stack.display();
		System.out.println("----------------------");

		stack.push(100);
		stack.push(200);
		stack.display();
		System.out.println("stack is empty: " + stack.isEmpty());
		System.out.println("size of stack: " + stack.size());
		System.out.println("top of stack: " + stack.top());

	}

}


/* output:
stack is empty: true
size of stack: 0
----------------------
10=>END

20=>10=>END

30=>20=>10=>END

40=>30=>20=>10=>END

50=>40=>30=>20=>10=>END

----------------------
popped item: 50
40=>30=>20=>10=>END

popped item: 40
30=>20=>10=>END

----------------------
200=>100=>30=>20=>10=>END

stack is empty: false
size of stack: 5
top of stack: 200
*/