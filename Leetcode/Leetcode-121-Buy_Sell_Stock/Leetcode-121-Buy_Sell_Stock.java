class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] prices = {7,1,5,3,6,4};
		int result = sol.maxProfit(prices);
		System.out.println(result);
	}
}


class Solution {
	public int maxProfit(int[] prices) {
		int minElement = prices[0];
		int maxDiff = 0;
		for (int i = 0; i < prices.length; i++) {
			int currentDiff = prices[i] - minElement;
			if (currentDiff > maxDiff){
				maxDiff = currentDiff;
			}
			if (prices[i] < minElement){
				minElement = prices[i];
			}
		}
		return maxDiff;
	}
}