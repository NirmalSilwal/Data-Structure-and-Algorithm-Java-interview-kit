package Lecture10;

public class MoveAllXAtEndRecursively {

	public static void main(String[] args) {

		String str = "axbdxxgfxxbcd";

		System.out.println(moveAllXatEnd(str));
	}

	public static String moveAllXatEnd(String str) {
		if (str.length() == 0) {
			return "";
		}

		char firstChar = str.charAt(0);
		String answer = "";

		String restAnswer = moveAllXatEnd(str.substring(1));

		if (firstChar == 'x') {
			answer = restAnswer + 'x';
		} else {
			answer = firstChar + restAnswer;
		}

		return answer;
	}
}
