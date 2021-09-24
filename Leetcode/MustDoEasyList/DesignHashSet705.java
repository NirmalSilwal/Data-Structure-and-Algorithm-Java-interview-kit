package MustDoEasyList;

import java.util.LinkedList;

public class DesignHashSet705 {

	private int size;
	private LinkedList<Integer>[] bucketarray;
	private static final int DEFAULT_CAPACITY = 10;

	/** Initialize your data structure here. */
	public DesignHashSet705() {
		initbucket(DEFAULT_CAPACITY);
		size = 0;
	}

	private void initbucket(int N) {
		bucketarray = new LinkedList[N];
		for (int i = 0; i < bucketarray.length; i++) {
			bucketarray[i] = new LinkedList<Integer>();
		}
	}

	public void add(int key) {

		int bucketindex = hashFunction(key);
		int dataIndex = getDataWithinBucket(bucketindex, key);

		if (dataIndex == -1) {
			// key is not already in the bucket, so let's add it
			bucketarray[bucketindex].add(key);
			size++;
		}

		// rehashing
		double lambda = size * 1.0 / bucketarray.length;
		if (lambda > 2.0) // check threshold
			rehash();
	}

	private void rehash() {
		LinkedList<Integer>[] oldBucket = bucketarray;

		initbucket(oldBucket.length * 2);
		size = 0;

		for (int i = 0; i < oldBucket.length; i++) {
			for (Integer currentKey : oldBucket[i]) {
				add(currentKey);
			}
		}
	}

	private int getDataWithinBucket(int bucketindex, int key) {
		LinkedList<Integer> bucketLocation = bucketarray[bucketindex];
		int idx = 0;

		for (Integer mykey : bucketLocation) {
			if (mykey == key) {
				return idx;
			}
			idx++;
		}
		// if key is not found in that bucket list
		return -1;
	}

	private int hashFunction(Integer key) {
		/*
		 * you can't invoke hashCode() function in primitive data type like int
		 * so Integer is used in function parameter
		 */
		int bi = key.hashCode();
		return Math.abs(bi) % bucketarray.length;
	}

	public void remove(int key) {
		int bucketIndex = hashFunction(key);
		int dataIndex = getDataWithinBucket(bucketIndex, key);

		if (dataIndex == -1) {
			return; // if key was not in the bucket
		} else {
			bucketarray[bucketIndex].remove(dataIndex);
			size--;
		}
	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		int bucketIndex = hashFunction(key);
		int dataIndex = getDataWithinBucket(bucketIndex, key);

		if (dataIndex == -1)
			return false;
		else
			return true;
	}
}
