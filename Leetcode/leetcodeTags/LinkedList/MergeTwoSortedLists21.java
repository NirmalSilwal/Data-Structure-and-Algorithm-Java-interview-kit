package LinkedList;

public class MergeTwoSortedLists21 {

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

	// recursive
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		return merge(list1, list2);
	}

	private ListNode merge(ListNode list1, ListNode list2) {

		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		if (list1.val < list2.val) {
			list1.next = merge(list1.next, list2);
			return list1;
		} else {
			list2.next = merge(list1, list2.next);
			return list2;
		}
	}

	// iterative
	public ListNode mergeTwoListsIterative(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		ListNode mergedAns;
		ListNode tail;

		if (list1.val < list2.val) {
			mergedAns = list1;
			tail = list1;
			list1 = list1.next;
		} else {
			mergedAns = list2;
			tail = list2;
			list2 = list2.next;
		}

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tail.next = list1;
				tail = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				tail = list2;
				list2 = list2.next;
			}
		}

		if (list1 == null)
			tail.next = list2;

		if (list2 == null)
			tail.next = list1;

		return mergedAns;
	}
}
