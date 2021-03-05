package section16_Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxFrequencyCharacter {

	public static void main(String[] args) throws Exception {

		String str = "aabbaaabcdda";
		System.out.println(getMaxFrequencyCharacter(str)); // a
	}

	static char getMaxFrequencyCharacter(String str) throws Exception {
		if (str.length() < 1)
			throw new Exception("Invalid String");

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			if (!map.containsKey(currentChar)) {
				map.put(currentChar, 1);
			} else {
				map.put(currentChar, map.get(currentChar) + 1);
			}
		}
//		System.out.println(map);
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();

		int maxFrequency = 0;
		char result = str.charAt(0);
		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > maxFrequency) {
				maxFrequency = entry.getValue();
				result = entry.getKey();
			}
		}

		return result;
	}
}
