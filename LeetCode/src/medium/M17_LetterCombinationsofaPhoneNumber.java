package medium;

import java.util.ArrayList;
import java.util.List;

public class M17_LetterCombinationsofaPhoneNumber {
	public List<String> letterCombinations(String digits) {
		String[] letters = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		List<String> result = new ArrayList<String>();

		LCPN(result, digits, letters, 0, new String());
		return result;
	}

	public void LCPN(List<String> result, String digits, String[] letters, int index, String items) {
		if (index == digits.length()) {
			if (digits.length() == 0) {
				return;
			}
			result.add(items);
			return;
		}

		int num = Integer.valueOf(String.valueOf(digits.charAt(index)));

		for (int i = 0; i < letters[num].length(); i++) {
			// String unselect = new String(items);
			// LCPN(result, digits, letters, index+1, unselect);

			String select = new String(items);
			select += letters[num].charAt(i);
			LCPN(result, digits, letters, index + 1, select);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
