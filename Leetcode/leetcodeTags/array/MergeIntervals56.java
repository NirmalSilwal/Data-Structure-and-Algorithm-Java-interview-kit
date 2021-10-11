package leetcodeTags.array;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
//import java.util.Comparator;

public class MergeIntervals56 {

	public static int[][] merge(int[][] intervals) {

		// sorting array by first element
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		LinkedList<int[]> merged = new LinkedList<>();

		for (int[] curr : intervals) {

			// check if merged list is empty or for non overlapping interval
			if (merged.isEmpty() || merged.getLast()[1] < curr[0]) {
				merged.add(curr);
			} else {
				// for overlapping intervals, update end index of previously
				// inserted array in the merged list
				merged.getLast()[1] = Math.max(merged.getLast()[1], curr[1]);
			}
		}

		return merged.toArray(new int[merged.size()][]);
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		System.out.println(Arrays.deepToString(merge(arr)));

		/*
		 * testing code to sort 2d array
		 * 
		 * int[][] arr = { { 1, 2 }, { 3, 5 }, { 0, 3 }, { 0, 1 }, { 0, 4 } };
		 * sort2dArrayBy1stIndex(arr);
		 * 
		 * // one line code to sort 2d array
		 * 
		 * Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
		 * 
		 * System.out.println(Arrays.deepToString(arr));
		 */
	}

	/*
	 * private static void sort2dArrayBy1stIndex(int[][] arr) {
	 * 
	 * Arrays.sort(arr, new Comparator<int[]>() {
	 * 
	 * @Override
	 * 
	 * public int compare(int[] o1, int[] o2) {
	 * 
	 * Integer first = (Integer) o1[0];
	 * 
	 * Integer second = (Integer) o2[0];
	 * 
	 * return first.compareTo(second); } }); }
	 */
}
