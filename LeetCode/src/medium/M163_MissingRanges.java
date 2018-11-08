package medium;

import java.util.ArrayList;
import java.util.List;

public class M163_MissingRanges {
	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
		List<String> res = new ArrayList<>();
		// if (nums == null || nums.length == 0) return res;
		if (nums == null)
			return res;

		for (int num : nums) {
			if (num == Integer.MIN_VALUE) {
				lower = num + 1;
				continue;
			} else if (lower <= num - 1) { // not else
				res.add(lower == num - 1 ? String.valueOf(lower) : lower + "->" + (num - 1));
				// lower = num + 1;
			}
			if (num == Integer.MAX_VALUE) { // not else
				return res;
			}
			lower = num + 1;
		}
		if (lower <= upper) {
			res.add(lower == upper ? String.valueOf(lower) : (lower) + "->" + upper);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
