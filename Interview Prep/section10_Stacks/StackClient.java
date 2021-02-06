package section10_Stacks;

public class StackClient {

	public static void main(String[] args) throws Exception {

		int capacity = 5;
		StackUsingArray stack = new StackUsingArray(capacity);

		System.out.println(stack.isEmpty());

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();

		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());

		System.out.println();
		stack.push(40);
		stack.display();

		System.out.println();
		System.out.println(stack.pop());
		System.out.println();
		stack.display();
		System.out.println(stack.pop());
		System.out.println();
		stack.display();
	}

}
