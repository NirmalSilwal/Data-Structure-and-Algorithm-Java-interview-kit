package section16_Hashmap;

public class GenericLinkedList<T> {

	private class Node {
		private T data;
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

	// O(1) Time
	public void addLast(T item) {
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

	// O(1) Time
	public void addFirst(T item) {
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
	public T getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");

		return this.head.data;
	}

	// O(1) Time
	public T getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");

		return this.tail.data;
	}

	// O(N) Time
	public T getAt(int index) throws Exception {
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

	// O(N) Time
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

	// O(N) Time
	public void addAt(int index, T item) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("invalid index...");
		}

		if (index == 0 || this.size == 0) {
			this.addFirst(item);
			return;
		}
		if (index == this.size) {
			this.addLast(item);
			return;
		}
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		Node temp = this.head;
		int id = 1;
		while (id < index) {
			temp = temp.next;
			id++;
		}
		// can also get above using getNodeAt(index-1)

		nn.next = temp.next;
		temp.next = nn;
		this.size++;
	}

	// O(1) Time
	public T removeFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");

		T firstNodeItem = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return firstNodeItem;
	}

	// O(N) Time
	public T removeLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");

		T lastNodeItem = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			Node secondLast = this.getNodeAt(this.size - 2);
			secondLast.next = null;
			this.tail = secondLast;
			this.size--;
		}
		return lastNodeItem;
	}

	// O(N) Time
	public T removeAt(int index) throws Exception {
		if (this.size == 0)
			throw new Exception("LinkedList is empty");

		if (index < 0 || index >= this.size)
			throw new Exception("invalid index");

		if (index == 0)
			return this.removeFirst();
		else if (index == this.size - 1)
			return this.removeLast();
		else {
			Node nodePrev = this.getNodeAt(index - 1);
			T returnVal = nodePrev.next.data;

			nodePrev.next = nodePrev.next.next;

			this.size--;

			return returnVal;
		}
	}

	public int find(T value) {
		int index = 0;
		for (Node temp = this.head; temp != null; temp = temp.next) {
			if (temp.data.equals(value))
				return index;
			index++;
		}
		return -1;
	}

}
