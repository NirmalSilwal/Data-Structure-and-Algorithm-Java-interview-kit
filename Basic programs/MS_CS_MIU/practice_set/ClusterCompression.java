package com.maharishiuniversity.admit.practiceTest.set1;

/*
 * Define a cluster in an integer array to be a maximum sequence of elements that are all the 
 * same value. For example, in the array {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4} there are 5 clusters,
 * {3, 3, 3}, {4, 4}, {3}, {2, 2, 2, 2} and {4}. A cluster-compression of an array replaces
 * each cluster with the number that is repeated in the cluster.
 */
import java.util.Arrays;

public class ClusterCompression {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4 };
		System.out.println(Arrays.toString(clusterCompression(arr)));

		int[] arr2 = { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 };
		System.out.println(Arrays.toString(clusterCompression(arr2)));

		int[] arr3 = { -5, -5, -5, -5, -5 };
		System.out.println(Arrays.toString(clusterCompression(arr3)));

		int[] arr4 = {};
		System.out.println(Arrays.toString(clusterCompression(arr4)));

		int[] arr5 = { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1 };
		System.out.println(Arrays.toString(clusterCompression(arr5)));

		int[] arr6 = { 8, 8, 6, 6, -2, -2, -2 };
		System.out.println(Arrays.toString(clusterCompression(arr6)));

		int[] arr7 = { 18 };
		System.out.println(Arrays.toString(clusterCompression(arr7)));

	}

	// O(N) Time | O(c) Space, where c is num of cluster
	static int[] clusterCompression(int[] arr) {
		if (arr.length < 1)
			return arr;

		int numClusters = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				numClusters++;
			}
		}

		int[] result = new int[numClusters];
		int index = 0;
		result[index] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				index++;
				if (index < numClusters)
					result[index] = arr[i];
			}
		}

		return result;
	}
}

/*
 * output: 
 * [3, 4, 3, 2, 4] 
 * [0, 2, 0, 2, 0, 2, 0] 
 * [-5] 
 * [] 
 * [1, 2, 1] 
 * [8, 6, -2]
 * [18]
 */
