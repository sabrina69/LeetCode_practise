package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class M49_GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		if (strs == null || strs.length == 0) {
			return result;
		}
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String str : strs) {
			char[] word = str.toCharArray();
			Arrays.sort(word);
			String newWord = new String(word);
			if (map.containsKey(newWord)) {
				map.get(newWord).add(str);
			} else {
				List<String> item = new ArrayList<String>();
				item.add(str);
				map.put(newWord, item);
			}
		}
		result.addAll(map.values());
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
