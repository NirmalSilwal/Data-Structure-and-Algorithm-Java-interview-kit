package GeeksForGeeks;

public class StringPoolDemo {

	public static void main(String[] args) {

		String s1 = "hello"; // string lateral
		String s2 = "hello"; // created in string pool
		String s3 = s1;
		String s4 = new String("hello"); // string object
		String s5 = new String("hello"); // hello object is created in heap, and
											// reference is stored in stack

		System.out.println(s1 == s2); // same reference in string pool
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);
		System.out.println(s4 == s5); // reference are different in heap

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s4.equals(s5)); // match the content of object

		// string are immutable
		String s6 = s1 + " pool"; // s1 remains unchanged and new reference is created
		System.out.println(s1);
		System.out.println(s6);
	}

}


/* output:
true
false
true
false
true
true
true
true
hello
hello pool
*/