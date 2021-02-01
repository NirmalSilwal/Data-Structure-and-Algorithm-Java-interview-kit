package section4_2DArray;

public class SpiralWavePrint {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		display(arr);
		System.out.println();
		spiralPrint(arr);
	}

	public static void spiralPrint(int[][] arr) {
		int left = 0;
		int top = 0;
		int right = arr[top].length - 1;
		int bottom = arr.length - 1;
		int dir = 1;
		int count = (right + 1) * (bottom + 1);

		while (left <= right && top <= bottom) {

			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + " ");
						count--;
					}
					dir = 2;
					top++;
				}
			}

			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + " ");
						count--;
					}
					dir = 3;
					right--;
				}
			}

			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + " ");
						count--;
					}
					dir = 4;
					bottom--;
				}
			}

			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + " ");
						count--;
					}
					dir = 1;
					left++;
				}
			}
		}
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

11 12 13 14 
21 22 23 24 
31 32 33 34 
41 42 43 44 

11 12 13 14 24 34 44 43 42 41 31 21 22 23 33 32 
*/