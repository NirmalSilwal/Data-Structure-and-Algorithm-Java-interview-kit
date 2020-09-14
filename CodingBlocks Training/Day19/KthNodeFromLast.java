package Lecture19;

import Lecture19.LinkedList.Node;

// time complexity: O(N)
// space complexity: O(1)

public class KthNodeFromLast {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.display();

		int kthVal = 2;
		int result = getKthLastValue(list, kthVal);
		System.out.println(kthVal + "th value from last is: " + result);
	}

	public static int getKthLastValue(LinkedList list, int k) throws Exception {
		if (list == null) {
			throw new Exception("list is empty");
		}
		if (k <= 0) {
			throw new Exception("Invalid index, enter key greater than zero!");
		}

		Node fast = list.head;
		Node slow = list.head;

		for (int position = 0; position < k; position++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}
}

/* output:
10=>20=>30=>40=>50=>END
2th value from last is: 40
*/