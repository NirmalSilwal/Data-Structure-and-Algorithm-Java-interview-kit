package section16_Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("USA", 1000);
		map.put("Nepal", 50);
		map.put("India", 200);
		map.put("Germany", 500);

		System.out.println(map);

		System.out.println(map.get("USA"));
		System.out.println(map.get("Canada"));

		System.out.println(map.containsKey("USA"));
		System.out.println(map.containsKey("China"));

		System.out.println(map.remove("India"));
		System.out.println(map);

		System.out.println("\n------keys---------");
		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("\n------values---------");
		Collection<Integer> values = map.values();

		for (Integer val : values) {
			System.out.println(val);
		}

		System.out.println("\n------key, values - entrySet---------");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();

		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
