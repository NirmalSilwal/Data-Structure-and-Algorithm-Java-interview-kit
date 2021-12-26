package Arrays;

public class FindMaxConsecutiveOnesRevise {

	public static int findMaxConsecutiveOnes(int[] nums) {

		int max = 0;
		int tempcount = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				tempcount++;
			} else {
				tempcount = 0;
			}
			max = Math.max(max, tempcount);
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
		System.out.println(findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
	}

}
