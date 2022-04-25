package LinkedList;

public class LinkedListCycle141 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		
		if (head == null || head.next == null)
			return false;

		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null || slow.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;

			if (fast == null)
				return false;
			
			if (fast.next == null || slow.next == null)
				return false;
		}

		return false;
	}

}
