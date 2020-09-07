package Lecture17;

public class DynamicQueue extends QueueUsingArray {

	public DynamicQueue(int capacity) {
		super(capacity);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] arr = new int[2 * this.data.length];
			for (int index = 0; index < this.data.length; index++) {
				int position = (this.front + index) % this.data.length;
				arr[index] = this.data[position];
			}
			this.data = arr;
			this.front = 0;
		}
		super.enqueue(item);
	}
}
