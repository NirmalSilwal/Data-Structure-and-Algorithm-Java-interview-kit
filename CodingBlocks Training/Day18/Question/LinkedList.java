package Lecture18;

public class LinkedList {

	protected class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	int size;
	Node head;
	Node tail;

	public LinkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	// O(1) time
	public int size() {
		return this.size;
	}

	// O(1) time
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// O(1) time
	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	// O(1) time
	public void addLast(int data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	// O(n) time
	public Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size()) {
			throw new Exception("Invalid index");
		}

		if (index == 0) {
			return this.head;
		} else if (index == this.size() - 1) {
			return this.tail;
		} else {
			int counter = 0;
			Node temp = this.head;
			while (counter < index) {
				temp = temp.next;
				counter++;
			}
			return temp;
		}
	}

	// O(n) time
	public void addNodeAt(int index, int data) throws Exception {
		if (index == 0) {
			this.addFirst(data);
		} else if (index == this.size() - 1) {
			this.addLast(data);
		} else {
			Node previousNode = this.getNodeAt(index - 1);
			Node node = new Node(data, previousNode.next);
			previousNode.next = node;
			this.size++;
		}
	}

	// O(1) time
	public int getFirst() {
		return this.head.data;
	}

	// O(1) time
	public int getLast() {
		return this.tail.data;
	}

	// O(n) time
	public int getAt(int index) throws Exception {
		if (index < 0 || index >= this.size()) {
			throw new Exception("Invalid index");
		}

		if (index == 0) {
			return this.getFirst();
		} else if (index == this.size() - 1) {
			return this.getLast();
		} else {
			Node indexNode = this.getNodeAt(index);
			return indexNode.data;
		}
	}

	// O(1) time
	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}
		int value = this.head.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return value;
	}

	// O(1) time
	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int value = this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node secondLast = getNodeAt(this.size() - 2);
			secondLast.next = null;
			this.tail = secondLast;
		}
		this.size--;
		return value;
	}

	// O(n) time
	public int removeAt(int index) throws Exception {
		if (index < 0 || index >= this.size()) {
			throw new Exception("Invalid index");
		}

		if (index == 0) {
			return removeFirst();
		} else if (index == this.size() - 1) {
			return removeLast();
		} else {
			Node previousNode = this.getNodeAt(index - 1);
			int returnValue = previousNode.next.data;
			previousNode.next = previousNode.next.next;
			this.size--;
			return returnValue;
		}
	}

	// O(n) time
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}
}
