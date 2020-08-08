package BasicPractice;

public class StringMatching {

	public static void main(String[] args) {

		String input = "abcdyesefg";
		String output = "yes";

		System.out.println(searchString(input, output)); // 4
		System.out.println(searchString(input, "yeb")); // -1
	}

	public static int searchString(String input, String output) {

		int inplen = input.length();
		int oplen = output.length();

		if (inplen == 0 | oplen == 0 | oplen > inplen) {
			return -1;
		}

		for (int index = 0; index < inplen - oplen; index++) {
			String possibleStr = input.substring(index, index + oplen);
			if (possibleStr.equals(output)) {
				return index;
			}
		}

		return -1;
	}
}
