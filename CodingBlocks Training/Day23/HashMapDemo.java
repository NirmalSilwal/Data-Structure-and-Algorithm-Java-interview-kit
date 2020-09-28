package Lecture23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Nepal", 100);
		map.put("USA", 200);
		map.put("India", 250);
		map.put("Denmark", 300);

		System.out.println(map);

		System.out.println(map.get("Nepal")); // 100

		System.out.println(map.remove("India")); // 250
		System.out.println(map);

		System.out.println(map.containsKey("China"));
		System.out.println(map.containsKey("USA"));

		System.out.println(map.remove("China")); // null

		map.put("Japan", 300);
		System.out.println(map);
		map.put("Japan", 500); // overwrites previous value
		System.out.println(map);

		System.out.println("\nall keys in hashmap:\n");

		Set<String> allkeys = map.keySet();

		for (String mykey : allkeys) {
			System.out.println(mykey);
		}

		System.out.println("\nall values in hashmap:\n");

		Collection<Integer> allvalues = map.values();
		for (Integer myvalue : allvalues) {
			System.out.println(myvalue);
		}

		System.out.println("\nall key and values in hashmap:\n");

		Set<Map.Entry<String, Integer>> allentries = map.entrySet();

		for (Map.Entry<String, Integer> myentry : allentries) {
			System.out.println(myentry.getKey() + " => " + myentry.getValue());
		}
	}

}

/*
 * output: {USA=200, Denmark=300, Nepal=100, India=250} 100 250 {USA=200,
 * Denmark=300, Nepal=100} false true null
 */