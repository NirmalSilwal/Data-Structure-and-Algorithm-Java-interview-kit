package Lecture6;

public class InsertionSort {

	public static void main(String[] args){
		
		int[] arr = {30, 10, 60, -40, 20, 0, 1};
		display(arr);
		insertionSort(arr);
		System.out.println();
		display(arr);
	}
	
	public static void insertionSort(int[] arr){
		for (int pass = 0; pass < arr.length - 1; pass++){
			for (int j = pass + 1; j > 0 && arr[j] < arr[j-1]; j--){
				swap (arr, j, j-1);
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void display(int[] myarr){
		for (int i = 0; i < myarr.length; i++){
			System.out.print(myarr[i]+" ");
		}
	}
}
