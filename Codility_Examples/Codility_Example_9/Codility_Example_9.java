import java.util.*;
class Untitled {
	public static void main(String[] args) {
		SumCombinations sum = new SumCombinations();
		System.out.println(sum.countSumCombinations(7));
	}
}


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

public class SumWays {
	public static int countWays(int N) {
		if (N <= 0) {
			return 0;
		}
		
		// Initialize the dp array
		int[] dp = new int[N + 1];
		
		// There's one way to make sum 0, which is using an empty set of numbers
		dp[0] = 1;
		
		// Build the dp array
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] += dp[i - j];
			}
		}
		
		// The answer is the number of ways to sum up to N
		return dp[N];
	}
	
	public static void main(String[] args) {
		int N = 5;  // Example input
		System.out.println("Number of ways to sum up to " + N + ": " + countWays(N));
	}
}


public class Partition {
	
	// Method to calculate the number of partitions of n allowing zeros
	public static int partition(int n) {
		// Create a 2D array to store the number of partitions for each number up to n
		int[][] p = new int[n + 1][n + 1];
		
		// Base case: there is one way to partition 0 (the empty partition)
		p[0][0] = 1;
		
		// Calculate partitions for each number from 1 to n
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				p[i][j] = p[i - 1][j];
				if (j >= i) {
					p[i][j] += p[i][j - i];
				}
			}
		}
		
		// The number of partitions of n is stored in p[n][n]
		return p[n][n];
	}
	
	public static void main(String[] args) {
		int n = 7; // Change this value to test different values of n
		System.out.println("Number of partitions of " + n + " is: " + partition(n));
	}
}
