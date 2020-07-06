package Lecture2_1;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse: ");
		int num = sc.nextInt();
		int reverse = 0;
		
		while(num != 0){
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num /= 10;
		}
		System.out.println(reverse);
	}
}
