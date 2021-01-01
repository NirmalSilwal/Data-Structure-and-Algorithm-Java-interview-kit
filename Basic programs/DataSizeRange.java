package practice;

import java.lang.*;

public class DataSizeRange {

	public static void main(String... args) {

		System.out.println("Min range of int is: " + Integer.MIN_VALUE);
		System.out.println("Max range of int is: " + Integer.MAX_VALUE);
		System.out.println("size of int in Bytes is: " + Integer.BYTES);

		/*
		 * note: use below command in cmd prompt to see all classes 
		 * javap java.lang.Integer
		 * javap java.lang.Byte
		 * javap java.lang.Character
		 * javap java.lang.Short
		 * javap java.lang Float
		 */
		System.out.println();
		System.out.println("Min range of char is: " + (int) Character.MIN_VALUE);
		System.out.println("Max range of char is: " + (int) Character.MAX_VALUE);
		System.out.println("size of char in Bytes is: " + Character.BYTES);

		System.out.println();
		System.out.println("Min range of float is: " + Float.MIN_VALUE);
		System.out.println("Max range of float is: " + Float.MAX_VALUE);
		System.out.println("size of float in Bytes is: " + Float.BYTES);

		System.out.println();
		System.out.println("Min range of short is: " + Short.MIN_VALUE);
		System.out.println("Max range of short is: " + Short.MAX_VALUE);
		System.out.println("size of short in Bytes is: " + Short.BYTES);

		System.out.println();
		System.out.println("Min range of byte is: " + Byte.MIN_VALUE);
		System.out.println("Max range of byte is: " + Byte.MAX_VALUE);
		System.out.println("size of byte in Bytes is: " + Byte.BYTES);

	}
}


/* output:
Min range of int is: -2147483648
Max range of int is: 2147483647
size of int in Bytes is: 4

Min range of char is: 0
Max range of char is: 65535
size of char in Bytes is: 2

Min range of float is: 1.4E-45
Max range of float is: 3.4028235E38
size of float in Bytes is: 4

Min range of short is: -32768
Max range of short is: 32767
size of short in Bytes is: 2

Min range of byte is: -128
Max range of byte is: 127
size of byte in Bytes is: 1
*/