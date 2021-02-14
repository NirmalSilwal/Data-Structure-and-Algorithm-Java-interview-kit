package section11_Queue;

public class QueueUsingStackClient {

	public static void main(String[] args) {

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

	}

}
