package Leetcode_August_Challenge;

/*
 QUESTION DETAILS:
 =================
 Given a word, you need to judge whether the usage of capitals in it is right or not.

 We define the usage of capitals in a word to be right when one of the following cases holds:

 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital, like "Google".
 Otherwise, we define that this word doesn't use capitals in a right way.

 Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

 */

public class Day1_detectCapital {

	public static void main(String[] args) {

		System.out.println(detectCapitalUse("USA")); // true
		System.out.println(detectCapitalUse("leetcode"));// true
		System.out.println(detectCapitalUse("Google")); // true
		System.out.println(detectCapitalUse("FlaG"));// false

	}

	public static boolean detectCapitalUse(String word) {
		if (word.equals(word.toUpperCase())) {
			return true;
		} else if (word.equals(word.toLowerCase())) {
			return true;
		} else if (Character.isUpperCase(word.charAt(0))
				& word.substring(1).equals(word.substring(1).toLowerCase())) {
			return true;
		} else {
			return false;
		}
	}
}
