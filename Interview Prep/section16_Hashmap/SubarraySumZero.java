package section16_Hashmap;

import java.util.HashMap;

public class SubarraySumZero {

	public static void main(String[] args) {

		int[] arr = { 3, -5, -8, 9, -1 }; // true
		System.out.println(subArrayZero(arr));

		int[] arr2 = { 13, -5, -8, 9, 1 }; // true
		System.out.println(subArrayZero(arr2));
	}

	// O(N) Time
	static boolean subArrayZero(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		map.put(arr[0], true);

		int prefixSum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			prefixSum += arr[index];
			if (prefixSum == 0 || map.containsKey(prefixSum))
				return true;
			else
				map.put(prefixSum, true);
		}

		return false;
	}
}

/*
 * note: prefix sum, P[j] - P[i] = sum[i+1, j] if sum = 0, P[j] == P[i] brute
 * force approach will be O(N^2)Time, where we find all subarrays and check
 * their sum equals zero or not. prefix sum till ith index is sum of array from
 * 0 index to ith index
 */