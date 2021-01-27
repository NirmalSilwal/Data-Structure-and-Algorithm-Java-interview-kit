package section1_basic;

import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three age:");
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();

		if (age1 > age2) {
			System.out.println("If block executed");
		} else if (age1 > age3) {
			System.out.println("Else if block executed");
		} else {
			System.out.println("Else block is executed");
		}

		sc.close();
	}

}
