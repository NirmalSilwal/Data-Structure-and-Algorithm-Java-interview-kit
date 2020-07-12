package Lecture7;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		int[][] arr;
		// System.out.println(arr); // The local variable arr may not have been
		// initialized

		arr = new int[2][3];
		System.out.println(arr); // output: prints 2D address of arr

		System.out.println(arr[0]); // address 1D address
		System.out.println(arr[0][0]); // 0
		System.out.println(arr.length); // 2
		System.out.println();

		display(arr);
		System.out.println();
		arr[1][2] = 100;
		display(arr);

		System.out.println();
		arr = new int[4][];
		System.out.println(arr[0]); // null
		// System.out.println(arr[0][1]); // NullPointerException

		System.out.println(arr.length); // 4
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[5];
		display(arr);
		System.out.println(arr);
		System.out.println(arr[1]);

	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
