package LeetcodeDaily.April2022;

import java.util.Arrays;

public class Day1ReverseString344 {

	public static void reverseString(char[] s) {
		
		int start = 0, end = s.length - 1;
		while (start < end) {
			swap(s, start, end);
			start++;
			end--;
		}
	}
	
	private static void swap(char[] arr, int start, int end) {
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String[] args) {
		char[] charr = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(Arrays.toString(charr));
		reverseString(charr);
		System.out.println(Arrays.toString(charr));
	}
}
