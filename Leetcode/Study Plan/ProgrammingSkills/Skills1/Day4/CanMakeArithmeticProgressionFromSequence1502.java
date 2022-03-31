package LeetcodeBadge.ProgrammingSkills.Skills1.Day4;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence1502 {

	public static boolean canMakeArithmeticProgression(int[] arr) {
		if (arr.length < 2)
			return false;

		Arrays.sort(arr);
		int diff = arr[0] - arr[1];
		for (int i = 1; i < arr.length - 1; i++) {
			int curr = arr[i];
			int next = arr[i + 1];

			int currdiff = curr - next;

			if (currdiff == diff)
				continue;
			else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(canMakeArithmeticProgression(new int[] { 3, 5, 1 }));
		System.out.println(canMakeArithmeticProgression(new int[] { 1, 2, 4 }));
	}
}
