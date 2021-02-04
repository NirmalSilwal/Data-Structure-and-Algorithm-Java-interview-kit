package section6_Recursion;

import java.util.Arrays;

public class SearchAllIndices {

	public static void main(String[] args) {
		int[] arr = { 3, 8, 1, 8, 8, 4 };
		int startIndex = 0;
		int count = 0;
		int searchItem = 8;

		int[] indices = allIndices(arr, startIndex, searchItem, count);
		System.out.println(Arrays.toString(indices)); // [1, 3, 4]
	}

	static int[] allIndices(int[] arr, int si, int data, int count) {

		if (si == arr.length) {
			int[] baseIndices = new int[count];
			return baseIndices;
		}

		int[] indices = null;
		if (arr[si] == data)
			indices = allIndices(arr, si + 1, data, count + 1);
		else
			indices = allIndices(arr, si + 1, data, count);

		if (arr[si] == data)
			indices[count] = si;

		return indices;
	}
}
