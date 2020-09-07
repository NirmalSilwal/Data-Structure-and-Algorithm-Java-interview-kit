package Lecture17;

public class QueueUsingStackEnqueueEfficient {

	private DynamicStack primaryStack;
	private DynamicStack secStack;

	public QueueUsingStackEnqueueEfficient(int capacity) {
		this.primaryStack = new DynamicStack(capacity);
		this.secStack = new DynamicStack(capacity);
	}

	// O(1) time
	public int size() {
		return this.primaryStack.size();
	}

	// O(1) time
	public boolean isEmpty() {
		return this.primaryStack.size() == 0;
	}

	// enqueue efficient - O(1) time
	public void enqueue(int item) throws Exception {
		this.primaryStack.push(item);
	}

	// O(n) time, as we'r popping n elements
	public int dequeue() throws Exception {
		while (this.primaryStack.size() != 1) {
			this.secStack.push(this.primaryStack.pop());
		}

		int answer = this.primaryStack.pop();

		while (!this.secStack.isEmpty()) {
			this.primaryStack.push(this.secStack.pop());
		}

		return answer;
	}
	
	// O(n) time, as we'r popping n elements
	public int front() throws Exception{
		while (this.primaryStack.size() != 1){
			this.secStack.push(this.primaryStack.pop());
		}
		
		int answer = this.primaryStack.top();
		
		while (!this.secStack.isEmpty()){
			this.primaryStack.push(this.secStack.pop());
		}
		
		return answer;
	}
	
	// O(1) time
	public void display() throws Exception {
		reverseStack(primaryStack, secStack, 0);
		this.primaryStack.display();
		reverseStack(primaryStack, secStack, 0);
	}

	public void reverseStack(DynamicStack s1, DynamicStack s2, int id) throws Exception {
		if (s1.isEmpty()) {
			return;
		}
		int item = s1.pop();
		reverseStack(s1, s2, id + 1);
		
		s2.push(item);
		
		if (id == 0){
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
	}
}
