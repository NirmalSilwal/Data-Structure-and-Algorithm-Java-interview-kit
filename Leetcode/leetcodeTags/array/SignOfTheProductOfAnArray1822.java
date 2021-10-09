package leetcodeTags.array;

import java.math.BigInteger;

public class SignOfTheProductOfAnArray1822 {

	public static int arraySign(int[] nums) {

		BigInteger product = BigInteger.ONE;

		for (int num : nums) {
			product = product.multiply(BigInteger.valueOf(num));
		}

		return signFunc(product);
	}

	private static int signFunc(BigInteger product) {

		int res = product.compareTo(BigInteger.ZERO);

		if (res == 0)
			return 0;
		else if (res < 0)
			return -1;
		else
			return 1;
	}

	public static int arraySign2(int[] nums) {
		int negativeCount = 0;
		for (int num : nums) {
			if (num == 0)
				return 0;
			if (num < 0)
				negativeCount++;
		}
		return negativeCount % 2 == 0 ? 1 : -1;
	}

	public static void main(String[] args) {
		System.out.println(arraySign2(new int[] { -1, -2, -3, -4, 3, 2, 1 }));
		System.out.println(arraySign2(new int[] { 1, 5, 0, 2, -3 }));
		System.out.println(arraySign2(new int[] { -1, 1, -1, 1, -1 }));

		int[] arr = { 41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82,
				70, 15, -41 };
		System.out.println(arraySign2(arr));

		int[] arr2 = { 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 };
		System.out.println(arraySign2(arr2));
	}
}
