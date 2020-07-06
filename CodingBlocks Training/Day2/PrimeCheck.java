package Lecture2_1;
import java.util.Scanner;

public class PrimeCheck {

	public static void main(String...myarguments){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check for Prime! ");
		int num = sc.nextInt();
		int divisor = 2;
		while (divisor <= num/2){
			if (num % divisor == 0){
				System.out.println("Not Prime");
				return;
			}
			
			divisor++;
		}
		System.out.println("Prime");
	}
}
