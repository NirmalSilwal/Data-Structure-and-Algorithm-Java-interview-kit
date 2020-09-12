package Lecture18;

import Lecture18.LinkedList.Node;

public class reverseListPointers {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.display();

		reverseList(list);

		list.display();
	}
	
	// O(N) time
	public static void reverseList(LinkedList list) {
		Node prev = list.head;
		Node curr = prev.next;

		while (curr != null) {
			Node tempPrev = prev;
			Node tempCurr = curr;

			prev = curr;
			curr = curr.next;
			tempCurr.next = tempPrev;
		}

		// changing head and tail
		Node temp = list.head;
		list.head = list.tail;
		list.tail = temp;

		// pointing initial first node pointer to null
		list.tail.next = null;
	}

}


/* output:
10=>20=>30=>40=>50=>END
50=>40=>30=>20=>10=>END
*/