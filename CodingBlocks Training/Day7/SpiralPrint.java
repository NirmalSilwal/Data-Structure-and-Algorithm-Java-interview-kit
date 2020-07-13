/*
input:			11 12 13 14 
				21 22 23 24 
				31 32 33 34 
				41 42 43 44 
			
output:			11 12 13 14 24 34 44 43 42 41 31 21 22 23 33 32 
 */
package Lecture7;

public class SpiralPrint {

	public static void main(String[] args){
		
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 },
				{ 31, 32, 33, 34 }, { 41, 42, 43, 44 } };		
		
		display(arr);
		System.out.println();
		
		int top = 0, left = 0;
		int right = arr[top].length - 1;
		int bottom = arr.length - 1;
		int direction = 1;
		int count = (bottom + 1) * (right + 1);
		
		while (left <= right && top <= bottom){
			
			if (count > 0){
				if (direction == 1){
					for (int i = left; i <= right; i++){
						System.out.print(arr[top][i] + " ");
						count--;
					}
					top++;
					direction = 2;
				}
			}
			
			if (count > 0){
				if (direction == 2){
					for (int i = top; i <= bottom; i++){
						System.out.print(arr[i][right] + " ");
						count--;
					}
					direction = 3;
					right--;
				}
			}
			
			if (count > 0){
				if (direction == 3){
					for (int i = right; i >= left; i--){
						System.out.print(arr[bottom][i] + " ");
						count--;
					}
					direction = 4;
					bottom--;
				}
			}
			
			if (count > 0){
				if (direction == 4){
					for (int i = bottom; i >= top; i--){
						System.out.print(arr[i][left] + " ");
						count--;
					}
					direction = 1;
					left++;
				}
			}
		}
		
		
	}
	
	public static void display(int[][] arr){
		for (int row = 0; row < arr.length; row++){
			for (int col = 0; col < arr[row].length; col++){
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println();
		}
	}
}
