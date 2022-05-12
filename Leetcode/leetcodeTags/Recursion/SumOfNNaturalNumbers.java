package RecursionSeries;

public class SumOfNNaturalNumbers {

	public static int sumRecursive(int n) {
		if (n == 1)
			return n;
		
		int sum = n + sumRecursive(n - 1);
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumRecursive(5));
	}
}
