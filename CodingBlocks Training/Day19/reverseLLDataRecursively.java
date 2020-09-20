package Lecture19;

import Lecture19.LinkedList.Node;

public class reverseLLDataRecursively {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.display();

		reverseDataRecursive(list);

		list.display();
	}

	public static void reverseDataRecursive(LinkedList list) {
		heapMover obj = new heapMover(list.head);

		reverseDataRecursive(list, obj, list.head, 0);
	}

	private static void reverseDataRecursive(LinkedList list, heapMover left,
			Node right, int level) {
		
		if (right == null) {
			return;
		}
		reverseDataRecursive(list, left, right.next, level+1);

		if (level > list.size() / 2) {
			int temp = left.node.data;
			left.node.data = right.data;
			right.data = temp;

			left.node = left.node.next;
		}
	}

}
