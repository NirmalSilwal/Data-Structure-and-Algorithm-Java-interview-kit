package Lecture1;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 1;
//		this is comment
//		if (a>=b && a>=c){
//			System.out.println(a+ " is largest :a");
//		}
//		else{
//			if (b>=a && b>=c){
//				System.out.println(b+" is largest :b");
//			}
//			else{
//				System.out.println(c+" is largest :c");
//			}
//		}
		
		
//		using else if
		if (a>=b && a>=c){
			System.out.println(a+ " is largest :a");
		}
		else if(b>=a && b>=c){
				System.out.println(b+" is largest :b");
				}
		else{
				System.out.println(c+" is largest :c");
			}
	}

}
