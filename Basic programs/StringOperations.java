package BasicPractice;

public class StringOperations {

	public static void main(String[] args) {

		String word = "Google";
		if (word == word.toLowerCase()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(Character.isUpperCase(word.charAt(0))); // true
		System.out.println(word.substring(1)); // oogle

		if (Character.isUpperCase(word.charAt(0))
				& word.substring(1).equals(word.substring(1).toLowerCase())) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(word.charAt(0) + " " + word.substring(1)); // G oogle
		System.out.println(word.substring(1).equals(
				word.substring(1).toLowerCase())); // true
	}
}
