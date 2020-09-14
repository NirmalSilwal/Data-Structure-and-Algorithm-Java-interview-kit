package Lecture19;

import Lecture19.LinkedList.Node;

// time complexity: O(N)

public class midOfLinkedList2 {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.display();

		System.out.println("mid of list is: " + getMidNode(list).data);

		System.out.println("\nadding one more element and checking:\n");
		list.addLast(60);

		list.display();

		System.out.println("mid of list is: " + getMidNode(list).data);
	}

	public static Node getMidNode(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

}
