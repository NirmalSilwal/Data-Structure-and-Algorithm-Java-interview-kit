package practice;

import java.util.*;
import java.lang.*;

public class KeyboardInput {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// taking binary input
		sc.useRadix(2);

		System.out.print("enter num in binary: ");
		int num = sc.nextInt();

		System.out.println(num);

		sc.close();
	}
}


/* output:
enter num in binary: 1010
10
*/