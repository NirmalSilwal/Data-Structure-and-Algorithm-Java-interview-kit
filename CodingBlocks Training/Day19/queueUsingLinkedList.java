package Lecture19;

// dequeue efficient approach

public class queueUsingLinkedList {

	private LinkedList list;

	public queueUsingLinkedList() {
		this.list = new LinkedList();
	}

	// O(N) time
	public void enqueue(int data) {
		this.list.addLast(data);
	}

	// O(1) time
	public int dequeue() throws Exception {
		return this.list.removeFirst();
	}

	// O(1) time
	public int front() {
		return this.list.getFirst();
	}

	// O(1) time
	public int size() {
		return this.list.size();
	}

	// O(1) time
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// O(N) time
	public void display() {
		this.list.display();
	}

}
