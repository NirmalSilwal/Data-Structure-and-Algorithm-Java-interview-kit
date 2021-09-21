package MustDoEasyList;

public class PeakIndexInMountainArray852 {

	public static int peakIndexInMountainArray(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return i - 1;
			}
		}

		return arr.length - 1;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1 };
		System.out.println(peakIndexInMountainArray(arr));
	}
}
