package seanPrashadList;

/*
* Input: nums = [3,0,1]
* Output: 2
* Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
* 2 is the missing number in the range since it does not appear in nums.
*/

public class MissingNumber268 {

	// approach 1
	public static int missingNumber(int[] nums) {

		int[] temp = new int[nums.length + 1];

		for (int n : nums) {
			temp[n] = 1;
		}

		int missing = -1;
		for (int i = 0; i <= temp.length; i++) {
			if (temp[i] == 0) {
				missing = i;
				break;
			}
		}

		return missing;

	}

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {  0, 1 }));
	}
}
