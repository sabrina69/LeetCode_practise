package medium;

public class M5_LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return s;
		}
		boolean[][] dp = new boolean[s.length()][s.length()];
		int max = 0;
		String res = "";
		char[] arr = s.toCharArray();
		for (int j = 0; j < s.length(); j++) {
			for (int i = 0; i <= j; i++) {
				dp[i][j] = arr[i] == arr[j] && ((j - i <= 2) || dp[i + 1][j - 1]);
				if (dp[i][j]) {
					if (j - i + 1 > max) {
						max = j - i + 1;
						res = s.substring(i, j + 1);
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
