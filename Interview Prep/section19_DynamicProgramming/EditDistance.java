package section19_DynamicProgramming;

public class EditDistance {

	public static void main(String[] args) {

		String s1 = "agbg";
		String s2 = "acgb";

		System.out.println(editDistance(s1, s2)); // 2
	}

	// minimum changes required to make s2 equal to s1
	public static int editDistance(String s1, String s2) {

		if (s1.length() == 0)
			return s2.length();

		if (s2.length() == 0)
			return s1.length();

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int result = 0;

		if (s1.charAt(0) == s2.charAt(0)) {
			result = editDistance(ros1, ros2);
		} else {
			int removeFactor = 1 + editDistance(ros1, ros2);
			int addFactor = 1 + editDistance(ros1, s2);
			int replaceFactor = 1 + editDistance(s1, ros2);

			result = Math.min(removeFactor, Math.min(addFactor, replaceFactor));
		}

		return result;
	}
}
