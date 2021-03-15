
public class TappingRainWater {

	public static void main(String[] args) {

		int[] walls = { 3, 0, 0, 2, 0, 4 };

		System.out.println(trappingWater(walls)); // 10
	}

	// O(N) Time | O(N) space
	static int trappingWater(int arr[]) {
		int n = arr.length;

		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}

		right[n - 1] = arr[n - 1];
		for (int j = n - 2; j >= 0; j--) {
			right[j] = Math.max(right[j + 1], arr[j]);
		}

		int volume = 0;

		for (int k = 0; k < arr.length; k++) {
			volume += (Math.min(left[k], right[k]) - arr[k]);
		}

		return volume;
	}
}
