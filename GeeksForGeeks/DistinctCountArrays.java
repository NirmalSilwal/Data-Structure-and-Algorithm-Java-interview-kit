package practice;

public class DistinctCountArrays {

	public static void main(String[] args) {
	    int arr[] = {10, 20, 20, 10, 30, 10}; 
	    System.out.println(distinctCount(arr));
	}

	public static int distinctCount(int[] arr) {
		int distinct = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					break;
			}
			if (i == j) distinct++;
		}
		
		return distinct;
	}
}
