package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		System.out.println("\nHashSet demo");
		HashSet<Integer> set = new HashSet<>();

		System.out.println(set.isEmpty());

		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set.add(4));
		System.out.println(set.add(2));
		System.out.println(set);

		System.out.println(set.size());
		System.out.println(set.contains(1));
		System.out.println(set.isEmpty());

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nTreeSet demo");

		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(1);
		tset.add(2);
		tset.add(3);
		tset.add(6);

		System.out.println(tset);

		SortedSet<Integer> sortedset = tset.headSet(3, true);
		System.out.println(sortedset);

		SortedSet<Integer> sset = tset.tailSet(2, false);
		System.out.println(sset);

		System.out.println(tset.pollFirst());
	}

}

/* output:


HashSet demo
true
true
false
[1, 2, 3, 4]
4
true
false
1
2
3
4

TreeSet demo
[1, 2, 3, 6]
[1, 2, 3]
[3, 6]
1
*/