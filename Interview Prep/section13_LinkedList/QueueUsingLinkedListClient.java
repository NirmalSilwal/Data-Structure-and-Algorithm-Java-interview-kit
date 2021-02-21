package section13_LinkedList;

public class QueueUsingLinkedListClient {

	public static void main(String[] args) throws Exception {

		QueueUsingLinkedList queue = new QueueUsingLinkedList();

		queue.display();

		queue.enqueue(10);
		queue.display();

		queue.enqueue(20);
		queue.display();

		queue.enqueue(30);
		queue.display();

		queue.enqueue(40);
		queue.display();

		System.out.println("\nremoved: " + queue.dequeue());

		queue.display();

		System.out.println("\nfront: " + queue.front());
		queue.display();
	}
}


/* output:

-----------------------------------------------
NULL
-----------------------------------------------
10 -> NULL
-----------------------------------------------
10 -> 20 -> NULL
-----------------------------------------------
10 -> 20 -> 30 -> NULL
-----------------------------------------------
10 -> 20 -> 30 -> 40 -> NULL

removed: 10
-----------------------------------------------
20 -> 30 -> 40 -> NULL

front: 20
-----------------------------------------------
20 -> 30 -> 40 -> NULL
*/