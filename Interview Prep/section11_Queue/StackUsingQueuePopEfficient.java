package section11_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePopEfficient {

	Queue<Integer> primary;
	Queue<Integer> secondary;

	public StackUsingQueuePopEfficient() {
		primary = new LinkedList<Integer>();
		secondary = new LinkedList<Integer>();
	}

	// O(1) Time
	public int pop() {
		return primary.poll();
	}

	// O(N) Time
	public void push(int item) {
		secondary.add(item);
		while (!primary.isEmpty()) {
			secondary.add(primary.poll());
		}

		// pointing primary queue to secondary queue and vice-versa
		Queue<Integer> temp = secondary;
		secondary = primary;
		primary = temp;
	}

	// O(1) Time
	public int top() {
		return primary.peek();
	}

	public int size() {
		return primary.size();
	}
}
