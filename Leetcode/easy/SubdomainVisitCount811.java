package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input: 
["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]

Output: 
["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org",
"1 intel.mail.com","951 com"]
 */

public class SubdomainVisitCount811 {

	public static List<String> subdomainVisits(String[] cpdomains) {

		List<String> list = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<>();

		for (String domain : cpdomains) {

			int count = Integer.parseInt(domain.split(" ")[0]);

			String full = domain.split(" ")[1];
			map = insertMe(map, full, count);

			String[] subdomain = domain.split("[.]", 2);
			String sub1 = subdomain[1];
			map = insertMe(map, sub1, count);

			if (sub1.contains(".")) {
				String[] ans2 = sub1.split("[.]");
				map = insertMe(map, ans2[1], count);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			String ansStr = value + " " + key;
			list.add(ansStr);
		}

		return list;
	}

	private static HashMap<String, Integer> insertMe(HashMap<String, Integer> map, String s, int count) {
		if (!map.containsKey(s)) {
			map.put(s, count);
		} else {
			map.put(s, map.get(s) + count);
		}
		return map;
	}

	public static void main(String[] args) {

		String[] s = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		// String[] s = {"9001 discuss.leetcode.com"};
		List<String> ans = subdomainVisits(s);

		System.out.println(ans);
	}
}

/* output:
[951 com, 900 google.mail.com, 1 intel.mail.com, 5 org, 5 wiki.org, 901 mail.com, 50 yahoo.com]
*/