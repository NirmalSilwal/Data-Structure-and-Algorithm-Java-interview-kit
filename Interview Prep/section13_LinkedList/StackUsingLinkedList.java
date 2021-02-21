package section13_LinkedList;

public class StackUsingLinkedList {

	private LinkedList list;

	public StackUsingLinkedList() {
		list = new LinkedList();
	}

	public void push(int item) {
		list.addFirst(item);
	}

	public int pop() throws Exception {
		return list.removeFirst();
	}

	public int top() throws Exception {
		return list.getFirst();
	}

	public void display() {
		list.display();
	}

}
