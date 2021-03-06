package section16_Hashmap;

public class HashTable<K, V> {

	private class HTPair {
		K key;
		V value;

		HTPair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public boolean equals(Object other) {
			HTPair otherPair = (HTPair) other;
			return this.key.equals(otherPair.key);
		}

		public String toString() {
			return "{" + this.key + "-" + this.value + "}";
		}
	}

	public static final int DEFAULT_CAPACITY = 10;

	private GenericLinkedList<HTPair>[] bucketArray;
	private int size;

	public HashTable() {
		this(DEFAULT_CAPACITY);
	}

	public HashTable(int capacity) {
		this.bucketArray = (GenericLinkedList<HTPair>[]) new GenericLinkedList[capacity];
		this.size = 0;
	}

	public void put(K key, V value) throws Exception {
		int baseIndex = hashFunction(key);

		GenericLinkedList<HTPair> bucket = this.bucketArray[baseIndex];
		HTPair pairToBeAdded = new HTPair(key, value);

		if (bucket == null) {
			bucket = new GenericLinkedList<>();
			bucket.addLast(pairToBeAdded);
			this.bucketArray[baseIndex] = bucket;
			this.size++;
		} else {
			int findAt = bucket.find(pairToBeAdded);
			if (findAt == -1) {
				bucket.addLast(pairToBeAdded);
				this.size++;
			} else {
				HTPair pair = bucket.getAt(findAt);
				pair.value = value;
			}
		}
	}

	public void display() {
		for (GenericLinkedList<HTPair> bucket : this.bucketArray) {
			if (bucket != null && !bucket.isEmpty()) {
				bucket.display();
			} else {
				System.out.println("NULL");
				// System.out.println("***********************************");
			}
		}
		System.out.println("----------------------------------------------");
	}

	private int hashFunction(K key) {
		int hashCode = key.hashCode();
		hashCode = Math.abs(hashCode);
		int hashIndex = hashCode % this.bucketArray.length;
		return hashIndex;
	}
}
