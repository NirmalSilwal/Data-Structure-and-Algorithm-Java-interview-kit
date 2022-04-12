package LinkedList;

import java.util.LinkedList;

public class DesignHashSet705 {

	private int size;
	private LinkedList<Integer>[] bucketarray;
	private static final int DEFAULT_CAPACITY = 10;

	public DesignHashSet705() {
		initbucket(DEFAULT_CAPACITY);
		size = 0;
	}

	private void initbucket(int capacity) {
		bucketarray = new LinkedList[capacity];
		for (int i = 0; i < bucketarray.length; i++) {
			bucketarray[i] = new LinkedList<Integer>();
		}
	}

	public void add(int key) {
		int bucketlocation = hashFunction(key);
		int datalocation = getDataWithinBucket(bucketlocation, key);

		if (datalocation == -1) {
			// data was not present in bucket so let's add in hashset
			bucketarray[bucketlocation].add(key);
			size++;
		}

		double lambda = size * 1.0 / bucketarray.length;
		if (lambda > 0.75)
			rehash();
	}

	private int hashFunction(Integer key) {
		int index = key.hashCode();
		return Math.abs(index) % bucketarray.length;
	}

	private int getDataWithinBucket(int location, int key) {
		LinkedList<Integer> currentBucket = bucketarray[location];
		int index = 0;
		for (Integer data : currentBucket) {
			if (data == key)
				return index;
			index++;
		}
		return -1; // if not found
	}

	private void rehash() {
		LinkedList<Integer>[] oldbucket = bucketarray;
		initbucket(oldbucket.length * 2);
		size = 0;
		
		for (int i = 0; i < oldbucket.length; i++) {
			for (Integer value : oldbucket[i]) {
				add(value); // call add method of our hashset
			}
		}
	}

	public void remove(int key) {
		int bucketlocation = hashFunction(key);
		int datalocation = getDataWithinBucket(bucketlocation, key);

		if (datalocation == -1)
			return; // if no data found
		else {
			bucketarray[bucketlocation].remove(datalocation);
			size--;
		}
	}

	public boolean contains(int key) {
		int bucketlocation = hashFunction(key);
		int datalocation = getDataWithinBucket(bucketlocation, key);

		if (datalocation == -1)
			return false;
		else
			return true;
	}
}
