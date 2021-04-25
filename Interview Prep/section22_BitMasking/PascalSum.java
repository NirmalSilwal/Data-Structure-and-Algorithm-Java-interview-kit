package section22_BitMasking;

public class PascalSum {

	public static void main(String[] args) {
		int rowNo = 6;
		System.out.println("sum of pascal traingle: " + pascalTriangleSum(rowNo));
	}

	public static int pascalTriangleSum(int totalRows) {

		int sumNthRow = 1 << (totalRows - 1);
		System.out.println("sum of " + totalRows + "th row is: " + sumNthRow);

		int ans = 1 << totalRows;

		return ans - 1;
	}
}

/* output:
sum of 6th row is: 32
sum of pascal traingle: 63
*/