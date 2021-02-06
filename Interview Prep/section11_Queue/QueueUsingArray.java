package section11_Queue;

public class QueueUsingArray {

	private int[] data;
	private int front;
	private int size;

	public QueueUsingArray() {
		data = new int[5];
		front = 0;
		size = 0;
	}

	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = 0;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == data.length;
	}

	public int getFirst() {
		return data[front];
	}

	public void enqueue(int item) throws Exception {
		if (isFull())
			throw new Exception("Queue is full...");

		int idx = (front + size) % data.length;
		data[idx] = item;
		size++;
	}

	public int dequeue() throws Exception {
		if (isEmpty())
			throw new Exception("Queue is empty...");

		int temp = data[front];
		data[front] = 0;
		size--;
		front = (front + 1) % data.length;
		return temp;
	}

	public void display() {
		System.out.println("-------------");
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println();
		System.out.println("-------------");
	}
}
