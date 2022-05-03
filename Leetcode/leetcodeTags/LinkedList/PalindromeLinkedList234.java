package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList234 {

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

// 1st approach - O(N) time O(N) space
	public boolean isPalindrome(ListNode head) {
		if (head == null)
			return false;
		if (head.next == null)
			return true;

		List<Integer> list = new ArrayList<Integer>();

		ListNode temp = head;

		while (temp != null) {
			list.add(temp.val);
			temp = temp.next;
		}

		int start = 0, end = list.size() - 1;
		while (start < end) {
			if (list.get(start) != list.get(end))
				return false;
			start++;
			end--;
		}

		return true;
	}

// 2nd approach - O(N) time O(1) space
	public boolean isPalindrome2(ListNode head) {
		if (head == null)
			return false;
		if (head.next == null)
			return true;

// finding node before middle of list
		ListNode slow = head, fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

// now slow pointer will be at node just before the middle of the linkedlist
		ListNode middle1 = reverseList(slow.next);

// now using two pointer from start of list and middle of list and comparing values
		ListNode tempstart = head;
		ListNode middle = middle1;
		while (middle != null) {
			if (tempstart.val != middle.val)
				return false;
			tempstart = tempstart.next;
			middle = middle.next;
		}

// now if we reach here, it means it is palindrome
// joining slow and middle after reversing to retain original structure of LinkedList
		slow.next = reverseList(middle1);

		return true;
	}

	private static ListNode reverseList(ListNode head) {
			if (head == null || head.next == null)
				return head;
			
			ListNode prev = head;
			ListNode curr = head.next;
			ListNode nextNode = curr.next;
			prev.next = null;
			
			while (curr.next != null) {
				curr.next = prev;
				prev = curr;
				curr = nextNode;
				nextNode = curr.next;
			}
			
			curr.next = prev;
			
			return curr;
		}
}
