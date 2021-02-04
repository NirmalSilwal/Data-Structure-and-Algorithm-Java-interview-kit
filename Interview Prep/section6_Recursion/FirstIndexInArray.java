package section6_Recursion;

public class FirstIndexInArray {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 1, 8, 3, 4 };
		int startIndex = 0;

		System.out.println(firstIndexRecursive(arr, startIndex, 8));
		System.out.println(firstIndexRecursive(arr, startIndex, 1));
		System.out.println(firstIndexRecursive(arr, startIndex, 10));
		System.out.println(firstIndexRecursive(arr, startIndex, 4));

	}

	static int firstIndexRecursive(int[] arr, int si, int data) {

		if (si == arr.length)
			return -1;

		if (arr[si] == data)
			return si;
		int index = firstIndexRecursive(arr, si + 1, data);

		return index;
	}
}
