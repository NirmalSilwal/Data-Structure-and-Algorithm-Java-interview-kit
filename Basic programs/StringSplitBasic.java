package BasicPractice;

public class StringSplitBasic {

	public static void main(String[] args) {

		String str = "abc";
		System.out.println(str.substring(0, 1)); // a
		System.out.println(str.substring(1)); // bc

		System.out.println();

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			String before = str.substring(0, i);
			String after = str.substring(i + 1);
			System.out.println("current: " + current);
			System.out.println("rest: " + before + after);
		}
	}
}
