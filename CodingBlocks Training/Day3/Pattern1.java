/*
		*****
		*****
		*****
		*****
		*****
 */
package Lecture3;

public class Pattern1 {
	
	static public void main(String[] nirmal){
		
		int n = 5;
		int row = 1;
		int nst = n;  // number of stars
		
		while(row <= n){
			int col = 1;
			
			while(col <= nst){
				System.out.print("*");
				col++;
			}
			
			System.out.println();
			row++;
			nst = n;
		}
	}
}
