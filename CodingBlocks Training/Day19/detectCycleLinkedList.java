package Lecture19;

import Lecture19.LinkedList.Node;

// time complexity: O(N)
// space complexity: O(1)

public class detectCycleLinkedList {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		System.out.println("list before cycle:");
		list.display();
		
		// before adding cycle
		System.out.println("before adding cycle: " + detectCycle(list));

		// adding cycle in linked list

		// System.out.println(list.getNodeAt(list.size()-1).next.data);
		// Exception in thread "main" java.lang.NullPointerException

		// pointing last node next to 2nd index (3rd node) to form cycle
		list.getNodeAt(list.size() - 1).next = list.getNodeAt(2);
		// list.display();
		// 10=>20=>30=>40=>50=>60=>30=>40=>50=>60=>30=>40 .... so on

		System.out.println("after adding cycle: " + detectCycle(list));
	}

	// Floyd cycle detection algorithm
	public static boolean detectCycle(LinkedList list) {
		Node slow = list.head;
		Node fast = list.tail;

		while (slow.next != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

}


/* output
list before cycle:
10=>20=>30=>40=>50=>60=>END

before adding cycle: false
after adding cycle: true
*/