package Lecture16;

public class QueueUsingArrayClient {

	public static void main(String[] args) throws Exception {

		int capacity = 6;
		QueuesUsingArray queue = new QueuesUsingArray(capacity);
		System.out.println("Queue in the beginning");
		System.out.println("Queue is empty: " + queue.isEmpty());

		queue.display();
		System.out.println("========================");

		for (int i = 10; i <= 60; i += 10) {
			queue.enqueue(i);
			queue.display();
			System.out.println("-----------------");
		}

		System.out.println("\nAfter enqueue operations");
		System.out.println("Queue is empty: " + queue.isEmpty());

		queue.display();
		System.out.println("size of queue is: " + queue.queueSize());
		System.out.println("========================");

		System.out.println("\ndequeuing.............\n");
		for (int i = 0; i < capacity; i++) {
			queue.display();
			queue.dequeue();
			System.out.println("-----------------");
		}

		System.out.println("\nAfter dequeue operations");
		queue.display();
		System.out.println("size of queue is: " + queue.queueSize());
		System.out.println("========================");

		// queue.dequeue(); // Exception in thread "main" java.lang.Exception:
		// queue is empty

	}

}
