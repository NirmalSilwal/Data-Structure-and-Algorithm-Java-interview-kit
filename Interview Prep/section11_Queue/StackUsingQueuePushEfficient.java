package section11_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePushEfficient {

	Queue<Integer> primary;
	Queue<Integer> secondary;

	public StackUsingQueuePushEfficient() {
		primary = new LinkedList<Integer>();
		secondary = new LinkedList<Integer>();
	}

	// O(1) Time
	public void push(int item) {
		primary.add(item);
	}

	// O(N) Time
	public int pop() {
		while (primary.size() != 1) {
			secondary.add(primary.poll());
		}
		int poppedItem = primary.poll();

		Queue<Integer> temp = primary;
		primary = secondary;
		secondary = temp;

		return poppedItem;
	}

	// O(N) Time
	public int top() {
		while (primary.size() != 1) {
			secondary.add(primary.poll());
		}
		int topItem = primary.poll();
		secondary.add(topItem);

		Queue<Integer> temp = primary;
		primary = secondary;
		secondary = temp;

		return topItem;
	}

	public int size() {
		return primary.size();
	}
}
