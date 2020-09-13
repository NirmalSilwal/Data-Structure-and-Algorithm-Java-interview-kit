package Lecture18;

import Lecture18.LinkedList.Node;

public class reverseListPointerRecursively {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.display();

		reverseListPointer(list);

		list.display();
	}

	public static void reverseListPointer(LinkedList list) {
		reversePointer(list.head, list);

		// swap head and tail of list
		Node temp = list.head;
		list.head = list.tail;
		list.tail = temp;

		// pointing newly made tail to null
		list.tail.next = null;
	}

	private static void reversePointer(Node node, LinkedList list) {
		if (node.next == null) {
			return;
		}
		reversePointer(node.next, list);

		node.next.next = node;
	}

}


/* output:
10=>20=>30=>40=>50=>END
50=>40=>30=>20=>10=>END
*/