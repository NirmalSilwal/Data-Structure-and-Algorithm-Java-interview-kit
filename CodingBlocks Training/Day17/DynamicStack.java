package Lecture17;

public class DynamicStack extends stackUsingArray {

	public DynamicStack(int capacity) {
		super(capacity);
	}

	// overrides Lecture17.stackUsingArray.push
	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] arr = new int[2 * this.data.length];
			for (int index = 0; index < this.data.length; index++) {
				arr[index] = this.data[index];
			}
			this.data = arr;
		}
		super.push(item);
	}
}
