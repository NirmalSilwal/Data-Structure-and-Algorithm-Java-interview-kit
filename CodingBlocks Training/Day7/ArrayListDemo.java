package Lecture7;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println(list); // []

		list.add(10);

		System.out.println(list); // [10]
		System.out.println(list.size()); // 1

		list.add(20);

		System.out.println(list); // [10, 20]
		System.out.println(list.size()); // 2

		list.add(30);

		System.out.println(list); // [10, 20, 30]
		System.out.println(list.size()); // 3

		list.add(40);

		System.out.println(list); // [10, 20, 30, 40]
		System.out.println(list.size()); // 4

		list.add(50);

		System.out.println(list); // [10, 20, 30, 40, 50]
		System.out.println(list.size()); // 5

		// displaying elements in list
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println("\n");
		System.out.println("test");
		System.out.println(list.get(0)); // 10

		System.out.println("before removing size is: " + list.size());
		System.out.println();
		list.remove(2);
		System.out.println(list); // [10, 20, 40, 50]
		System.out.println("after removing size is: " + list.size());

		System.out.println("\n adding 30 in 2nd index position");
		list.add(2, 30);
		System.out.println(list); // [10, 20, 30, 40, 50]

		System.out.println();
		System.out.println(list.remove(0)); // 10
		System.out.println(list); // [20, 30, 40, 50]
		
		
	}
}
