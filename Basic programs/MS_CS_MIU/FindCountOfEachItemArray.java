package com.maharishiuniversity.admit.practiceTest;

import java.util.Arrays;

public class FindCountOfEachItemArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7};
		int[] arr2 = { 1, 2, 3, 4, 2, 4, 7 };

		int[] ans = new int[arr.length];
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j])
					count++;
			}
			ans[index] = count;
			index++;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}

/* output:
[1, 2, 1, 2, 1]
*/