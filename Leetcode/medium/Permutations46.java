package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {

	public static List<List<Integer>> permute1(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		ArrayList<Integer> templist = new ArrayList<>();

		permute1(nums, templist, list);

		return list;
	}

	private static void permute1(int[] nums, List<Integer> temp, List<List<Integer>> list) {

		if (temp.size() == nums.length) {
			list.add(new ArrayList<>(temp));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (temp.contains(nums[i]))
				continue;
			temp.add(nums[i]);

			permute1(nums, temp, list);
			temp.remove(temp.size() - 1);
		}
	}

	// O(N!) Time - using visited mark
	public static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		boolean[] visited = new boolean[nums.length];

		backtrack(nums, visited, new ArrayList<Integer>(), result);

		return result;
	}

	private static void backtrack(int[] nums, boolean[] visited, ArrayList<Integer> permutations,
			List<List<Integer>> result) {

		if (permutations.size() == nums.length) {
			result.add(new ArrayList<>(permutations)); // deep-copy
			return;
		}

		for (int i = 0; i < nums.length; i++) {

			if (visited[i] == true)
				continue;

			permutations.add(nums[i]);
			visited[i] = true;

			backtrack(nums, visited, permutations, result);

			permutations.remove(permutations.size() - 1); // remove recently
															// visited
			visited[i] = false;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(permute(nums));
	}
}
