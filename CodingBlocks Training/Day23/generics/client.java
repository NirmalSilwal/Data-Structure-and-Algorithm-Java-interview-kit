package Lecture23.generics;

public class client {

	public static void main(String[] args) {

		genericPair<Integer> pair1 = new genericPair<Integer>();
		
		pair1.one = 1;
		pair1.two = 2;
		
//		pair1.one = "hello"; // Type mismatch: cannot convert from String to Integer
		
		
		Integer one = pair1.one;
		System.out.println(one); // 1
		
		GenericPair2D<Integer, String> pair2 = new GenericPair2D<Integer, String>();
		
		pair2.one = 1;
		pair2.two = "two, yay! I can hold string";
		
		String two = pair2.two;
		System.out.println(two);
		
		GenericPair2D<String, Integer> pair3 = new GenericPair2D<String, Integer>();

		pair3.one = "one, yay! I can also come first ";
		pair3.two = 2;
		
		System.out.println(pair3.one);
	}

}
