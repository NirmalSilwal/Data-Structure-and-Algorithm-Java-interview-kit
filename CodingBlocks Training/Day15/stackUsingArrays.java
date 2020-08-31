package Lecture15;

public class stackUsingArrays {

	private int[] data;
	private int tos;

	public stackUsingArrays(int capacity) {
		this.data = new int[capacity];
		this.tos = -1;
	}

	public void push(int item) throws Exception {
		if (this.getSize() == this.data.length) {
			throw new Exception("Stack is full");
		}
		this.tos++;
		this.data[this.tos] = item;
	}

	public int pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int answer = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return answer;
	}

	public int top() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return this.data[this.tos];
	}

	public int getSize() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		return this.getSize() == 0;
	}

	public void display() {
		for (int pos = this.tos; pos >= 0; pos--) {
			System.out.println(this.data[pos]);
		}
		System.out.println("End");
		System.out.println("*************");
	}
}
