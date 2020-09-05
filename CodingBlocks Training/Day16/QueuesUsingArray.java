package Lecture16;

public class QueuesUsingArray {

	private int[] data;
	private int front;
	private int size;

	public QueuesUsingArray(int capacity) {
		this.data = new int[capacity];
		this.front = 0;
		this.size = 0;
	}

	public void enqueue(int value) throws Exception {
		if (this.queueSize() == this.data.length) {
			throw new Exception("queue is full");
		}

		int position = (this.front + this.size) % this.data.length;
		this.data[position] = value;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.queueSize() == 0) {
			throw new Exception("queue is empty");
		}
		int deqElement = this.data[this.front];
		this.data[this.front] = 0;
		this.size--;
		this.front = (this.front + 1) % data.length;
		return deqElement;
	}

	public int frontElement() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}
		return this.data[this.front];
	}

	public int queueSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.queueSize() == 0;
	}

	public void display() {
		for (int index = 0; index < this.data.length; index++) {
			int elementPos = (this.front + index) % data.length;
			System.out.print(this.data[elementPos] + " ");
		}
		System.out.println();
	}
}
