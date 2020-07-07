/*
			* * * * * 
			    * * * * 
			        * * * 
			            * * 
			                * 
			            * * 
			        * * * 
			    * * * * 
			* * * * *
 */

package Lecture3;

public class Pattern6 {
	
	public static void main(String[] args){
		
		int n = 5;
		int row = 1;
		int nst = n;
		int spaces = 0;
		
		while (row <= (2*n - 1)){
			int counter = 1;
			
			while (counter <= spaces){
				System.out.print("  ");
				counter++;
			}
			
			int col = 1;
			while (col <= nst){
				System.out.print("* ");
				col++;
			}
		
			if (row < n){
				nst--;
				spaces += 2;
			}else{
				nst++;
				spaces -= 2;
			}
			
			System.out.println();
			row++;
		}
	}
}
