package section17_Heap;

public class HeapClient {

	public static void main(String[] args) throws Exception {

		Heap heap = new Heap();

		heap.add(10);
		// heap.display();

		heap.add(20);
		// heap.display();

		heap.add(30);
		// heap.display();

		heap.add(40);
		// heap.display();

		heap.add(50);
		heap.display();
		try {
			System.out.println(heap.remove());
		} catch (Exception e) {
			e.printStackTrace();
		}
		heap.display();
		try {
			System.out.println(heap.remove());
		} catch (Exception e) {
			e.printStackTrace();
		}
		heap.display();

		try {
			System.out.println(heap.remove());
		} catch (Exception e) {
			e.printStackTrace();
		}

		heap.display();
		// System.out.println(heap.remove());

		// heap.add(5);
		// heap.display();
		//
		// heap.add(3);
		// heap.display();
	}

}
