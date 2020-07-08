package Lecture4;

public class DecimalToBinary {

	public static void main(String[] args){
		
		int dec = 15;
		int bin = 0;
		int tenpowers = 1;
		
		while  (dec != 0 ){
			int rem = dec % 2;
			bin = bin + rem * tenpowers;
			dec /= 2;
			tenpowers = tenpowers * 10;
		}
		
		System.out.println(bin);
	}
}
