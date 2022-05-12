package RecursionSeries;

public class PrintNtimes {

	public static void main(String[] args) {
		printRecursive("nirmal", 10);
	}

	private static void printRecursive(String name, int count) {
		if (count == 0)
			return;

		count--;

		System.out.println(name);

		printRecursive(name, count);
	}
}
