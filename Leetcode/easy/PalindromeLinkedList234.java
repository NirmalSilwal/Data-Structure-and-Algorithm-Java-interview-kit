package easy;

import java.util.ArrayList;

public class PalindromeLinkedList234 {

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

	public boolean isPalindrome1(ListNode head) {

		ArrayList<Integer> list = new ArrayList<>();
		ListNode temp = head;

		while (temp != null) {
			list.add(temp.val);
			temp = temp.next;
		}

		int front = 0, back = list.size() - 1;

		while (front <= back) {
			if (list.get(front) != list.get(back)) {
				return false;
			}
			front++;
			back--;
		}

		return true;
	}

	// 2nd approach
	// O(N) Time | O(1) Space
	public static boolean isPalindrome(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		// by the end of this loop, fast will reach end of List & slow to mid of
		// List
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		// reversing the right half of the List
		ListNode secondHalfHead = reversed(slow.next);
		ListNode firstHalfHead = head;

		// traversing two heads & comparing values
		while (secondHalfHead != null && firstHalfHead != null) {
			if (secondHalfHead.val != firstHalfHead.val) {
				return false;
			}

			secondHalfHead = secondHalfHead.next;
			firstHalfHead = firstHalfHead.next;
		}
		return true;
	}

	private static ListNode reversed(ListNode head) {
		ListNode newHead = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

}
