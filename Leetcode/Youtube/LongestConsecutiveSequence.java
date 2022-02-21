package Leetcode.Youtube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	// O(n^2) time, O(n) space
	public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {

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
		int max = 1;
		int[] arrclone = arr.clone(); // making copy of original array

		Arrays.sort(arrclone); // sorting array

		int ans = 1;
		for (int i = 1; i < arrclone.length; i++) {
			if (arrclone[i - 1] == arrclone[i] - 1) {
				ans++;
				max = Math.max(ans, max);
			} else {
				ans = 1;
			}
		}

		return max;
	}

	public static void main(String[] args) {

//		int[] arr = { 100, 4, 200, 1, 3, 2 }; 
//		int[] arr = { 1, 5, 9, 13, 6, 12, 7, 11, 14, 15 };
		int[] arr = { 9, 5, 4, 9, 10, 10, 6 };
		int[] arr2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(lengthOfLongestConsecutiveSequence(arr, 7));
		System.out.println(lengthOfLongestConsecutiveSequence(arr2, 9));

		System.out.println(lengthOfLongestConsecutiveSequence2(arr, 7));
		System.out.println(lengthOfLongestConsecutiveSequence2(arr2, 9));

	}
}
