package MustDoEasyList;

import java.util.HashMap;

public class RomanToInteger13 {

	public static int romanToInt(String s) {

		HashMap<String, Integer> map = new HashMap<>();
		initializeMap(map);

		int len = s.length();
		int idx = 0;
		int sum = 0;
		char ch1, ch2;
		// parse string
		while (idx < len) {
			ch1 = ' ';
			ch2 = ' ';

			ch1 = s.charAt(idx);

			if ((idx + 1) < len)
				ch2 = s.charAt(idx + 1);

			if (ch2 != ' ' && map.get("" + ch1) < map.get("" + ch2)) {
				// if first character is small than next char
				String currCombination = "" + ch1 + ch2;
				sum += map.get(currCombination);
				idx += 2; // two characters are combined so +2 in index

			} else {
				// considering only one Roman character
				sum += map.get("" + ch1);
				idx++;
			}
		}

		return sum;
	}

	private static void initializeMap(HashMap<String, Integer> map) {

		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		// special cases
		map.put("IV", 4);
		map.put("IX", 9);
		map.put("XL", 40);
		map.put("XC", 90);
		map.put("CD", 400);
		map.put("CM", 900);
	}

	// optimal approach
	public static int romanToInt2(String s) throws Exception {
		int ans = 0;
		int len = s.length();

		for (int i = 0; i < len - 1; i++) {

			int currValue = getRomanValue(s.charAt(i));
			int nextValue = getRomanValue(s.charAt(i + 1));

			if (currValue == -1 || nextValue == -1) {
				throw new Exception("Invalid character found...");
			}

			if (currValue < nextValue) {
				ans -= currValue;
			} else {
				ans += currValue;
			}
		}

		int lastCharValue = getRomanValue(s.charAt(len - 1));

		return ans + lastCharValue;
	}

	private static int getRomanValue(char next) {
		switch (next) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {
		// System.out.println(romanToInt("III"));
		// System.out.println(romanToInt("IV"));
		// System.out.println(romanToInt("IX"));
		// System.out.println(romanToInt("LVIII"));
		// System.out.println(romanToInt("MCMXCIV"));
		System.out.println(romanToInt2("MDCXCV"));

		System.out.println(romanToInt2("IV"));

		// System.out.println(getRomanValue('M'));

		/*
		 * testing character concatenation
		 * 
		 * System.out.println("" + 'c' + 'd');
		 */
	}
}
