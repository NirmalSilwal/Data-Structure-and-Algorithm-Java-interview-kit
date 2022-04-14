package LinkedList;

public class ReverseNodesInK_Group25 {

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

	// time: O(n), space: O(n/k)
	public ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || head.next == null || k == 1)
			return head;

		ListNode start = head;
		ListNode end = head;
		int moveEndCursor = k - 1;

		while (moveEndCursor != 0) {
			end = end.next;
			moveEndCursor--;

			if (end == null)
				return head;
		}

		ListNode newHead = reverseKGroup(end.next, k);

		reverseIterative(start, end);

		start.next = newHead;

		return end;
	}

	private void reverseIterative(ListNode start, ListNode end) {

		ListNode prev = null;
		ListNode curr = start;
		ListNode nxt = start.next;

		while (prev != end) {
			curr.next = prev;
			prev = curr;
			curr = nxt;

			if (nxt != null)
				nxt = nxt.next;
		}
	}

	// 2nd approach
	public ListNode reverseKGroupSpaceEfficient(ListNode head, int k) {
		f
	}

}
