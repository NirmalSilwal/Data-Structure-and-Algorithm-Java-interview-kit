package Lecture12;

public class TowerOfHanoi {

	public static void main(String[] main) {

		int N = 3;
		TOH(N, "SOURCE", "DESTINATION", "HELPER");
	}

	public static void TOH(int n, String source, String destination,
			String helper) {

		if (n == 0) {
			return;
		}
		TOH(n - 1, source, helper, destination);

		System.out.println("Move " + n + " th disk from " + source + " to "
				+ destination);

		TOH(n - 1, helper, destination, source);
	}
}

/*
output:
Move 1 th disk from SOURCE to DESTINATION
Move 2 th disk from SOURCE to HELPER
Move 1 th disk from DESTINATION to HELPER
Move 3 th disk from SOURCE to DESTINATION
Move 1 th disk from HELPER to SOURCE
Move 2 th disk from HELPER to DESTINATION
Move 1 th disk from SOURCE to DESTINATION
*/