/*
		    *
		   **
		  ***
		 ****
		*****
*/
package Lecture3;

public class Pattern3 {
	
	public static void main(String[] args){
		
		int n = 5;
		int row = 1;
		int nst = 1;
		
		while (row <= n){
			int col = 1;
			
			while (col <= (n-row)){
				System.out.print(" ");
				col++;
			}
			
			int counter = 1;
			while (counter <= nst){
				System.out.print("*");
				counter++;
			}
			
			System.out.println();
			row++;
			nst = row;
		}
	}
}
