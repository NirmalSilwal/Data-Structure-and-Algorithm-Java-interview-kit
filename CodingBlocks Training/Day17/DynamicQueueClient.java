package Lecture17;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {

		int capacity = 5;
		DynamicQueue queue = new DynamicQueue(capacity);

		for (int element = 1; element <= 5; element++) {
			queue.enqueue(element);
			queue.display();
			System.out.println("------------");
		}
		System.out.println("\nqueue after insertion: ");
		queue.display();
		System.out.println("\ndata size before dynamic expansion: "+ queue.data.length);

		System.out.println("\nadding element in queue after reaching limit: ");
		queue.enqueue(6);
		queue.display();
		System.out.println("\ndata size after dynamic expansion: "+ queue.data.length);

		System.out.println("\n---- again insertion---");
		queue.enqueue(7);
		queue.display();
		queue.enqueue(8);
		queue.display();
	}
}


/* output:
1 0 0 0 0 
------------
1 2 0 0 0 
------------
1 2 3 0 0 
------------
1 2 3 4 0 
------------
1 2 3 4 5 
------------

queue after insertion: 
1 2 3 4 5 

data size before dynamic expansion: 5

adding element in queue after reaching limit: 
1 2 3 4 5 6 0 0 0 0 

data size after dynamic expansion: 10

---- again insertion---
1 2 3 4 5 6 7 0 0 0 
1 2 3 4 5 6 7 8 0 0 
*/