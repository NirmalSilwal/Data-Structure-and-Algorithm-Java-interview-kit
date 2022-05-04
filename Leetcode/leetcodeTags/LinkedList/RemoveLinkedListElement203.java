package LinkedList;

public class RemoveLinkedListElement203 {

	public class ListNode {
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

	// O(N) time, O(1) space
	public ListNode removeElements(ListNode head, int val) {

		if (head == null)
			if (head == null)
				return null;

		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode tail = dummy;

		while (head != null) {
			if (head.val == val) {
				ListNode temp = head.next;
				tail.next = temp;
				head = temp;
			} else {
				head = head.next;
				tail = tail.next;
			}
		}

		return dummy.next;
	}

	// recursive approach
	public ListNode removeElementsRecursive(ListNode head, int val) {

		if (head == null)
			return null;

		head.next = removeElementsRecursive(head.next, val);

		// can also write it using ternary operator
		if (head.val == val) {
			return head.next;
		} else
			return head;
	}
}
