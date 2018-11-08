package hard;

import java.util.Iterator;
import java.util.TreeSet;

public class H128_LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {

		// Base case: if nums[] has length lesser than 2
		if (nums.length < 2)
			return nums.length;

		// General case
		// TreeSet to store integers
		TreeSet<Integer> set = new TreeSet<Integer>();

		// add numbers[] to set
		for (int i : nums)
			set.add(i);

		int prev = -1;
		int count = 1;
		int max = 1;
		boolean first = true;

		Iterator it = set.iterator();

		// while iterating through the list
		while (it.hasNext()) {
			int key = (int) it.next();

			// check to see if it is the first element
			if (!first) {
				if (prev == key - 1)
					count++;
				else
					count = 1;
			} else
				first = false;

			// if count is greater than max, update max
			if (count > max)
				max = count;
			prev = key;
		}

		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
