package section6_Recursion;

public class PrintIncreasing {

	public static void main(String[] args) {
		int n = 5;
		printIncreasingRecursive(n);
	}

	// doing work when stack is falling/ when functions are popped from stack
	static void printIncreasingRecursive(int n) {
		// base case
		if (n == 0)
			return;

		printIncreasingRecursive(n - 1);
		System.out.println(n);
	}
}
