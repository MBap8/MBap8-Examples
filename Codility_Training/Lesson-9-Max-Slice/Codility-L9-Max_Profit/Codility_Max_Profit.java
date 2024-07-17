class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {23171, 21011, 21123, 21366, 21013, 21367};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] A){
		if (A.length < 2){
			return 0;
		}
		
		int minNum = A[0];
		int maxNum = A[0];
		int profit = 0;
		
		for (int i = 1; i < A.length; i++) {
			maxNum = Math.max(maxNum, A[i]);
			if (minNum > A[i]){
				maxNum = A[i];
				minNum = A[i];
			}
			profit = Math.max(profit, maxNum - minNum);
		}
		
		
		
		return profit;
	}
}

// Similar BallsInBuckets
// 11 mins O(N) 