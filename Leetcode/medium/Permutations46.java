package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		ArrayList<Integer> templist = new ArrayList<>();
		
		permute(nums, templist, list);
		
		return list;
	}

	private static void permute(int[] nums, List<Integer> temp, List<List<Integer>> list) {
		
		if (temp.size() == nums.length) {
			list.add(new ArrayList<>(temp));
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (temp.contains(nums[i]))
				continue;
			temp.add(nums[i]);
			
			permute(nums, temp, list);
			
			temp.remove(temp.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(permute(nums));
	}
}
