package section11_Queue;

import java.util.Stack;

public class QueueUsingStackEnqueueEfficient {

	Stack<Integer> primary;
	Stack<Integer> secondary;

	public QueueUsingStackEnqueueEfficient() {
		primary = new Stack<Integer>();
		secondary = new Stack<Integer>();
	}

	// O(1) Time
	public void enqueue(int item) {
		primary.push(item);
	}

	// O(N) Time
	public int dequeue() {
		while (primary.size() != 1) {
			secondary.push(primary.pop());
		}

		int removedItem = primary.pop();

		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}

		return removedItem;
	}

	// O(N) Time
	public int front() {
		while (primary.size() != 1) {
			secondary.push(primary.pop());
		}

		int front = primary.peek();

		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}

		return front;
	}

	public int size() {
		return primary.size();
	}
}
