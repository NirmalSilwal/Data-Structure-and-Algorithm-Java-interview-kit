package section11_Queue;

import java.util.Stack;

public class QueueUsingStackDequeueEfficient {

	Stack<Integer> primary;
	Stack<Integer> secondary;

	public QueueUsingStackDequeueEfficient() {
		primary = new Stack<Integer>();
		secondary = new Stack<Integer>();
	}

	// O(1) Time
	public int dequeue() {
		return primary.pop();
	}

	// O(N) Time
	public void enqueue(int item) {
		while (!primary.isEmpty()) {
			secondary.push(primary.pop());
		}

		primary.push(item);

		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}
	}

	// O(1) Time
	public int front() {
		return primary.peek();
	}

	// O(1) Time
	public int size() {
		return primary.size();
	}
}
