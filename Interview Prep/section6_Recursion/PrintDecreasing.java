package section6_Recursion;

public class PrintDecreasing {

	public static void main(String[] args) {
		int n = 5;
		printDecreasingRecursive(n);
	}

	// doing work when stack is building up / when functions are pushed into stack
	static void printDecreasingRecursive(int n) {
		// base case
		if (n == 0)
			return;

		System.out.println(n);
		printDecreasingRecursive(n - 1);
	}
}

// note: since there was no statement after recursive call, all function in
// recursive stack are removed at once to save time. This concept is called
// Tail Recursion.