package Lecture17;

public class reverseStack {

	public static void main(String[] args) throws Exception {

		DynamicStack stack = new DynamicStack(5);
		DynamicStack helper = new DynamicStack(5);

		for (int i = 10; i <= 50; i += 10) {
			stack.push(i);
		}

		stack.display();
		reverseStack(stack, helper, 0);
	}

	public static void reverseStack(DynamicStack stack, DynamicStack helper, int id) throws Exception {

		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, id + 1);

		helper.push(item);
		if (id == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
		
		stack.display();
	}

}
