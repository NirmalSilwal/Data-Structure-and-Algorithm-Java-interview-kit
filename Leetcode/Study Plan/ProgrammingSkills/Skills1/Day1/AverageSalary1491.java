package LeetcodeBadge.ProgrammingSkills.Skills1.Day1;

public class AverageSalary1491 {

	public static double average(int[] salary) {

		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		double sum = 0;

		for (int dollar : salary) {

			sum += dollar;

			if (dollar > max)
				max = dollar;

			if (dollar < min)
				min = dollar;
		}

		sum -= max;
		sum -= min;

		double avg = sum / (salary.length - 2);

		return avg;
	}

	public static void main(String[] args) {

		System.out.println(average(new int[] { 4000, 3000, 1000, 2000 }));
		System.out.println(average(new int[] { 1000, 2000, 3000 }));

	}
}
