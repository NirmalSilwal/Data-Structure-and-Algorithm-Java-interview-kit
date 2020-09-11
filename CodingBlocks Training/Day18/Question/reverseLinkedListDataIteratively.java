package Lecture18;

import Lecture18.LinkedList.Node;

// time complexity: O(N^2)

public class reverseLinkedListDataIteratively {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.display();

		reverseList(list);

		list.display();
	}

	// since we'r calling getNodeAt(), it is also O(N) operation, 
	// and we'r iterating approximately n times also, so O(N^2) time
	public static void reverseList(LinkedList list) throws Exception {
		int left = 0;
		int right = list.size() - 1;

		while (left < right) {
			Node lnode = list.getNodeAt(left);
			Node rnode = list.getNodeAt(right);

			int temp = lnode.data;
			lnode.data = rnode.data;
			rnode.data = temp;

			left++;
			right--;
		}
	}

}

/* output:
10=>20=>30=>40=>50=>END
50=>40=>30=>20=>10=>END
*/