package easy;

public class MaximumPopulationYear1854 {

	public static int maximumPopulation(int[][] logs) {

		int[] population = new int[2051]; // 2051 is max constraints
		int maxYear = 0;

		for (int[] currentYr : logs) {
			population[currentYr[0]]++; // birth year, increase in population
			population[currentYr[1]]--; // death year, decrease in population
		}

		for (int year = 1950; year < 2050; year++) {
			// actual population of that year
			population[year] = population[year] + population[year - 1];

			if (population[year] > population[maxYear]) {
				maxYear = year;
			}
		}
		return maxYear;
	}

	public static void main(String[] args) {
		int[][] logs = { { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
		int[][] logs1 = { { 1993, 1999 }, { 2000, 2010 } };
		System.out.println(maximumPopulation(logs));
		System.out.println(maximumPopulation(logs1));
	}
}
