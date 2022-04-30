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
}
