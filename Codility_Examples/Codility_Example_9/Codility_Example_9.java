import java.util.*;
class Untitled {
	public static void main(String[] args) {
		SumCombinations sum = new SumCombinations();
		System.out.println(sum.countSumCombinations(7));
	}
}

// ^><> game and return the number of sums possible to make a number N

class Solution {
	
}

class SumCombinations {
	public static int countSumCombinations(int N) {
		int[] dp = new int[N + 1];
		dp[0] = 1;
		
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				dp[j] += dp[j - i];
			}
		}
		
		return dp[N];
	}
}