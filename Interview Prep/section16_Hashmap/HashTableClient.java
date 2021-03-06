package section16_Hashmap;

public class HashTableClient {

	public static void main(String[] args) throws Exception {

		HashTable<String, Integer> map = new HashTable<>(4);
		map.put("USA", 1000);
		map.put("Nepal", 50);
		map.put("India", 200);
		map.put("India", 300);
		
//		map.put("Canada", 600);
		map.display();

		System.out.println();
		map.put("Germany", 500);
		map.put("Nepal", 5000);
		map.put("Korea", 290);
//		System.out.println();
		map.display();

//		System.out.println();
//		System.out.println(map.get("Nepal"));
//		System.out.println(map.get("USA"));
//		System.out.println(map.get("Hongkong"));
//		map.display();
//
//		System.out.println();
//		System.out.println("removed: " + map.remove("India"));
//		System.out.println();
//		map.display();
//		System.out.println("removed: " + map.remove("Germany"));
//		System.out.println();
//		map.display();

	}

}
