package Lecture4;

public class BinaryToDecimal {

	public static void main(String...args){
		
		int bin = 1010;
		int dec = 0;
		int twopowers = 1;
		
		while (bin != 0){
			int rem = bin % 10;
			dec = dec + rem * twopowers;
			twopowers *= 2;
			bin = bin / 10;
		}
		
		System.out.println(dec);
	}
}
