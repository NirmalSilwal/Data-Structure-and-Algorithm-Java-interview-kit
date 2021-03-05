package section16_Hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayIntersection {

	public static void main(String[] args) {

		int[] arr1 = { 5, 1, 3, 4, 7 };
		int[] arr2 = { 2, 4, 3, 5, 7, 10, 15 };

		int[] intersection = intersectionArrays(arr1, arr2);

		System.out.println(Arrays.toString(intersection));
	}

	static int[] intersectionArrays(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// constraints: all elements are unique in given individual array
		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], 1);
		}

		int intersectCount = 0;
		
		// this loop can be avoided using ArrayList
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]))
				intersectCount++;
		}

		int[] intersections = new int[intersectCount];
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				intersections[index] = arr2[i];
				index++;
			}
		}

		return intersections;
	}
}
