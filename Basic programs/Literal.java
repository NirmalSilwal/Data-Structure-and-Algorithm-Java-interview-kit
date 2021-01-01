package practice;

public class Literal {

	public static void main(String[] args) {

		byte b1 = 10; // decimal
		byte b2 = 0b1010; // binary
		byte b3 = 012; // octal
		byte b4 = 0XA; // hexadecimal

		System.out.println(b1); // 10
		System.out.println(b2); // 10
		System.out.println(b3); // 10
		System.out.println(b4); // 10

		// long val = 999999999999; // The literal 999999999999 of type int is out of range
		long val = 999999999999L; 
		System.out.println(val); // 999999999999

		// for readability purpose we can use underscore to seperate large numbers
		long value = 999_999_999_999L;
		System.out.println(value); // 999999999999
		
//		float f = 12.42; // Type mismatch: cannot convert from double to float
		float f = 12.42f;
		double d = 12.53d;
		System.out.println(f);
		System.out.println(d);
	}

}
