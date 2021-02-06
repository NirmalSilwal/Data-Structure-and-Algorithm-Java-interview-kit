package section11_Queue;

public class QueueClient {

	public static void main(String[] args) throws Exception {

		QueueUsingArray queue = new QueueUsingArray(4);

		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());

		queue.enqueue(10);
		queue.enqueue(20);
		queue.display();

		System.out.println(queue.getFirst());
		System.out.println(queue.size());

		System.out.println(queue.dequeue());
		queue.display();

		System.out.println();

		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		System.out.println(queue.isFull());
		// queue.enqueue(50); // queue is full exception

		System.out.println(queue.dequeue());
		queue.display();
		System.out.println(queue.dequeue());
		queue.display();
	}

}
