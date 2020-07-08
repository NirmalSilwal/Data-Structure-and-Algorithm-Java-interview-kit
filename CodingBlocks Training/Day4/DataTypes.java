package Lecture4;

public class DataTypes {

	public static void main(String...args){
		
		byte b = 10;	// 1 byte
		short sh = 10;	// 2 byte
		int in = 10;	// 4 byte
		long ln = 10;	// 8 byte
		
		
								// Part 1
		
//		b = sh;		// Type mismatch: cannot convert from short to byte
//		b = in;		// Type mismatch: cannot convert from int to byte
//		b = ln;		// Type mismatch: cannot convert from long to byte
		
//		sh = b;
//		sh = sh;	// The assignment to variable sh has no effect
//		sh = in;	// Type mismatch: cannot convert from int to short
//		sh = ln;	// Type mismatch: cannot convert from long to short
		
//		in = b;		// Allowed
//		in = sh;	// Allowed
//		in = ln;	// Type mismatch: cannot convert from long to int
		
//		ln = b;		// Allowed
//		ln = sh;	// Allowed
//		ln = in;	// Allowed
		
		
									// Part 2
		
		b = 10; // implicit conversion of data type from int to byte
				// since it is in range of byte data type i.e -128 to 127
				// this is no issue
		
//		b = 128;	// Type mismatch: cannot convert from int to byte
					// this is not possible because it is out of byte range
		
		b = (byte)128; // Explicit type conversion
						// BUT... due to internal representation of data in byte, as it has
						// only 1 byte of space reserved, while storing 128, this is converted
						// into 2's compliment for storage purpose by computer in memory. Hence,
						// it lost its original value.
		
		System.out.println(b);	// outputs -128, which is not correct, as you did explicit type casting
								// which was not allowed for  128 using byte data type
		
		b = -128;
		System.out.println(b);	// output: -128
								// as -128 is in range of byte data type, this is valid 
								// unlike above 128 which was out of range
		
//		b = 256;
		b = (byte)256;
		System.out.println(b);	// output: 0, which is not correct, it is out of byte range,so starting 
								// 24 bits are chunked out, thus remaining 8 bits was 00000000 which is 0 in decimal
		
		
										
										// Part 3
		
		float f = 3;
		System.out.println(f);	// output: 3.0
		
//		float fl = 3.5;		// Type mismatch: cannot convert from double to float
							// by default it is double
		
		float fl = 3.5f;
		System.out.println(fl);		// output: 3.5
		
		double db = 3.5;
		System.out.println(db);		// output: 3.5
		
		in = (int)5.5;
		System.out.println(in);		// output: 5
		
		
		
								// Part 4

		long l = 1000000000;
		in = 1000000000;
//		in = 10000000000;	// The literal 10000000000 of type int is out of range 
		in = (int)10000000000l;
		System.out.println(in);	// output: 1410065408, which is not correct as you did 
								// unallowed operation using explicit type conversion
		
		
		
							// Part 5
		
		boolean bl = false;
		bl = true;
		System.out.println(bl);
		
//		bl = 0;		// Type mismatch: cannot convert from int to boolean
		
		if (bl){
			System.out.println("Hello");
		}else{
			System.out.println("Bye");
		}
		
				// output: Hello
		
		
	}
}
