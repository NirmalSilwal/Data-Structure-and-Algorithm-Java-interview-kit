package BasicPractice;

// complexity: O(mn)
// where m is length of arr1 and n is length of arr2

public class complexityAnalysis3 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 2, 13, 4 };
		int[] arr2 = { 5, 6, 7, 80, 9, 10 };
		printUnorderedPairs(arr1, arr2);
	}

	public static void printUnorderedPairs(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {	// O(arr1.length) time
			for (int j = 0; j < arr2.length; j++) {	// O(arr2.length) time
				if (arr1[i] < arr2[j]) {	// O(1) constant time
					System.out.println(arr1[i] + " " + arr2[j]);
				}
			}
		}
	}
}

/*
output:
10 80
2 5
2 6
2 7
2 80
2 9
2 10
13 80
4 5
4 6
4 7
4 80
4 9
4 10
*/