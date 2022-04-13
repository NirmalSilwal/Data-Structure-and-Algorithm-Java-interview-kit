package LinkedList;

public class ReverseLinkedList206 {

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

	// using recursion
	public ListNode reverseList(ListNode head) {
		return recursiveReverse(head);
	}

	private ListNode recursiveReverse(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode newHead = recursiveReverse(head.next);

		head.next.next = head;
		head.next = null;

		return newHead;
	}

	// using iterative approach
	public ListNode reverseListIterative(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode prev = head;
		ListNode curr = head.next;
		ListNode nextNode = head.next.next;
		prev.next = null; // head node pointing to null as it will be tail at the end

		while (curr.next != null) {
			curr.next = prev;
			prev = curr;
			curr = nextNode;
			nextNode = curr.next;
		}

		// pointing last node to second last node
		curr.next = prev;

		return curr;
	}

}
