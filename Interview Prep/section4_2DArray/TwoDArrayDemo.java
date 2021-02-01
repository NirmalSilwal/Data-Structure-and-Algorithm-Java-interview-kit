package section4_2DArray;

public class TwoDArrayDemo {

	public static void main(String[] args) {

		int[][] arr;
		// System.out.println(arr); // The local variable arr may not have been
		// initialized

		arr = new int[3][3];
		display(arr);
		System.out.println("----------------------");

		// int[][] arr2 = new int[][3]; // Cannot specify an array dimension
		// after an empty dimension
		int[][] arr2 = new int[3][];

		System.out.println(arr2);
		// display(arr2); // java.lang.NullPointerException

		System.out.println("----------------------");

		arr2[0] = new int[3];
		arr2[1] = new int[5];
		arr2[2] = new int[2];
		display(arr2);

		System.out.println("----------------------");

		// setting values
		arr2[0][1] = 10;
		arr2[1][4] = 20;
		display(arr2);

		// accessing value
		System.out.println(arr2[0][1]);
		System.out.println(arr2[1][4]);

		System.out.println("----------------------");

		int[][] arr3 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
		display(arr3);
	}

	static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}


/* output:

0 0 0 
0 0 0 
0 0 0 
----------------------
[[I@1db9742
----------------------
0 0 0 
0 0 0 0 0 
0 0 
----------------------
0 10 0 
0 0 0 0 20 
0 0 
10
20
----------------------
1 2 3 
4 5 
6 7 8 9 
*/