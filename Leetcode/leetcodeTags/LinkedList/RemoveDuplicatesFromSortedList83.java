package LinkedList;

public class RemoveDuplicatesFromSortedList83 {

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

	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode recursionHead = deleteDuplicates(head.next);

		if (head.val == recursionHead.val)
			return recursionHead;
		else {
			head.next = recursionHead;
			return head;
		}
	}

	public ListNode deleteDuplicatesIterative(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode temp = head;

		while (temp != null) {

			if (temp.next != null && temp.val == temp.next.val) {

				ListNode nodeToBeDeleted = temp.next;
				temp.next = nodeToBeDeleted.next;

			} else {
				temp = temp.next;
			}
		}

		return head;
	}
}
