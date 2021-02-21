package section13_LinkedList;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();

		list.display();
		// System.out.println(list.getFirst()); // null pointer exception
		// System.out.println("\n last node item: " + list.getLast());
		// System.out.println(list.getAt(2)); // invalid index Exception

		list.addFirst(7);
		list.display();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);

		list.display();

		list.addFirst(5);

		list.display();

		list.addFirst(4);

		list.display();
		list.addLast(50);
		list.display();

		list.addFirst(3);
		list.display();
		System.out.println("\nfirst node item: " + list.getFirst());
		System.out.println("\nlast node item: " + list.getLast());

		System.out.println("\n");
		list.display();

		System.out.println(list.getAt(2));
		System.out.println(list.getAt(1));
		System.out.println(list.getAt(3));

		list.addAt(4, 400);
		list.display();

		list.addAt(0, 200);
		list.display();

		System.out.println("after removal");

		System.out.println(list.removeFirst());
		list.display();
		System.out.println(list.removeFirst());
		list.display();
		System.out.println("removing at last");
		System.out.println(list.removeLast());
		list.display();
		System.out.println(list.removeLast());
		list.display();
		System.out.println("removig at index..");
		System.out.println(list.removeAt(3));
		list.display();
		System.out.println(list.removeAt(0));
		list.display();

		System.out.println("reverse data");
		list.reverseData();
		list.display();

		list.reverseData();
		list.display();

		System.out.println("reverse pointer");
		System.out.println("before: ");
		list.display();
		list.reversePointer();
		System.out.println("after: ");

		list.display();

		System.out.println("\nmid node:" + list.midNode());
		list.addLast(100);
		list.display();
		System.out.println("\nmid node:" + list.midNode());

	}

}
