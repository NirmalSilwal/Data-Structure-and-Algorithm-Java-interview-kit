package Lecture19;

import Lecture19.LinkedList.Node;

// time complexity: O(n + m), where n & m are size of two lists

public class mergeLinkedList {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();

		list1.addFirst(1);
		list1.addLast(3);
		list1.addLast(10);
		list1.addLast(15);
		list1.addLast(20);

		LinkedList list2 = new LinkedList();

		list2.addFirst(2);
		list2.addLast(5);
		list2.addLast(10);
		list2.addLast(18);

		System.out.println("List1: ");
		list1.display();
		System.out.println("List2: ");
		list2.display();

		LinkedList merged = mergeLinkedList(list1, list2);
		System.out.println("merged list: ");
		merged.display();
	}

	static public LinkedList mergeLinkedList(LinkedList list1, LinkedList list2) {

		LinkedList mergedList = new LinkedList();

		Node temp1 = list1.head;
		Node temp2 = list2.head;

		while (temp1 != null && temp2 != null) {
			if (temp1.data < temp2.data) {
				mergedList.addLast(temp1.data);
				temp1 = temp1.next;
			} else {
				mergedList.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}

		while (temp1 != null) {
			mergedList.addLast(temp1.data);
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			mergedList.addLast(temp2.data);
			temp2 = temp2.next;
		}

		return mergedList;
	}

}

/*
 * output: List1: 1=>3=>10=>15=>20=>END
 * 
 * List2: 2=>5=>10=>18=>END
 * 
 * merged list: 1=>2=>3=>5=>10=>10=>15=>18=>20=>END
 */