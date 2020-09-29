package Lecture25;

public class HeapClient {

	public static void main(String[] args) throws Exception {

		// max heap
		HeapsImplementation<Integer> myheap = new HeapsImplementation<Integer>(false);

		myheap.add(35);
		myheap.add(30);
		myheap.add(25);
		myheap.add(20);
		myheap.add(15);
		myheap.add(10);
		myheap.add(5);
		myheap.add(8);
		myheap.add(12);

		myheap.display();

		System.out.println("\nafter adding element, still maintaining max heap property\n");

		myheap.add(45);
		myheap.display();

	}

}
