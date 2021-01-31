package section3_Function_1DArray;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 50, 35, 40 };
		int searchItem = 35;
		System.out.println(linSearch(arr, searchItem)); // 3
	}

	// O(N) time | O(1) Space
	static int linSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item)
				return i;
		}
		return -1;
	}
}
