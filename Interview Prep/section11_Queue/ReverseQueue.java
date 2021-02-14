package section11_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

		System.out.println(queue);
		
		reverseQueue(queue);

		System.out.println(queue);
	}

	public static void reverseQueue(Queue<Integer> queue) {
		if (queue.size() == 0)
			return;

		int item = queue.remove();
		reverseQueue(queue);
		queue.add(item);
	}

}
