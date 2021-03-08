package section17_Heap;

import java.util.ArrayList;
//import java.util.Collections;

public class Heap {

	ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {
		data.add(item);

		upheapify(data.size() - 1);
	}

	private void upheapify(int childIndex) {
		int parentIndex = (childIndex - 1) / 2;

		if (data.get(childIndex) < data.get(parentIndex)) {
			// Collections.swap(data, childIndex, parentIndex);
			this.swap(childIndex, parentIndex);
			upheapify(parentIndex);
		}
	}

	private void swap(int i, int j) {
		int ithVal = data.get(i);
		int jthVal = data.get(j);

		data.set(i, jthVal);
		data.set(j, ithVal);
	}

	public void display() {
		System.out.println(data);
	}

	public int size() {
		return this.data.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public int remove() throws Exception {
		if (this.size() == 0)
			throw new Exception("No elements to remove...");

		int removedItem = data.get(0);

		this.swap(0, this.size() - 1);
		data.remove(this.size() - 1);

		downheapify(0);

		return removedItem;
	}

	// clean code
	public void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int minIndex = pi;

		if (lci < this.size() && data.get(lci) < data.get(minIndex))
			minIndex = lci;

		if (rci < this.size() && data.get(rci) < data.get(minIndex))
			minIndex = rci;

		if (minIndex != pi) {
			swap(minIndex, pi);
			downheapify(minIndex);
		}
	}

	/*
	private void downheapify2(int parentIndex) {
		int leftChildIndex = (2 * parentIndex) + 1;
		int rightChildIndex = (2 * parentIndex) + 2;

		if (leftChildIndex >= this.size() && rightChildIndex >= this.size())
			return;

		int leftChild = -1, rightChild = -1;
		int parentData = data.get(parentIndex);

		if (leftChildIndex < this.size())
			leftChild = data.get(leftChildIndex);

		if (rightChildIndex < this.size())
			rightChild = data.get(rightChildIndex);

		if (leftChild == -1 && rightChild == -1)
			return;

		if (parentData > leftChild || parentData > rightChild) {

			if (rightChild == -1) {
				this.swap(parentIndex, leftChildIndex);
				downheapify2(leftChildIndex);

			} else {
				int minVal = Math.min(leftChild, rightChild);
				int minIndex = minVal == leftChild ? leftChildIndex : rightChildIndex;

				this.swap(parentIndex, minIndex);

				downheapify2(minIndex);
			}
		}
	}
*/
	
	public int get() {
		return this.data.get(0);
	}
}
