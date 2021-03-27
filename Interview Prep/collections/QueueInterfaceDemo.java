package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();

		queue.add(1);
		queue.add(2);
		queue.add(3);

		System.out.println(queue);
		System.out.println("peek item: " + queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}

/* output:
[1, 2, 3]
peek item: 1
1
1
[2, 3]
2
[3]
*/