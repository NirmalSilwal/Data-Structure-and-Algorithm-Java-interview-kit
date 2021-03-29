package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {

		System.out.println("HashMap demo\n");
		HashMap<Integer, String> map = new HashMap<>();

		map.put(5, "testing");
		map.put(1, "nirmal");
		map.put(2, "rabindra");
		map.put(3, "om");
		System.out.println(map.entrySet());

		System.out.println("size: " + map.size());

		System.out.println(map);

		System.out.println(map.containsKey(2));

		System.out.println(map.containsValue("OM"));
		System.out.println(map.containsValue("om"));

		System.out.println(map.keySet());

		System.out.println(map.values());

		System.out.println(map.remove(3));
		System.out.println(map);

		System.out.println("\nLinkedHashMap demo\n");

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(1, "nirmal");
		lmap.put(2, "rabindra");
		lmap.put(3, "om");

		System.out.println(lmap);
		System.out.println(lmap.entrySet());

		System.out.println(lmap.keySet());
		System.out.println(lmap.values());

		System.out.println("\nTreeMap demo\n");

		TreeMap<String, String> tmap = new TreeMap<>();

		tmap.put("aab", "Hello");
		tmap.put("aaa", "First expected");
		tmap.put("aad", "last expected");

		System.out.println(tmap);
		System.out.println(tmap.entrySet());

		System.out.println(tmap.lastEntry());

		System.out.println(tmap.ceilingKey("aab"));
		System.out.println(tmap.ceilingKey("aar"));

		// System.out.println(tmap.pollFirstEntry());

		System.out.println(tmap);

		System.out.println(tmap.subMap("aaa", false, "aar", false));

		System.out.println(tmap.tailMap("aab", false));
	}

}
