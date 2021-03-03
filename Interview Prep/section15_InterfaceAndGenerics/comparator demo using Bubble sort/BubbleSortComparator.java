package section15_InterfaceAndGenerics;

import java.util.Comparator;

public class BubbleSortComparator {

	public static void main(String[] args) {

		Car2[] cars = new Car2[5];

		cars[0] = new Car2(58, 100, "red");
		cars[1] = new Car2(45, 20, "blue");
		cars[2] = new Car2(70, 3000, "black");
		cars[3] = new Car2(90, 60, "green");
		cars[4] = new Car2(80, 3600, "yellow");

		bubbleSort(cars, new carSpeedComparator());
		display(cars);

		bubbleSort(cars, new carPriceComparator());
		display(cars);

		bubbleSort(cars, new carColorComparator());
		display(cars);
	}

	public static <T> void display(T[] arr) {
		for (T val : arr)
			System.out.println(val + " ");
		System.out.println();
	}

	// O(N^2) Time | O(1) Space
	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
		for (int pass = 0; pass < arr.length - 1; pass++) {

			for (int j = 0; j < arr.length - 1 - pass; j++) {

				if (comparator.compare(arr[j], arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}

/* output:

Speed: 45 Price: 20 Color: blue 
Speed: 58 Price: 100 Color: red 
Speed: 70 Price: 3000 Color: black 
Speed: 80 Price: 3600 Color: yellow 
Speed: 90 Price: 60 Color: green 

Speed: 80 Price: 3600 Color: yellow 
Speed: 70 Price: 3000 Color: black 
Speed: 58 Price: 100 Color: red 
Speed: 90 Price: 60 Color: green 
Speed: 45 Price: 20 Color: blue 

Speed: 70 Price: 3000 Color: black 
Speed: 45 Price: 20 Color: blue 
Speed: 90 Price: 60 Color: green 
Speed: 58 Price: 100 Color: red 
Speed: 80 Price: 3600 Color: yellow 

*/