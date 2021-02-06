package section10_Stacks;

public class StackUsingArray {

	private int tos;
	private int[] data;

	public StackUsingArray() {
		this.tos = -1;
		// initializing with 5 capacity
		data = new int[5];
	}

	public StackUsingArray(int capacity) {
		this.tos = -1;
		data = new int[capacity];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == data.length;
	}

	public void push(int item) throws Exception {
		if (isFull())
			throw new Exception("Stack is full...");
		tos++;
		data[tos] = item;
	}

	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty...");
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}

	public int peek() {
		return data[tos];
	}

	public void display() {
		System.out.println("displaying stack...");
		for (int i = tos; i >= 0; i--) {
			System.out.println(data[i]);
			System.out.println("-----");
		}
		System.out.println();
	}

}
