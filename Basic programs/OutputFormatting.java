import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
				
                //Complete this line
                
				// String s1new = String.format("%1$-" + 15 + "s", s1);
                // System.out.printf(s1new + "%03d\n", x);
				// in simple way
				
                System.out.printf("%-15s%03d %n",s1,x);
            }
            System.out.println("================================");

    }
}

/*
Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
*/