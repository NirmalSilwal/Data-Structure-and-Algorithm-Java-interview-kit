package section13_LinkedList;

public class QueueUsingLinkedList {

	LinkedList list;

	public QueueUsingLinkedList() {
		list = new LinkedList();
	}

	public void enqueue(int item) {
		this.list.addLast(item);
	}

	public int dequeue() throws Exception {
		return this.list.removeFirst();
	}

	public int front() throws Exception {
		return this.list.getFirst();
	}

	public void display() {
		this.list.display();
	}
}
