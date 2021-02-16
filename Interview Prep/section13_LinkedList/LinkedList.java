package section13_LinkedList;

public class LinkedList {

	private class Node {
		private int data;
		private Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(N) Time
	public void display() {
		System.out.println("-----------------------------------------------");
		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");

	}

	public void addLast(int item) {
		// create a new node
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;

		if (this.size >= 1)
			this.tail.next = newNode;

		if (this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail = newNode;
		}

		this.size++;
	}

	public void addFirst(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.next = null;

		if (this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
		this.size++;
	}

	// O(1) Time
	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");

		return this.head.data;
	}

	// O(1) Time
	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");

		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty...");

		if (index < 0 || index >= this.size) {
			throw new Exception("invalid index...");
		}

		Node temp = this.head;
		int id = 0;
		while (id < index) {
			temp = temp.next;
			id++;
		}
		return temp.data;
	}

	public Node getNodeAt(int index) throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty...");

		if (index < 0 || index >= this.size) {
			throw new Exception("invalid index...");
		}

		Node temp = this.head;
		int id = 0;
		while (id < index) {
			temp = temp.next;
			id++;
		}
		return temp;
	}
}
