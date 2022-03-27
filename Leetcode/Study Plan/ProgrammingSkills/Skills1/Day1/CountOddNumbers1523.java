package LeetcodeBadge.ProgrammingSkills.Skills1.Day1;

public class CountOddNumbers1523 {

	// this will give TLE on input 10^9
	public static int countOdds(int low, int high) {

		int count = 0;

		for (int i = low; i <= high; i++) {

			if (i % 2 != 0)
				count++;
		}

		return count;
	}

	public static int countOdds2(int low, int high) {

		int count = (high - low) / 2;

		if (low % 2 != 0 || high % 2 != 0)
			count++;

		return count;
	}

	public static void main(String[] args) {
//		System.out.println(countOdds2(3, 7));
//		System.out.println(countOdds2(8, 10));
//		System.out.println(countOdds(0, 1000000000));
		System.out.println(countOdds2(0, 1000000000));

	}
}
