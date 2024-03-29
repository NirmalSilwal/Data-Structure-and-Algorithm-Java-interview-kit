package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists160 {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;

		Set<ListNode> set = new HashSet<>();

		ListNode temp1 = headA, temp2 = headB;

		while (temp1 != null) {
			set.add(temp1);
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			if (set.contains(temp2))
				return temp2;
			else {
				temp2 = temp2.next;
			}
		}

		return null;
	}

	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		int lenA = getLengthOfList(headA), lenB = getLengthOfList(headB);

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

	private int getLengthOfList(ListNode head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}

	// 3rd approach
	public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		ListNode dummy1 = headA, dummy2 = headB;

		while (dummy1 != dummy2) {
			dummy1 = dummy1 == null ? headB : dummy1.next;
			dummy2 = dummy2 == null ? headA : dummy2.next;
		}

		return dummy1;
	}
}
