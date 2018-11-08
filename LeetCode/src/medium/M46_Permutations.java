package medium;

import java.util.ArrayList;
import java.util.List;

public class M46_Permutations {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		permute(results, nums, 0);
		return results;
	}

	private void permute(List<List<Integer>> results, int[] nums, int index) {
		List<Integer> result = new ArrayList<Integer>();
		if (index == nums.length) {
			for (int i = 0; i < nums.length; i++) {
				result.add(nums[i]);
			}
			results.add(result);
			return;
		}
		for (int i = index; i < nums.length; i++) {
			swap(nums, index, i);
			permute(results, nums, index + 1);
			swap(nums, i, index);
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
