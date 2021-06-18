package CodingNinja.recursion;

public class printNumbers1toN {

	public static void printNum(int n) {
		if (n == 0) // base case
			return;

		printNum(n - 1); // recursive call

		System.out.println(n);
	}

	public static void main(String[] args) {
		printNum(5);
	}
}
