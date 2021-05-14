package easy;

public class ReverseLinkedList206 {

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

	// O(N) Time | O(1) Space
	public ListNode reverseList1(ListNode head) {

		ListNode newHead = null;

		while (head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	// O(N) Time | O(N) Space
	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode newHead = reverseList(head.next);	

		head.next.next = head;
		head.next = null;
		
		return newHead;
	}
}
