package LeetcodeBadge.ProgrammingSkills.Skills1.Day2;

public class SubtractProductSumDigitsInteger1281 {

	public static int subtractProductAndSum(int n) {

		int product = 1, sum = 0;

		while (n != 0) {
			int rem = n % 10;
			sum += rem;
			product *= rem;
			n = n / 10;
		}

		return product - sum;
	}

	public static void main(String[] args) {
		System.out.println(subtractProductAndSum(234));
		System.out.println(subtractProductAndSum(4421));
	}
}
