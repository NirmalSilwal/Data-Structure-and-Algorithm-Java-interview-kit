package Lecture1;

public class PrimeCheck {

	public static void main(String[] args) {
		
		int n = 5;
		String result = "";
		for (int i=2;i<=n/2;i++){
			if (n%i == 0){
				result = "not prime";
				break;
			}
			System.out.println(i);
			
		}
		if (result == "not prime"){
			System.out.println(n+" is not prime number");
		}else{
			System.out.println(n+" is prime number");
		}
	}
}
