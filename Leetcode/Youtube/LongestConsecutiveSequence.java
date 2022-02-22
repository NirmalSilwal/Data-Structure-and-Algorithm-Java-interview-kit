package Leetcode.Youtube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

	// O(n^2) time, O(n) space
	public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {

		if (N == 0)
			return 0;

		Map<Integer, Integer> map = new HashMap<>();
		for (int n : arr) {
			if (!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1); // can skip this part
			}
		}

		int max = 0;

		for (int num : arr) {
			int count = 1;

			while (map.containsKey(num + 1)) {
				count++;
				num++;
			}

			max = Math.max(max, count);
		}

		return max;
	}

	// approach 2 using Sorting
	// O(NlogN) time, O(N) space
	public static int lengthOfLongestConsecutiveSequence2(int[] arr, int N) {
		if (N == 0)
			return 0;

		int max = 1;
		int[] arrclone = arr.clone(); // making copy of original array

		Arrays.sort(arrclone); // sorting array

		int ans = 1;
		for (int i = 1; i < arrclone.length; i++) {

			if (arrclone[i - 1] == arrclone[i] - 1) {
				ans++;
				max = Math.max(ans, max);

			} else if (arrclone[i] == arrclone[i - 1]) { // for duplicate elements
				continue;

			} else {
				ans = 1;
			}
		}

		return max;
	}

	// approach 3, most optimal - using HashSet
	// O(N) time | O(N) Space
	public static int lengthOfLongestConsecutiveSequence3(int[] arr, int N) {
		if (N == 0) {
			return 0;
		}
		Set<Integer> myset = new HashSet<Integer>();
		for (int num : arr) {
			myset.add(num);
		}

		int maxlen = 1;
		for (int n : arr) {
			int currmax = 1;

			if (myset.contains(n - 1)) // skip already searched sequence
				continue;
			else {
				while (myset.contains(n + 1)) {
					currmax++;
					n++;
				}
			}
			maxlen = Math.max(currmax, maxlen);
		}

		return maxlen;
	}

	public static void main(String[] args) {

		int[] arr = { 100, 4, 200, 1, 3, 2 };
		int[] arr2 = { 1, 5, 9, 13, 6, 12, 7, 11, 14, 15 };
		int[] arr3 = { 9, 5, 4, 9, 10, 10, 6 };
		int[] arr4 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

		System.out.println("brute force solution...");
		System.out.println(lengthOfLongestConsecutiveSequence(arr, 7));
		System.out.println(lengthOfLongestConsecutiveSequence(arr2, 9));
		System.out.println(lengthOfLongestConsecutiveSequence(arr3, 7));
		System.out.println(lengthOfLongestConsecutiveSequence(arr4, 9));

		System.out.println("\ntest using sorting technique...");
		System.out.println(lengthOfLongestConsecutiveSequence2(arr, 7));
		System.out.println(lengthOfLongestConsecutiveSequence2(arr2, 9));
		System.out.println(lengthOfLongestConsecutiveSequence2(arr3, 7));
		System.out.println(lengthOfLongestConsecutiveSequence2(arr4, 9));

		System.out.println("\ntest using hashset...");
		System.out.println(lengthOfLongestConsecutiveSequence3(arr, 7));
		System.out.println(lengthOfLongestConsecutiveSequence3(arr2, 9));
		System.out.println(lengthOfLongestConsecutiveSequence3(arr3, 7));
		System.out.println(lengthOfLongestConsecutiveSequence3(arr4, 9));

	}
}
