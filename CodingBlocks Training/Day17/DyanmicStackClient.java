package Lecture17;

public class DyanmicStackClient {

	public static void main(String[] args) throws Exception {

		int capacity = 5;
		DynamicStack stack = new DynamicStack(capacity);

		System.out.println("size of stack before exceeding capacity: "+ stack.data.length);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		stack.display();
		stack.push(60);
		stack.display();
		System.out.println("size of stack after exceeding capacity: "+ stack.data.length);
		
		System.out.println("top: " + stack.top());
	}

}
