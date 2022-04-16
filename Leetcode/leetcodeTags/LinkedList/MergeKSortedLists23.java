package LinkedList;

import java.util.PriorityQueue;

public class MergeKSortedLists23 {

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

	public ListNode mergeKLists(ListNode[] lists) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (ListNode head : lists) {

			while (head != null) {
				minHeap.add(head.val);
				head = head.next;
			}
		}

		ListNode dummy = new ListNode(-1);
		ListNode cursor = dummy;

		while (!minHeap.isEmpty()) {
			cursor.next = new ListNode(minHeap.remove());
			cursor = cursor.next;
		}

		return dummy.next;
	}

}
