package LinkedList;

/*
 * Write a function to delete a node in a singly-linked list. You will not be given access to the 
 * head of the list, instead you will be given access to the node to be deleted directly.
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 */
public class DeleteNode237 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public void deleteNode(ListNode node) {

		ListNode currNext = node.next;

		int tempValue = node.val;
		node.val = currNext.val;
		currNext.val = tempValue;

		node.next = currNext.next;
	}
}
