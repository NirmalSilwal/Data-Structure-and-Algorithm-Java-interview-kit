package Lecture17;

public class QusingStackEnqEffClient {

	public static void main(String[] args) throws Exception {

		QueueUsingStackEnqueueEfficient queue = new QueueUsingStackEnqueueEfficient(5);
		
		System.out.println("queue is Empty: " + queue.isEmpty());

		for (int element = 1; element <= 5; element++) {
			queue.enqueue(element*10);
			queue.display();
			System.out.println("-------------------------------");
		}
		System.out.println("\nqueue after insertion:");
		queue.display();

		System.out.println("queue is Empty: " + queue.isEmpty());

		System.out.println("\ndeleting element: " + queue.dequeue());
		queue.display();
		
		System.out.println("\nsize of queue: "+ queue.size());
	}

}


/* output
queue is Empty: true
10 >> 
-------------------------------
10 >> 20 >> 
-------------------------------
10 >> 20 >> 30 >> 
-------------------------------
10 >> 20 >> 30 >> 40 >> 
-------------------------------
10 >> 20 >> 30 >> 40 >> 50 >> 
-------------------------------

queue after insertion:
10 >> 20 >> 30 >> 40 >> 50 >> 
queue is Empty: false

deleting element: 10
20 >> 30 >> 40 >> 50 >> 

size of queue: 4
*/