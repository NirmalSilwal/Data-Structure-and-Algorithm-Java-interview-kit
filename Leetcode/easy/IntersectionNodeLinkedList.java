package easy;

// LC#160 Intersection of Two Linked Lists

public class IntersectionNodeLinkedList {

	private class ListNode {
		int val;
		ListNode next;

		public ListNode(int x) {
			val = x;
			next = null;
		}

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = getSize(headA), lenB = getSize(headB);
		// adjust correct start position of pointer
		while (lenA > lenB) {
			headA = headA.next;
			lenA--;
		}

		while (lenB > lenA) {
			headB = headB.next;
			lenB--;
		}

		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}

		return headA;
	}

	private static int getSize(ListNode list) {
		int size = 0;
		while (list != null) {
			size++;
			list = list.next;
		}
		return size;
	}

	// approach 2
	public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;

		ListNode tempA = headA;
		ListNode tempB = headB;

		while (tempA != tempB) {
			tempA = tempA == null ? headB : tempA.next;
			tempB = tempB == null ? headA : tempB.next;
		}

		return tempA;
	}
}
