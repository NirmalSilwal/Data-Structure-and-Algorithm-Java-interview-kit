package Lecture18;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();

		System.out.println("list is empty: " + list.isEmpty());
		System.out.println("size of list: " + list.size());

		list.addFirst(10);
		list.addFirst(5);
		list.display();

		list.addLast(50);
		list.addLast(60);
		list.display();
		System.out.println("size of list: " + list.size());

		list.addNodeAt(2, 30);
		list.display();

		System.out.println(list.getAt(3));

		list.addNodeAt(3, 40);
		list.display();

		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		System.out.println("list is empty: " + list.isEmpty());

		System.out.println("size of list: " + list.size());

		list.display();
		System.out.println("removed first node data: " + list.removeFirst());
		list.display();

		list.removeLast();
		list.display();

		list.addNodeAt(1, 20);
		list.addNodeAt(2, 25);
		list.display();

		System.out.println("removing at 2nd index: " + list.removeAt(2));
		list.display();
	}

}


/* output:
list is empty: true
size of list: 0
5=>10=>END
5=>10=>50=>60=>END
size of list: 4
5=>10=>30=>50=>60=>END
50
5=>10=>30=>40=>50=>60=>END
5
60
list is empty: false
size of list: 6
5=>10=>30=>40=>50=>60=>END
removed first node data: 5
10=>30=>40=>50=>60=>END
10=>30=>40=>50=>END
10=>20=>25=>30=>40=>50=>END
removing at 2nd index: 25
10=>20=>30=>40=>50=>END
*/