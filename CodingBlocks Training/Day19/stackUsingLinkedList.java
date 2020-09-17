package Lecture19;

public class stackUsingLinkedList {

	private LinkedList list;

	public stackUsingLinkedList() {
		this.list = new LinkedList();
	}

	// O(1) time
	public void push(int data) {
		this.list.addFirst(data);
	}

	// O(1) time
	public int pop() throws Exception {
		return this.list.removeFirst();
	}

	// O(1) time
	public int size() {
		return this.list.size();
	}

	// O(1) time
	public boolean isEmpty() {
		return this.list.size() == 0;
	}

	// O(1) time
	public int top() {
		return this.list.getFirst();
	}

	// O(N) time
	public void display() {
		this.list.display();
	}
}
