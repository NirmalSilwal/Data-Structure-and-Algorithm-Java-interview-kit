package LeetcodeBadge.ProgrammingSkills.Skills1.Day3;

import java.util.Arrays;

public class LargestPerimeterTriangle976 {

	public static int largestPerimeter(int[] nums) {

		Arrays.sort(nums);

		for (int i = nums.length - 3; i >= 0; i--) {

			if (nums[i] + nums[i + 1] > nums[i + 2])

				return nums[i] + nums[i + 1] + nums[i + 2];
		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(largestPerimeter(new int[] { 1, 2, 1 }));
		System.out.println(largestPerimeter(new int[] { 1, 2, 2 }));
	}
}
