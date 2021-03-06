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
			int foundIndex = bucket.find(pairToBeAdded);
			if (foundIndex == -1) {
				bucket.addLast(pairToBeAdded);
				this.size++;
			} else {
				HTPair pair = bucket.getAt(foundIndex);
				pair.value = value;
			}
		}

		// to make it constant time operation

		double lambda = (this.size * 1.0) / this.bucketArray.length;
		if (lambda > 0.75) {
			this.rehash();
		}
	}

	private void rehash() throws Exception {
		GenericLinkedList<HTPair>[] oldBucketArray = this.bucketArray;
		this.bucketArray = (GenericLinkedList<HTPair>[]) new GenericLinkedList[this.bucketArray.length * 2];
		this.size = 0;

		for (GenericLinkedList<HTPair> pair : oldBucketArray) {
			while (pair != null && !pair.isEmpty()) {
				HTPair currentPair = pair.removeFirst();
				this.put(currentPair.key, currentPair.value);
			}
		}

	}

	// O(1) Time
	private int hashFunction(K key) {
		int hashCode = key.hashCode();
		hashCode = Math.abs(hashCode);
		int hashIndex = hashCode % this.bucketArray.length;
		return hashIndex;
	}

	public V get(K key) throws Exception {
		int hashIndex = hashFunction(key);
		GenericLinkedList<HTPair> bucket = this.bucketArray[hashIndex];
		HTPair pairToFind = new HTPair(key, null);

		if (bucket == null) {
			return null;
		} else {
			int foundIndex = bucket.find(pairToFind);
			if (foundIndex == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(foundIndex);
				return pair.value;
			}
		}
	}

	public V remove(K key) throws Exception {
		int hashIndex = hashFunction(key);
		GenericLinkedList<HTPair> bucket = this.bucketArray[hashIndex];
		HTPair pairToRemove = new HTPair(key, null);

		if (bucket == null) {
			return null;
		} else {
			int foundIndex = bucket.find(pairToRemove);
			if (foundIndex == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(foundIndex);
				bucket.removeAt(foundIndex);
				this.size--;
				return pair.value;
			}
		}
	}

	public void display() {
		for (GenericLinkedList<HTPair> bucket : this.bucketArray) {
			if (bucket != null && !bucket.isEmpty()) {
				bucket.display();
			} else {
				System.out.println("NULL");
			}
		}
		System.out.println("----------------------------------------------");
	}

}
