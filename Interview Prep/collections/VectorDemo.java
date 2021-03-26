package collections;

import java.util.ListIterator;
import java.util.Vector;
/*
 * vector are synchronized, thread safe, slow than ArrayList, preferred in Multithreading 
 */

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.ensureCapacity(20);

		vector.add(10);
		vector.add(20);
		vector.add(30);

		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector.contains(20));
		System.out.println(vector.contains(60));
		System.out.println(vector);

		System.out.println("\nIterating the list...");
		ListIterator<Integer> list = vector.listIterator();

		System.out.println("\nIterating from front");
		while (list.hasNext()) {
			System.out.println(list.next());
		}

		System.out.println("\nIterating from last");
		while (list.hasPrevious()) {
			System.out.println(list.previous());
		}

	}

}
