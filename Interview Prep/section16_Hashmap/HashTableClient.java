package section16_Hashmap;

public class HashTableClient {

	public static void main(String[] args) throws Exception {

		HashTable<String, Integer> map = new HashTable<>(5);
		map.put("USA", 1000);
		map.put("Nepal", 50);
		map.put("India", 200);
		map.put("Germany", 500);
		map.put("Canda", 600);
		map.display();

		map.put("Nepal", 5000);
		System.out.println();
		map.display();
	}

}
