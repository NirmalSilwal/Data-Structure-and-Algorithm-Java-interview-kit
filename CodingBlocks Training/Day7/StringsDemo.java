package Lecture7;

public class StringsDemo {

	public static void main(String[] args) {

		String str = "Hello";
		System.out.println(str); // Hello

		System.out.println(str.charAt(0)); // H
		System.out.println(str.charAt(1)); // e

		System.out.println(str.length()); // 5
		System.out.println(str.charAt(str.length() - 1)); // o

		System.out.println(str.substring(2)); // llo
		System.out.println(str.substring(1, 3)); // el
		System.out.println(str.substring(2, 2)); // blank space
		System.out.println("i am executed");

		System.out.println(str.startsWith("Hel")); // true
		System.out.println(str.startsWith("hel")); // false
		System.out.println(str.startsWith("HE")); // false

		String s1 = "hello";
		String s2 = "hello";
		String s3 = s1;
		String s4 = new String("hello");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // true
		System.out.println(s2 == s3); // true
		System.out.println(s1 == s4); // false

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true

		/*
		 * == checks for the address, here s1, s2, s3 are pointing to same
		 * address in string pool. s4 is created outside of string pool
		 * 
		 * .equals() checks for the content
		 */
	}
}
