package Lecture1;

public class LoopsDemo {

	public static void main(String[] args) {

		int n = 5;
		System.out.println("Using for loop");
		
		for (int i=0;i<n; i++){
			System.out.println(i);
		}
		
		System.out.println("using while loop");
		int i = 0; 
		while(i<n){
			System.out.println(i);
			i += 1;
		}	
		
		System.out.println("using do while loop");
		int j = 0;
		do{
			System.out.println(j);
			j+=1;
		}while(j<n);
	}

}
