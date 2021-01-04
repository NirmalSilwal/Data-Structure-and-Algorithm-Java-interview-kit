package com.maharishiuniversity.admit;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {

		System.out.println("original array is:");
		int[] arr = { 8, 5, 0, 10, 0, 20 };
		System.out.println(Arrays.toString(arr));
		
		// approach 1
		int[] arrCopy = arr.clone();
		
		System.out.println("\ncopied array using 1st approach is:");
		System.out.println(Arrays.toString(arrCopy));
		
		arrCopy[0]++;
		System.out.println("\nafter modifying copied array: ");
		System.out.println(Arrays.toString(arrCopy));
		System.out.println("original array after copying");
		System.out.println(Arrays.toString(arr));


		// approach 2
		int[] copy2 = new int[arr.length];
		System.arraycopy(arr, 0, copy2, 0, arr.length);
		
		System.out.println("\ncopied array using 2nd approach is:");
		System.out.println(Arrays.toString(copy2));
		
		copy2[0]++;
		System.out.println("\nafter modifying copied array: ");
		System.out.println(Arrays.toString(copy2));

		// approach 3
		int[] copy3 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy3[i] = arr[i];
		}
		
		System.out.println("\ncopied array using 3rd approach is:");
		System.out.println(Arrays.toString(copy3));
		
		copy3[0]++;
		System.out.println("\nafter modifying copied array: ");
		System.out.println(Arrays.toString(copy3));
		System.out.println("original array after copying");
		System.out.println(Arrays.toString(arr));

	}

}
