package Lecture5;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr;
		// System.out.println(arr); // The local variable arr may not have been initialized

		arr = new int[5];
		System.out.println(arr[0]); // output: 0
		System.out.println(arr[1]); // output: 0
		System.out.println("array length: "+ arr.length); // output: 5
		// System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

		System.out.println("inside main, arr value: " + arr); // output: prints address of arr
													

		demo(arr);
		demo2(arr);
		System.out.println("\ninside main arr[0] after demo2: " + arr[0]);
		demo3(arr);
		System.out.println("\ninside main arr[0] after demo3: " + arr[0]);
		System.out.println("inside main arr[1] after demo3: " + arr[1]);
		display(arr);
	}

	public static void demo(int[] myarr) {
		System.out.println("\ninside demo: " + myarr);
	}

	public static void demo2(int[] myarr) {
		myarr = new int[5];
		System.out.println("\ninside demo2: " + myarr);
		myarr[0] = 99;
		System.out.println("inside demo2 myarr[0]: " + myarr[0]);
	}
	
	public static void demo3(int[] arr) {
		System.out.println("\ninside demo3: " + arr);
		arr[0] = 99;
		arr[1] = 100;
		System.out.println("inside demo3 arr[0]: " + arr[0]);
		System.out.println("inside demo3 arr[1]: " + arr[1]);
		display(arr);
	}
	
	public static void display(int[] arr){
		for (int i=0; i<arr.length; i++){
			System.out.println("index "+i+": "+ arr[i]);
		}
	}
}
