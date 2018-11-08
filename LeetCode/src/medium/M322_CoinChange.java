package medium;

public class M322_CoinChange {
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];

		for (int i = 1; i <= amount; i++) {
			dp[i] = 0x7ffffffe;
		}
		for (int i = 1; i <= amount; i++) {
			// dp[i] = Integer.MAX_VALUE;
			for (int j = 0; j < coins.length; j++) {
				// dp[i] = Integer.MAX_VALUE;
				// if (i >= coins[j] && dp[i-coins[j]] != Integer.MAX_VALUE) {
				if (i >= coins[j]) {
					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
				}
			}
		}
		return dp[amount] == 0x7ffffffe ? -1 : dp[amount];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
