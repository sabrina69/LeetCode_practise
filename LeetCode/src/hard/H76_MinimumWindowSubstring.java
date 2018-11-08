package hard;

public class H76_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0
				|| t.length() > s.length()) {
			return "";
		}
        String res = "";
        int match = 0;
        int[] tarr = new int[256];
        for (char c : t.toCharArray()){
            tarr[c]++;
        }
        int[] sarr = new int[256];
        int left = findNextIdx(0, s, tarr);
        if (left == s.length()) return "";
        int right = left;
        while (right < s.length()) {
            if (sarr[s.charAt(right)] < tarr[s.charAt(right)]){
                match++;
            }
            sarr[s.charAt(right)]++;
            while (left < s.length() && match == t.length()) {
                if (res.isEmpty() || res.length() > right-left+1) {
                    res = s.substring(left, right+1);
                }
                if (sarr[s.charAt(left)] <= tarr[s.charAt(left)]) {
                    match--;
                }
                sarr[s.charAt(left)]--;
                left = findNextIdx(left+1, s, tarr);                
            }
            right = findNextIdx(right+1, s, tarr);
        }
        return res;
    }
    
    private int findNextIdx(int start, String s, int[] tarr) {
        while (start < s.length()) {
            char c = s.charAt(start);
            if (tarr[c] != 0) return start;
            start++;
        }
        return start;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
