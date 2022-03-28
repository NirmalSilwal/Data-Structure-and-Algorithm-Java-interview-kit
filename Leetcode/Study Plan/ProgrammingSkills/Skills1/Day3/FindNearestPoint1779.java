package LeetcodeBadge.ProgrammingSkills.Skills1.Day3;

public class FindNearestPoint1779 {

	public static int nearestValidPoint(int x, int y, int[][] points) {

		int nearestDistance = Integer.MAX_VALUE;
		int index = -1;

		for (int i = 0; i < points.length; i++) {

			int x2 = points[i][0];
			int y2 = points[i][1];

			boolean valid = isValid(x, y, x2, y2);

			if (valid) {
				int distance = Math.abs(x - x2) + Math.abs(y - y2);

				if (distance < nearestDistance) {
					nearestDistance = distance;
					index = i;
				}
			}

		}

		return index;
	}

	private static boolean isValid(int x, int y, int x2, int y2) {
		return x == x2 || y == y2;
	}

	public static void main(String[] args) {
		int[][] points = { { 1, 2 }, { 3, 1 }, { 2, 4 }, { 2, 3 }, { 4, 4 } };
		System.out.println(nearestValidPoint(3, 4, points));
	}
}
