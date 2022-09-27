package kitestring;

import java.util.HashSet;
import java.util.Set;

public class UniqueDuplicates {

	public static void main(String[] args) {
		String str = "aabbcccdd";
		System.out.println(uniqueDups(str));
		System.out.println(uniqueDups("aabbbcccccd"));
		System.out.println(uniqueDups("abbcccddddeeeee"));

	}

	private static boolean uniqueDups(String str) {
		int[] chars = new int[26];
		
		for (char ch : str.toCharArray()) {
			int pos = ch - 'a';
			chars[pos]++;
		}
		Set<Integer> set = new HashSet<>();
		

		for (int n : chars) {
			if (n > 0) { // if character exist
				if (!set.contains(n))
					set.add(n);
				else
					return false;
			}
		}
		return true;
	}

}
