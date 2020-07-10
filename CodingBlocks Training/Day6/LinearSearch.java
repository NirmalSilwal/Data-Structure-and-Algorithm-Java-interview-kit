package Lecture6;

public class LinearSearch {

	public static void main(String[] args){
		
		int[] arr = {3, 6, 8, 1, 5, 10, 70};
		int data = 8;
		System.out.println(linSearch(arr, data));
		System.out.println(linSearch(arr, 0));

	}
	
	public static int linSearch(int[] arr, int item){
		for (int i=0; i<arr.length; i++){
			if (arr[i] == item){
				return i;
			}
		}
		return -1;
	}
}
