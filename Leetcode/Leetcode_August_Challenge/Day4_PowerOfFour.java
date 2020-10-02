package Leetcode_August_Challenge;
import java.util.Scanner;
public class Day4_PowerOfFour {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(isPowerOfFour(num));
		System.out.println(isPowerOfFour(5));
		System.out.println(isPowerOfFour_log(num));
		System.out.println(isPowerOfFour_log(5));
		System.out.println(isPowerOfFour2(num));
		System.out.println(isPowerOfFour2(5));
	}

	// approach 1- using loop
	public static boolean isPowerOfFour(int num) {
		if (num == 0) {
			return false;
		}
		while (num > 1) {
			if (num % 4 != 0) {
				return false;
			}
			num = num / 4;
		}
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}

	// approach 2- using log
	public static boolean isPowerOfFour_log(int num) {
		if (num == 0) {
			return false;
		}
		double logn = Math.log(num) / Math.log(4);
		// System.out.println(Math.floor(logn) + " "+ Math.ceil(logn));
		return Math.floor(logn) == Math.ceil(logn);
	}
	
	//approach 3
	static boolean isPowerOfFour2(int num) 
    { 
        int count = 0; 
          
        /*Check if there is  
        only one bit set in n*/
        int x = num & (num - 1); 
          
        if ( num > 0 && x == 0) 
        { 
            /* count 0 bits  
            before set bit */
            while(num > 1) 
            { 
                num >>= 1; 
                count += 1; 
            }  
          
            /*If count is even  
            then return true 
            else false*/
            return (count % 2 == 0) ? true : false; 
        } 
          
            /* If there are more than  
            1 bit set then n is not a 
            power of 4*/
        return false; 
    }  
}
