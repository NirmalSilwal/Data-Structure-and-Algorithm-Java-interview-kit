package LinkedList;

public class LinkedListCycleII142 {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode detectCycle(ListNode head) {

		if (head == null || head.next == null)
			return null;

		ListNode ptr1 = head;
		ListNode ptr2 = detectCycle1(head);

		if (ptr2 == null)
			return null;

		while (ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		return ptr1 == ptr2 ? ptr1 : null;
	}

	private static ListNode detectCycle1(ListNode head) {
		if (head == null || head.next == null)
			return null;

		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return fast;
			}
		}
		return null;
	}
}
