package Lecture17;

public class QueueUsingArray {

	protected int[] data;
	protected int front;
	protected int qsize;

	public QueueUsingArray(int capacity) {
		this.data = new int[capacity];
		this.front = 0;
		this.qsize = 0;
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Queue is Full");
		}
		int position = (this.front + this.qsize) % this.data.length;
		this.data[position] = item;
		this.qsize++;
	}

	public int size() {
		return this.qsize;
	}

	public int dequeue() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int deqItem = this.data[this.front];
		this.data[this.front] = 0;
		this.qsize--;
		this.front = (this.front + 1) % this.data.length;
		return deqItem;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void display() {
		for (int index = 0; index < this.data.length; index++) {
			int position = (this.front + index) % this.data.length;
			System.out.print(this.data[position] + " ");
		}
		System.out.println();
	}
}
