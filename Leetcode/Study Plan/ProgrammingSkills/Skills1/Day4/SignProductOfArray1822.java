package LeetcodeBadge.ProgrammingSkills.Skills1.Day4;

public class SignProductOfArray1822 {

	public static int arraySign(int[] nums) {

		double product = 1;
		for (int n : nums) {
			product *= n;
		}

		return signFunc(product);
	}

	private static int signFunc(double product) {
		if (product > 0)
			return 1;
		else if (product < 0)
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		System.out.println(arraySign(new int[] { -1, -2, -3, -4, 3, 2, 1 }));
		System.out.println(arraySign(new int[] { 1, 5, 0, 2, -3 }));
		System.out.println(arraySign(new int[] { -1, 1, -1, 1, -1 }));

		int[] failedcase = { 41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83,
				78, 82, 70, 15, -41 }; // due to data type selection, made to double later
		System.out.println(arraySign(failedcase));
	}
}
