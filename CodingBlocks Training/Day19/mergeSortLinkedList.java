package Lecture19;

import Lecture19.LinkedList.Node;

public class mergeSortLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(2);
		list.addLast(8);
		list.addLast(4);
		list.addLast(6);
		list.addLast(1);

		System.out.println("original list");
		list.display();

		LinkedList mergedSortedAnswer = mergeSortLL(list);

		System.out.println("sorted list using Merge Sort");
		mergedSortedAnswer.display();
	}

	public static LinkedList mergeSortLL(LinkedList list) {
		if (list.size() == 1) { // OR, if (list.head == list.tail)
			return list;
		}
		Node midNode = getMidNode(list);
		Node nextMidNode = midNode.next;

		// since we'r splitting list into two half, last node of first half
		// shall point to null
		midNode.next = null;

		LinkedList first = new LinkedList(list.head, midNode, (list.size() + 1) / 2);
		LinkedList second = new LinkedList(nextMidNode, list.tail, list.size() / 2);

		first = mergeSortLL(first);
		second = mergeSortLL(second);

		LinkedList merged = merge(first, second);

		return merged;

	}

	// O(N) time
	public static Node getMidNode(LinkedList list) {
		if (list.head == null) {
			return list.head;
		}
		Node slow = list.head;
		Node fast = list.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public static LinkedList merge(LinkedList firstList, LinkedList secondList) {
		if (firstList == null) {
			return secondList;
		}
		if (secondList == null) {
			return firstList;
		}
		LinkedList mergedSortedList = new LinkedList();

		Node cursor1 = firstList.head;
		Node cursor2 = secondList.head;

		while (cursor1 != null && cursor2 != null) {
			if (cursor1.data < cursor2.data) {
				mergedSortedList.addLast(cursor1.data);
				cursor1 = cursor1.next;
			} else {
				mergedSortedList.addLast(cursor2.data);
				cursor2 = cursor2.next;
			}
		}

		while (cursor1 != null) {
			mergedSortedList.addLast(cursor1.data);
			cursor1 = cursor1.next;
		}

		while (cursor2 != null) {
			mergedSortedList.addLast(cursor2.data);
			cursor2 = cursor2.next;
		}

		return mergedSortedList;
	}
}


/* output:
original list
10=>2=>8=>4=>6=>1=>END

sorted list using Merge Sort
1=>2=>4=>6=>8=>10=>END
*/