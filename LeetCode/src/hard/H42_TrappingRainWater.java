package hard;

public class H42_TrappingRainWater {

	public int trap(int[] height) {
		int lo = 0;
		int hi = height.length - 1;
		int res = 0;
		int maxlo = 0;
		int maxhi = 0;

		while (lo < hi) {
			if (height[lo] < height[hi]) {
				if (height[lo] >= maxlo)
					maxlo = height[lo];
				else
					res += (maxlo - height[lo]);
				lo++;
			} else {
				if (height[hi] >= maxhi)
					maxhi = height[hi];
				else
					res += (maxhi - height[hi]);
				hi--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
