package LeetcodeOctober;

class roatateRightLinkedList {

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

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		int listLen = 1;
		ListNode temp = head;

		// by the end of this loop, temp will point to tail of list
		while (temp.next != null) {
			temp = temp.next;
			listLen++;
		}

		temp.next = head;

		ListNode pointer = head;
		int counter = listLen - (k % listLen) - 1;
		while (counter > 0) {
			pointer = pointer.next;
			counter--;
		}

		head = pointer.next;
		pointer.next = null;

		return head;
	}
	
	// define your main method to run the code
	// I have added the logic part only.
}