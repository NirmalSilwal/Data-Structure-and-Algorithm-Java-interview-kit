package section15_InterfaceAndGenerics;

public class GenericsDemo {

	public static void main(String[] args) {

		Integer[] arrInteger = { 1, 2, 3, 4, 5 };
		display(arrInteger);

		String[] arrString = { "hello", "world", "DSA", "CB" };
		display(arrString);
	}
/*
	public static void display(int[] arr) {
		for (int val : arr)
			System.out.print(val + " ");

		System.out.println();
	}

	private static void display(String[] arr) {
		for (String val : arr)
			System.out.print(val + " ");

		System.out.println();
	}
*/
	// Generic display
	public static <T> void display(T[] arr) {
		for (T val : arr)
			System.out.print(val + " ");
		System.out.println();
	}
}
