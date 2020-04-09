package Lecture1;

public class SumofNaturalNum {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		int n = 10;
		while (i<=n){
			sum += i;
			i++;
		}
		
		System.out.println("sum of first "+n+" natural numbers is: "+sum);
	}

}
