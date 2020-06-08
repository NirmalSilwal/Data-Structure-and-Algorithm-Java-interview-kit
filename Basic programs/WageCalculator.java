package BasicPractice;

public class WageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalWageBasic(7.5, 35));
		System.out.println(totalWageBasic(8.2, 47));
		System.out.println(totalWageBasic(10.0, 73));

		System.out.println("============ using correct function =============================");		
		System.out.println(totalWageDetailed(7.5, 35));
		System.out.println(totalWageDetailed(8.2, 47));
		System.out.println(totalWageDetailed(10.0, 73));

	}
	

	public static double totalWageBasic(double basePay, double hrs){
		double pay;
		if (basePay>8 && hrs<60){
			if (hrs>40){
				 pay = hrs * (1.5 * basePay);
				 return pay;
			}else{
				 pay = hrs * basePay;
				 return pay;
			}
		}else{
			return -1;
		}
	}
	
	
	public static double totalWageDetailed(double hrs, double basePay){

		if (basePay<8.0){
			System.out.println("You must be paid at least $8.0 per hour");
			return -1;
		}else if(hrs>60){
			System.out.println("You cannot work more than 60 hours per week");
			return -1;
		}else{
			double pay = 0.0;
			double overtimeHours = 0;
			if (hrs>40){
				overtimeHours = hrs - 40;
				hrs = 40;
			}
			pay = hrs * basePay;
			pay += hrs * 1.5 * overtimeHours;
			
			return pay;

		}
	}
	
	
}
