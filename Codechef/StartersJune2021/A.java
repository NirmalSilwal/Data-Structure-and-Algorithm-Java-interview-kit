package StartersJune2021;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int tt = 0; tt < t; tt++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
		
			if (((a + c) == 180) && ((b + d) == 180)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
