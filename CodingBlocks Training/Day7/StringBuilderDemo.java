package Lecture7;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb); // hello

		// sb.append('y')

		sb.setCharAt(2, 'i');
		System.out.println(sb); // heilo

		System.out.println(sb.length()); // 5

		System.out.println(sb.charAt(2)); // i

		// sb = "hello2"; // Type mismatch: cannot convert from String to
		// StringBuilder

		System.out.println("\nreversing string\n");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}
}
