package medium;

public class M91_DecodeWays {
	public int numDecodings(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		return decode(s.toCharArray(), 0);
	}

	private int decode(char[] s, int index) {
		if (index >= s.length) {
			return 1;
		}
		int ways = 0;
		if (s[index] != '0') {
			ways += decode(s, index + 1);
		}
		if (check(s, index)) {
			ways += decode(s, index + 2);
		}
		return ways;
	}

	private boolean check(char[] s, int index) {
		if (index + 1 >= s.length) {
			return false;
		}
		int num = (s[index] - '0') * 10 + (s[index + 1] - '0');
		return num >= 10 && num <= 26;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
