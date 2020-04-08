
public class FunctionDemo {
	
	public static void main(String[] args) {

			helloFun();
			helloFun();
			simpleInterest();
	}
	
	public static void helloFun(){
		System.out.println("hello function");
	}
	
	public static void simpleInterest(){
		int principle = 1000;
		int time = 2;
		int rate = 4;
		int si = (principle * time * rate) / 100;
		System.out.println("simple interest is: "+si);
	}
}
