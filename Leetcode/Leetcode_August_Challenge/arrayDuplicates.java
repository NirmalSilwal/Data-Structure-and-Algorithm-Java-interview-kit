package Leetcode_August_Challenge;

import java.util.ArrayList;

public class arrayDuplicates {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1, 3};

		System.out.println(findDuplicates(arr));
	}

	public static ArrayList<Integer> findDuplicates(int[] arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int cursor = 0; cursor < arr.length - 1; cursor++) {
			for (int rest = cursor + 1; rest < arr.length - 1; rest++) {
				if (arr[cursor] == arr[rest]) {
					result.add(arr[cursor]);
				}
			}
		}
		return result;
	}

}
