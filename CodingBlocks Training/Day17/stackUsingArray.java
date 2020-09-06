package Lecture17;

public class stackUsingArray {

	protected int[] data;
	private int top;
	private int size;

	public stackUsingArray(int capacity) {
		this.data = new int[capacity];
		this.top = -1;
		this.size = 0;
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("stack is full");
		}
		this.data[this.top + 1] = item;
		this.top++;
		this.size++;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public int pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("stack is empty");
		}
		int poppedItem = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;
		this.size--;
		return poppedItem;
	}

	public int top() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("stack is empty");
		}
		return this.data[this.top];
	}

	public void display() {
		for (int index = this.top; index >= 0; index--) {
			System.out.print(this.data[index] + " >> ");
		}
		System.out.println();
	}
}
