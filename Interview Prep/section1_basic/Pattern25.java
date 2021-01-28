package section1_basic;

public class Pattern25 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;
		int space = n - 1;
		int star = 1;
		int runningVal = 1;

		while (row <= n) {

			int count = 1;
			while (count <= space) {
				System.out.print("\t");
				count++;
			}

			count = 1;
			while (count <= star) {
				System.out.print(runningVal + "\t");
				runningVal++;
				count++;
			}

			space--;
			star = star + 2;

			row++;
			System.out.println();
		}
	}

}


/* output: 

				1	
			2	3	4	
		5	6	7	8	9	
	10	11	12	13	14	15	16	
17	18	19	20	21	22	23	24	25	

*/