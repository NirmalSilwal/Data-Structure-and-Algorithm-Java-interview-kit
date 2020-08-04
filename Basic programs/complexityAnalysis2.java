package BasicPractice;

// complexity: O(N^2)
// The inner for loop has O(N) iterations and it is called N times. Therefore, the runtime is O(N^2). 

public class complexityAnalysis2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		printPairs(arr);
	}

	public static void printPairs(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}
}

/*
output:
1 1
1 2
1 3
1 4
2 1
2 2
2 3
2 4
3 1
3 2
3 3
3 4
4 1
4 2
4 3
4 4
*/
