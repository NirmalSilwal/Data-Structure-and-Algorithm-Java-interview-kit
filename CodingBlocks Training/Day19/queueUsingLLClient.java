package Lecture19;

public class queueUsingLLClient {

	public static void main(String[] args) throws Exception {

		queueUsingLinkedList queue = new queueUsingLinkedList();

		System.out.println("queue is empty: " + queue.isEmpty());
		System.out.println("size of queue: " + queue.size());
		System.out.println("----------------------");

		for (int value = 1; value <= 5; value++) {
			queue.enqueue(value);
			queue.display();
		}
		System.out.println("----------------------");

		System.out.println("dequeued item: " + queue.dequeue());
		queue.display();
		System.out.println("dequeued item: " + queue.dequeue());
		queue.display();
		System.out.println("----------------------");

		queue.enqueue(100);
		queue.enqueue(200);
		queue.display();
		System.out.println("queue is empty: " + queue.isEmpty());
		System.out.println("size of queue: " + queue.size());
		System.out.println("front of queue: " + queue.front());

	}

}
