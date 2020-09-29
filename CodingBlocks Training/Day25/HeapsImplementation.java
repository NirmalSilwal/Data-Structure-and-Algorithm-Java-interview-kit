package Lecture25;

import java.util.ArrayList;

public class HeapsImplementation<T extends Comparable<T>> {

	private ArrayList<T> data;
	boolean isMin;

	HeapsImplementation(boolean isMin) {
		this.data = new ArrayList<T>();
		this.isMin = isMin;
	}

	// O(1) time
	public int size() {
		return this.data.size();
	}

	// O(1) time
	public T getMaxPriority() {
		T value = this.data.get(0);
		return value;
	}

	// O(logN) time
	public void add(T element) {
		this.data.add(element);
		this.upheapify(this.data.size() - 1);
	}

	private void upheapify(int childIndex) {
		if (childIndex == 0) {
			return;
		}
		int parentIndex = (childIndex - 1) / 2;

		if (!isLarger(parentIndex, childIndex)) {
			this.swap(parentIndex, childIndex);
			this.upheapify(parentIndex);
		}
	}

	private boolean isLarger(int pi, int ci) {
		T parentValue = this.data.get(pi);
		T childValue = this.data.get(ci);

		if (this.isMin) {
			return parentValue.compareTo(childValue) < 0;
		} else {
			return parentValue.compareTo(childValue) > 0;
		}
	}

	public void swap(int parentIndex, int childIndex) {
		T parentValue = this.data.get(parentIndex);
		T childValue = this.data.get(childIndex);

		this.data.set(parentIndex, childValue);
		this.data.set(childIndex, parentValue);
	}

	public void display() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Heap is emtpy!");
		}
		this.display(0);
	}

	private void display(int parentIndex) {
		int leftchildIndex = (2 * parentIndex) + 1;
		int rightchildIndex = (2 * parentIndex) + 2;

		String result = "";

		if (leftchildIndex < this.data.size()) {
			T lvalue = this.data.get(leftchildIndex);
			result = result + lvalue + "=>";
		} else {
			result = "END=>" + result;
		}

		result = result + this.data.get(parentIndex);

		if (rightchildIndex < this.data.size()) {
			T rvalue = this.data.get(rightchildIndex);
			result = result + "<=" + rvalue;
		} else {
			result = result + "<=END ";
		}

		System.out.println(result);

		if (leftchildIndex < this.data.size()) {
			this.display(leftchildIndex);
		}
		if (rightchildIndex < this.data.size()) {
			this.display(rightchildIndex);
		}
	}
}
