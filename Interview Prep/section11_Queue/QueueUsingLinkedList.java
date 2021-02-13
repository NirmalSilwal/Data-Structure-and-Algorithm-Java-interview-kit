package section11_Queue;

import java.util.LinkedList;

public class QueueUsingLinkedList {

	LinkedList<Integer> list;

	public QueueUsingLinkedList() {
		list = new LinkedList<Integer>();
	}

	public void enqueue(int item) {
		list.addLast(item);
	}

	public int dequeue() {
		return list.removeFirst();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public int front() {
		return list.getFirst();
	}

	public void display() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		QueueUsingLinkedList queue = new QueueUsingLinkedList();

		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
		}

		queue.display();

		System.out.println(queue.dequeue());
		queue.display();
		System.out.println(queue.front());
		System.out.println(queue.dequeue());
		queue.display();
	}

}
