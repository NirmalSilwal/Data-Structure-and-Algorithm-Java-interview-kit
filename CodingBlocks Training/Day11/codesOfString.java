package Lecture11;

public class codesOfString {

	public static void main(String[] args) {

		String inputStr = "1234";
		printCodesOfString(inputStr, "");
	}

	public static void printCodesOfString(String str, String result) {
		if (str.equals("")) {
			System.out.println(result);
			return;
		}

		String firstChar = str.substring(0, 1);
		String restStr = str.substring(1);

		char code1 = getCode(firstChar);

		printCodesOfString(restStr, result + code1);

		if (str.length() > 2) {
			String twoChar = str.substring(0, 2);
			String restStr2 = str.substring(2);

			if (Integer.valueOf(twoChar) < 27) {
				char code2 = getCode(twoChar);
				printCodesOfString(restStr2, result + code2);
			}
		}
	}

	public static char getCode(String firstChar) {
		int charValue = Integer.valueOf(firstChar);
		int ascii = 96 + charValue;
		return (char) ascii;
	}
}
