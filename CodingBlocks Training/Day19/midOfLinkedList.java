package Lecture19;

import Lecture19.LinkedList.Node;

public class midOfLinkedList {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();

		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);

		list.display();

		System.out.println("mid of list is: " + midList(list));

		System.out.println("\nadding one more element and checking:\n");
		list.addLast(60);

		list.display();

		System.out.println("mid of list is: " + midList(list));
	}

	public static int midList(LinkedList list) throws Exception {
		if (list == null) {
			throw new Exception("list is empty");
		}
		Node temp = list.head;
		double count = 0;

		while (temp != null) {
			count++;
			temp = temp.next;
		}
		temp = list.head;
		for (int pointer = 1; pointer < Math.ceil(count / 2); pointer++) {
			temp = temp.next;
		}

		return temp.data;
	}
}

/* output:
10=>20=>30=>40=>50=>END
mid of list is: 30

adding one more element and checking:

10=>20=>30=>40=>50=>60=>END
mid of list is: 30
*/