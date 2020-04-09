package Lecture1;

public class EqualRemainder {

	public static void main(String[] args) {

		int A = 10;
		int B = 11;
		int M = 1;  //just setting default value
		int small = B;
		if (A<B)
		{
			small = A;
		}
		
		for (int i=2; i<=small; i++){
			if (A%i == B%i){
				M = i;
				break;
			}
		}
		
		System.out.println("M is: "+M);
	}

}
