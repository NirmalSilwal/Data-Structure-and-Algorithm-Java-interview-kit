package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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

	// using arraylist and sorting
	// time O(NlogN) space O(N)
	public ListNode mergeKLists1(ListNode[] lists) {

		if (lists == null || lists.length == 0)
			return null;

		List<Integer> allnodes = new ArrayList<Integer>();

		for (ListNode node : lists) {
			while (node != null) {
				allnodes.add(node.val);
				node = node.next;
			}
		}

		Collections.sort(allnodes);

		ListNode dummy = new ListNode(-1);
		ListNode tail = dummy;

		for (int value : allnodes) {
			tail.next = new ListNode(value);
			tail = tail.next;
		}

		return dummy.next;
	}

	// heap solution
	public ListNode mergeKLists2(ListNode[] lists) {

		PriorityQueue<ListNode> minheap = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode l1, ListNode l2) {
				if (l1.val < l2.val)
					return -1;
				else if (l1.val > l2.val)
					return 1;
				else
					return 0;
			}
		});

		
		// using java 8
		
		// PriorityQueue<ListNode> minheap8 = new PriorityQueue<>(lists.length, (a,b) -> a.val - b.val);
		
		ListNode dummy = new ListNode(-1);
		ListNode tail = dummy;

		for (ListNode nodes : lists) {
			if (nodes != null)
				minheap.add(nodes);
		}

		while (!minheap.isEmpty()) {
			tail.next = minheap.poll();
			tail = tail.next;

			if (tail.next != null)
				minheap.add(tail.next);
		}

		return dummy.next;
	}

}
