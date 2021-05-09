package easy;

// LC#21. Merge Two Sorted Lists

public class MergeTwoSortedList21 {

	private class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;

		else if (l2 == null)
			return l1;

		ListNode merged = new ListNode(0);
		ListNode head = merged;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				head.next = l1;
				l1 = l1.next;
			} else {
				head.next = l2;
				l2 = l2.next;
			}
			head = head.next;
		}

		// head.next = l1 == null ? l2 : l1;

		while (l1 != null) {
			head.next = l1;
			l1 = l1.next;
		}
		while (l2 != null) {
			head.next = l2;
			l2 = l2.next;
		}

		return merged.next; // head is initialized with zero so, returning next
							// node
	}
}
