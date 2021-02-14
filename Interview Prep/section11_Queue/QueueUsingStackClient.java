package section11_Queue;

public class QueueUsingStackClient {

	public static void main(String[] args) {

		System.out.println("\n----------- enqueue efficient -------\n");

		QueueUsingStackEnqueueEfficient queue = new QueueUsingStackEnqueueEfficient();

		System.out.println("size : " + queue.size());
		queue.enqueue(10);
		queue.enqueue(20);
		System.out.println("front: " + queue.front());
		System.out.println("size : " + queue.size());

		queue.enqueue(30);
		queue.enqueue(1);

		System.out.println("removed: " + queue.dequeue());
		System.out.println("front: " + queue.front());

		System.out.println("\n----------- dequeue efficient -------\n");

		QueueUsingStackDequeueEfficient queue2 = new QueueUsingStackDequeueEfficient();

		System.out.println("size : " + queue2.size());
		queue2.enqueue(10);
		queue2.enqueue(20);
		System.out.println("front: " + queue2.front());
		System.out.println("size : " + queue2.size());

		queue2.enqueue(30);
		queue2.enqueue(1);

		System.out.println("removed: " + queue2.dequeue());
		System.out.println("front: " + queue2.front());

	}

}
