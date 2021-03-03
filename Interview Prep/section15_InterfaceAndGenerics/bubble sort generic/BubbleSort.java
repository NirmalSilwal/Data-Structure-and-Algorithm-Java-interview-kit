package section15_InterfaceAndGenerics;

public class BubbleSort {

	public static void main(String[] args) {

		Car[] cars = new Car[5];

		cars[0] = new Car(58, 100, "red");
		cars[1] = new Car(45, 20, "blue");
		cars[2] = new Car(70, 3000, "black");
		cars[3] = new Car(90, 60, "green");
		cars[4] = new Car(80, 3600, "yellow");

		display(cars);

		bubbleSort(cars);
		
		display(cars);
	}

	public static <T> void display(T[] arr) {
		for (T val : arr)
			System.out.println(val + " ");
		System.out.println();
	}

	// O(N^2) Time | O(1) Space
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for (int pass = 0; pass < arr.length - 1; pass++) {

			for (int j = 0; j < arr.length - 1 - pass; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}


/* output:
on the basis of Speed

Speed: 45 Price: 200 Color: blue 
Speed: 58 Price: 100 Color: red 
Speed: 70 Price: 300 Color: black 
Speed: 80 Price: 300 Color: black 
Speed: 90 Price: 200 Color: blue 

on the basis of Price

Speed: 80 Price: 3600 Color: yellow 
Speed: 70 Price: 3000 Color: black 
Speed: 58 Price: 100 Color: red 
Speed: 90 Price: 60 Color: green 
Speed: 45 Price: 20 Color: blue 

on the basis of Color

Speed: 70 Price: 300 Color: black 
Speed: 45 Price: 200 Color: blue 
Speed: 90 Price: 200 Color: green 
Speed: 58 Price: 100 Color: red 
Speed: 80 Price: 300 Color: yellow 

*/