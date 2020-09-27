package Lecture23;

import java.util.HashMap;

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
	}

}

/* output:
{USA=200, Denmark=300, Nepal=100, India=250}
100
250
{USA=200, Denmark=300, Nepal=100}
false
true
null
*/