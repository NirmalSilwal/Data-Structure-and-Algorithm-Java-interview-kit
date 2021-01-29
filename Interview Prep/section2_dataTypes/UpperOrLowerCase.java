package section2_dataTypes;

import java.util.Scanner;

public class UpperOrLowerCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter character:");

		char ch = sc.next().charAt(0);

		int chValue = ch;
		
		if (chValue >= 65 && chValue <= 92)
			System.out.println("Upper case");
		else if (chValue >= 97 && chValue <= 122)
			System.out.println("Lower case");
		else
			System.out.println("some other character");

		sc.close();
	}

}
