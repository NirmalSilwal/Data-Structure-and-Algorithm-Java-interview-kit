package section10_Stacks;

public class ReverseStack {

	public static void main(String[] args) throws Exception {

		StackUsingArray stack1 = new StackUsingArray(5);
		for (int i = 10; i <= 50; i += 10) {
			stack1.push(i);
		}
		stack1.display();

		StackUsingArray helperStack = new StackUsingArray(5);
		int currentDataPos = 0;

		reverseStack(stack1, helperStack, currentDataPos);
		System.out.println("\n after reversing stack...\n");
		stack1.display();
	}

	static void reverseStack(StackUsingArray stack1, StackUsingArray helper, int id) throws Exception {

		if (stack1.isEmpty())
			return;

		int currentItem = stack1.pop();
		reverseStack(stack1, helper, id + 1);

		helper.push(currentItem);

		if (id == 0) {
			while (!helper.isEmpty()) {
				stack1.push(helper.pop());
			}
		}
	}
}
