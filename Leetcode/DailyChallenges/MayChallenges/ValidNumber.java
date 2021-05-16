package DailyChallenges.MayChallenges;

// LC#65 

public class ValidNumber {

	public static boolean isNumber(String s) {

		if (s.length() < 1)
			return false;

		boolean hasDigit = false, hasDot = false, hasE = false;
		int countSign = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			// see if it is valid character or not
			if (isValidCharacter(ch) == false)
				return false;

			// check digit
			if (ch >= '0' && ch <= '9')
				hasDigit = true;

			// check sign
			else if (ch == '+' || ch == '-') {
				// sign can be at max two
				if (countSign == 2)
					return false;

				// sign in between first and last character
				if (i > 0 && !(s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E')) {
					return false;
				}
				// sign can't be at last of String
				if (i == s.length() - 1)
					return false;

				countSign++;
			}

			// check dot
			else if (ch == '.') {
				// if dot and E/e was already there, can have only one dot
				if (hasDot || hasE)
					return false;

				// if dot is at last, and there was no digit before it
				if (i == s.length() - 1 && !hasDigit)
					return false;

				hasDot = true;
			}

			// check e/E
			else if (ch == 'e' || ch == 'E') {
				// can't have more than 1 e/E, must have digit before e/E
				if (hasE || !hasDigit)
					return false;

				// e/E can't be at last or at first
				if (i == s.length() - 1 || i == 0)
					return false;

				hasE = true;
			}

		}
		return true;
	}

	private static boolean isValidCharacter(char ch) {
		return ch >= 48 && ch <= 57 || ch == 'e' || ch == 'E' || ch == '.' || ch == '+' || ch == '-';
	}

	public static void main(String[] args) {
		String s = "005047e+6";
		System.out.println(isNumber(s)); // true
		System.out.println(isNumber("1e")); // false
	}
}
