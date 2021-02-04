package section6_Recursion;

public class PatternRecursive {

	public static void main(String[] args) {

		int n = 5;
		printPatternRec(n, 1, 1);
	}

	static void printPatternRec(int n, int row, int col) {
		if (row > n)
			return;
		if (col > row) {
			System.out.println();
			printPatternRec(n, row + 1, 1);
			return;
		}

		System.out.print("* ");
		printPatternRec(n, row, col + 1);
	}

}

/* output:

* 
* * 
* * * 
* * * * 
* * * * * 

 */