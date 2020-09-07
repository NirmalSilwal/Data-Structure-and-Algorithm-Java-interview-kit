package Lecture17;

public class reverseQueue {

	public static void main(String[] args) throws Exception {

		DynamicQueue queue = new DynamicQueue(5);

		for (int element = 1; element <= 5; element++) {
			queue.enqueue(element);
		}
		queue.display();

		reverseQ(queue);

		queue.display();
	}

	public static void reverseQ(DynamicQueue queue) throws Exception {
		if (queue.isEmpty()) {
			return;
		}

		int item = queue.dequeue();
		reverseQ(queue);

		queue.enqueue(item);
	}

}
