package LinkedList;

public class MiddleOfLinkedList876 {

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

	public ListNode middleNode(ListNode head) {
		ListNode temp = head;
		int length = 1;

		while (temp.next != null) {
			temp = temp.next;
			length++;
		}
		int count = 0;
		ListNode temp2 = head;

		while (count < length / 2) {
			temp2 = temp2.next;
			count++;
		}
		return temp2;
	}

	// 2nd approach
	public ListNode middleNode2(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
}
