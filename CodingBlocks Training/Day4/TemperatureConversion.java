package Lecture4;

public class TemperatureConversion {
	
	public static void main(String[] args){
		
		// Farenheit to Celsius
		
		int min = 0;
		int max = 300;
		int step = 20;
		
		while (min <= max){
//			int celsius = (5/9) * (min - 32);	// this is bug/ incorrect due to data type and division
//			int celsius = (5.0/9) * (min - 32);	// Type mismatch: cannot convert from double to int
			
			int celsius = (int)((5.0/9) * (min - 32));
			
			System.out.println(min +"\t"+ celsius);
			min += step;	
		}
		//		System.out.println(5.0/9);	// output: 0.5555555555555556

	}
}
