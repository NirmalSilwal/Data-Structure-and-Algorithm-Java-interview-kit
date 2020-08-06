package BasicPractice;

import java.util.ArrayList;

public class arrayInsert {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 7 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		// inserting
		for (int i = 0; i < 3; i++) {
			list.add(i + 10);
		}
		System.out.println(list);
	}

}
