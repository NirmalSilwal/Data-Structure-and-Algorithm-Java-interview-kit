package Lecture6;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int j = 0;
		int ans[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			ans[j] = arr[i];
			j++;
		}
		System.out.println("original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("reversed array: ");
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
