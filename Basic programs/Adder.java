import java.io.*;
import java.util.*;

public class Adder {

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
	}

}
