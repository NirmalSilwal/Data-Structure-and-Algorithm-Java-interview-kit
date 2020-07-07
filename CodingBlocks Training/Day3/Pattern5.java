/*
		 * * * * * 
		     * * * * 
		         * * * 
		             * * 
		                 * 
 */

package Lecture3;

public class Pattern5 {

		public static void main(String[] args){
			
			int n = 5;
			int row = 1;
			int nst = 5;
			int spaces = 0;
			
			while (row <= n){
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
				
				System.out.println();
				row++;
				nst--;
				spaces += 2;
			}
		}
}
