package facebook;

import java.util.ArrayList;
import java.util.HashMap;

public class MostCommonInSubarryKWindow {

	// O(NK) Time | O(K) Space, N is arr size, K is window size
	public static ArrayList<Integer> frequentItemInEachSubarrayK(int[] arr, int K) {
		// store answer
		ArrayList<Integer> frequency = new ArrayList<>();

		for (int i = 0; i <= arr.length - K; i++) {

			// maintain count in each subarray
			HashMap<Integer, Integer> countMap = new HashMap<>();

			// traversing each subarray
			for (int slide = i; slide < i + K; slide++) {

				int currentKey = arr[slide];

				if (!countMap.containsKey(currentKey)) {
					countMap.put(currentKey, 1);
				} else {
					countMap.put(currentKey, countMap.get(currentKey) + 1);
				}
			}

			int currentMaxCount = Integer.MIN_VALUE;
			for (Integer count : countMap.values()) {
				if (count > currentMaxCount)
					currentMaxCount = count;
			}

			// adding result in answer
			frequency.add(currentMaxCount);
		}

		return frequency;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 4, 1, 4, 4 };
		int windowSize1 = 4;

		System.out.println(frequentItemInEachSubarrayK(arr, windowSize1));

		int[] arr2 = { 1, 2 };
		int m = 2; // subarray of length m

		System.out.println(frequentItemInEachSubarrayK(arr2, m));

	}
}
