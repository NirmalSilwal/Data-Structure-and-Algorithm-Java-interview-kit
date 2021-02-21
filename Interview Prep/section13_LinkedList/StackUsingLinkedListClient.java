package section13_LinkedList;

public class StackUsingLinkedListClient {

	public static void main(String[] args) throws Exception {

		StackUsingLinkedList stack = new StackUsingLinkedList();

		stack.display();

		stack.push(10);
		stack.display();

		stack.push(20);
		stack.display();

		stack.push(30);
		stack.push(40);

		stack.display();

		System.out.println("\npopped item: " + stack.pop());
		stack.display();
		
		System.out.println("top: "+ stack.top());
	}

}
