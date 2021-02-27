package codesignal;

public class Test2 {

	public static void main(String[] args) {

		int[] numbers = { -1, 18, 3, 1, 5 };
		System.out.println(pairSummingToFullSquare(numbers)); //4 
	}

	// finds total possible pair in numbers array, that is exact square
	public static int pairSummingToFullSquare(int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (isSquare(numbers[i] + numbers[j]))
					count++;
			}
		}

		return count;
	}

	private static boolean isSquare(int num) {

		for (int i = 0; i * i <= num; i++) {
			if (i * i == num)
				return true;
		}

		return false;
	}
}
