package Lecture14;

public class maxHeightLadder {

	public static void main(String[] args) {

		int totalBlocks = 20;
		System.out.println(maxHeight(totalBlocks));

		System.out.println(maxHeight(21));
		System.out.println(maxHeight(100));
		System.out.println(maxHeight(1));
		System.out.println(maxHeight(0));
		System.out.println(maxHeight(6));
		System.out.println(maxHeight(7));
	}

	// make ladder of maximum height possible with given number of blocks
	public static int maxHeight(int n) {
		if (n < 1) {
			return -1;
		}
		int temp = n;
		int blocks = n * (n + 1) / 2;

		while (blocks > temp) {
			n = n / 2;
			blocks = n * (n + 1) / 2;
		}
		if (((n + 1) * (n + 2) / 2) <= temp) {
			return n + 1;
		}
		return n;
	}
}
