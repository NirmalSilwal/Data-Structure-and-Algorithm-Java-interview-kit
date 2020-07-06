package Lecture2_1;

import java.util.Scanner;

public class GCD {
	
	public static void main(String[] gcdArguments){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int divisor, dividend = 0;
		
		if (num1 < num2){
			divisor = num1;
			dividend = num2;
		}else{
			divisor = num2;
			dividend = num1;
		}
		
		while(dividend % divisor != 0){
			int remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		
		System.out.println("GCD of "+num1+ " and "+num2+ " is: "+divisor);
	}
}
