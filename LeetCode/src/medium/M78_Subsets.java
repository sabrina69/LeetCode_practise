package medium;

import java.util.ArrayList;
import java.util.List;

public class M78_Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		helper(result, new ArrayList<Integer>(), 0, nums);
		return result;
	}

	private void helper(List<List<Integer>> result, ArrayList<Integer> item, int index, int[] nums) {
		// if (index == nums.length) {
		result.add(new ArrayList<Integer>(item));
		// return;
		// }
		for (int i = index; i < nums.length; i++) {
			item.add(nums[i]);
			helper(result, item, i + 1, nums);
			item.remove(item.size() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
