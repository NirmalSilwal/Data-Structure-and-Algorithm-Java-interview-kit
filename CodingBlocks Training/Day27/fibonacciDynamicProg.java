package Lecture27;


public class fibonacciDynamicProg {

	// to demonstrate time taken by DP approach and without DP approach

	public static long STARTTIME;
	public static long ENDTIME;

	public static void startAlgo() {
		STARTTIME = System.currentTimeMillis();
	}

	public static long endAlgo() {
		ENDTIME = System.currentTimeMillis();
		return ENDTIME - STARTTIME;
	}

	public static void main(String[] args) {

		int nthItem = 45;

		startAlgo();
		System.out.println(fibonacciRecursiveOptimal(nthItem));
		System.out.println("time taken using DP approach in ms:" + endAlgo());

		System.out.println();
		
		startAlgo();
		System.out.println(fibonacciNonOptimal(nthItem)); 
		System.out.println("time taken without using DP approach in ms: " + endAlgo());
	}

	// time complexity: O(n)
	public static int fibonacciRecursiveOptimal(int n) {
		int[] memStorage = new int[n + 1];
		return fibonacciRecursiveOptimal(n, memStorage);
	}

	private static int fibonacciRecursiveOptimal(int n, int[] storage) {
		if (n == 0 || n == 1) {
			return n;
		}

		// accessing previously calculated factorial value of n
		if (storage[n] != 0) {
			return storage[n];
		}
		int fnm1 = fibonacciRecursiveOptimal(n - 1, storage);
		int fnm2 = fibonacciRecursiveOptimal(n - 2, storage);

		int fibbN = fnm1 + fnm2;

		storage[n] = fibbN;

		return fibbN;
	}

	// without using DP approach
	// time complexity: Exponential
	public static int fibonacciNonOptimal(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacciNonOptimal(n - 1);
		int fnm2 = fibonacciNonOptimal(n - 2);

		int fibbN = fnm1 + fnm2;

		return fibbN;
	}

}


/* output:
1134903170
time taken using DP approach in ms:0

1134903170
time taken without using DP approach in ms: 7393
*/