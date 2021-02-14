package section11_Queue;

public class StackUsingQueueClient {

	public static void main(String[] args) {

		System.out.println("\n---------push efficient--------\n");

		StackUsingQueuePushEfficient stack = new StackUsingQueuePushEfficient();

		System.out.println("size : " + stack.size());
		stack.push(10);
		stack.push(20);
		System.out.println("size : " + stack.size());
		System.out.println("top item is: " + stack.top());
		stack.push(30);
		System.out.println("top item is: " + stack.top());

		System.out.println("popped item: " + stack.pop());
		System.out.println("top item is: " + stack.top());
		System.out.println("top item is: " + stack.size());

		System.out.println("\n---------pop efficient--------\n");
		
		StackUsingQueuePopEfficient stack1 = new StackUsingQueuePopEfficient();

		System.out.println("size : " + stack1.size());
		stack1.push(10);
		stack1.push(20);
		System.out.println("size : " + stack1.size());
		System.out.println("top item is: " + stack1.top());
		stack1.push(30);
		System.out.println("top item is: " + stack1.top());

		System.out.println("popped item: " + stack1.pop());
		System.out.println("top item is: " + stack1.top());
		System.out.println("top item is: " + stack1.size());

	}

}
