package StartersSept2021;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int tt = 0; tt < t; tt++) {

			int xsec = sc.nextInt();

			int position = xsec % 4;

			switch (position) {
			case 0:
				System.out.println("North");
				break;
			case 1:
				System.out.println("East");
				break;
			case 2:
				System.out.println("South");
				break;
			case 3:
				System.out.println("West");
				break;
			}
		}
		sc.close();
	}

}
