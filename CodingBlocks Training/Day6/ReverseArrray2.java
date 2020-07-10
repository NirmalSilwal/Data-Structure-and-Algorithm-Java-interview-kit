package Lecture6;

public class ReverseArrray2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("original array");
		display(array);

		int front = 0;
		int back = array.length - 1;

		while (front <= back) {
			int temp = array[front];
			array[front] = array[back];
			array[back] = temp;

			front++;
			back--;
		}
		
		System.out.println("\nreversed array");
		display(array);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
