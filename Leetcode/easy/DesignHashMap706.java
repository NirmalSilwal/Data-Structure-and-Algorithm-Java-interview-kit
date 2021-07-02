package easy;

import java.util.LinkedList;

public class DesignHashMap706 {

	private class HTPair {
		int key;
		int value;

		HTPair(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	private LinkedList<HTPair>[] bucketarray;

	/** Initialize your data structure here. */
	public DesignHashMap706() {
		initBucket(DEFAULT_CAPACITY);
		size = 0;
	}

	private void initBucket(int N) {
		bucketarray = new LinkedList[N];
		for (int bi = 0; bi < bucketarray.length; bi++) {
			bucketarray[bi] = new LinkedList<HTPair>();
		}
	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		int bucketIndex = hashFunction(key);
		int dataIndex = getDataWithinBucket(key, bucketIndex);

		if (dataIndex == -1) {
			// no index found
			HTPair newPair = new HTPair(key, value);
			bucketarray[bucketIndex].add(newPair);
			size++;
		} else {
			LinkedList<HTPair> bucketLocation = bucketarray[bucketIndex];
			bucketLocation.get(dataIndex).value = value;
		}

		// rehasing threshold
		double lambda = size * 1.0 / bucketarray.length;
		if (lambda > 2.0) {
			rehash();
		}
	}

	private void rehash() {
		LinkedList<HTPair>[] oldbucket = bucketarray;
		initBucket(oldbucket.length * 2);
		size = 0;
		for (int bi = 0; bi < oldbucket.length; bi++) {
			for (HTPair pairs : oldbucket[bi]) {
				put(pairs.key, pairs.value);
			}
		}
	}

	private int hashFunction(Integer key) {
		int hashCode = key.hashCode();
		return Math.abs(hashCode) % bucketarray.length;
	}

	private int getDataWithinBucket(int keys, int bi) {
		int id = 0;
		for (HTPair pairs : bucketarray[bi]) {
			if (pairs.key == keys) // == here because we used int as key,value
				return id;
			id++;
		}
		return -1;
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {
		int bucketIndex = hashFunction(key);
		int dataIndex = getDataWithinBucket(key, bucketIndex);

		if (dataIndex == -1) {
			return dataIndex; // no index found
		} else {
			LinkedList<HTPair> bucketLocation = bucketarray[bucketIndex];
			return bucketLocation.get(dataIndex).value;
		}
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a
	 * mapping for the key
	 */
	public void remove(int key) {
		int bucketIndex = hashFunction(key);
		int dataIndex = getDataWithinBucket(key, bucketIndex);

		if (dataIndex == -1) {
			return;
		} else {
			LinkedList<HTPair> bucketLocation = bucketarray[bucketIndex];
			bucketLocation.remove(dataIndex);
			size--;
		}
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * 
 * MyHashMap obj = new MyHashMap();
 * 
 * obj.put(key,value);
 * 
 * int param_2 = obj.get(key);
 * 
 * obj.remove(key);
 */