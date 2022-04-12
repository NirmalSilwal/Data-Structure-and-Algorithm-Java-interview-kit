package LinkedList;

import java.util.LinkedList;

public class DesignHashMap706 {

	private class HTPair {
		int key;
		int value;

		HTPair(int k, int v) {
			this.key = k;
			this.value = v;
		}
	}

	private int size;
	private static final int DEFAULT_CAPACITY = 16;
	private LinkedList<HTPair>[] bucketarray;

	public DesignHashMap706() {
		initbucket(DEFAULT_CAPACITY);
		size = 0;
	}

	private void initbucket(int capacity) {
		bucketarray = new LinkedList[capacity];
		for (int i = 0; i < bucketarray.length; i++) {
			bucketarray[i] = new LinkedList<HTPair>();
		}
	}

	public void put(int key, int value) {
		int bucketindex = hashFunction(key);
		int datalocation = getDataWithinBucket(bucketindex, key);

		if (datalocation == -1) {
			// if key was not found in the hashmap already
			HTPair pairToBeAdded = new HTPair(key, value);

			bucketarray[bucketindex].add(pairToBeAdded);
			size++;
		} else {
			HTPair ans = bucketarray[bucketindex].get(datalocation);
			ans.value = value; // update the value if key exists already
		}

		// rehasing
		double lambda = size * 1.0 / bucketarray.length;
		if (lambda > 0.75)
			rehash();
	}

	private void rehash() {
		LinkedList<HTPair>[] oldbucket = bucketarray;
		initbucket(oldbucket.length * 2);
		size = 0;

		for (int bi = 0; bi < bucketarray.length; bi++) {

			for (HTPair pairs : oldbucket[bi]) {
				put(pairs.key, pairs.value);
			}
		}
	}

	private int hashFunction(Integer key) {
		int code = key.hashCode();
		return Math.abs(code) % bucketarray.length;
	}

	private int getDataWithinBucket(int bi, int key) {
		int id = 0;
		LinkedList<HTPair> mylist = bucketarray[bi];
		for (HTPair pairs : mylist) {
			if (pairs.key == key)
				return id;
			id++;

		}
		return -1;
	}

	public int get(int key) {
		int bucketindex = hashFunction(key);
		int datalocation = getDataWithinBucket(bucketindex, key);

		if (datalocation == -1)
			return -1;
		else {
			return bucketarray[bucketindex].get(datalocation).value;
		}
	}

	public void remove(int key) {
		int bucketindex = hashFunction(key);
		int datalocation = getDataWithinBucket(bucketindex, key);

		if (datalocation != -1) {
			bucketarray[bucketindex].remove(datalocation);
			size--;
		}
	}
}
