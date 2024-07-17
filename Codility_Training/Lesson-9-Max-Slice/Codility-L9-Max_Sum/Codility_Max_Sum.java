class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {3,2,-6,4,0};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] A){
		if (A.length == 1){
			return A[0];
		} 
		
		int sum = A[0];
		int maxSum = sum;
		
		for (int i = 1; i < A.length; i++){
			sum += A[i];
			maxSum = Math.max(maxSum, sum);
			if (sum < 0 && maxSum > 0){
				sum = 0;
			}
		}
		
		
		
		return maxSum;
		
	}
}

// DigitSumReplacement similar to
// not 100 correct, neg results missing due to implementation 

//correct implementation from github
class SolutionTwo {
	public int solution(int[] A){
		
		// initial setting A[0]
		int maxEndingPrevious = A[0];
		int maxEndingHere = A[0];
		int maxSoFar = A[0];
		
		// note: for i=0, it will return A[0] (also for "one element" cases)  
		
		for(int i = 1; i < A.length; i++){
			maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i]); // <--- key point~!!
			maxEndingPrevious = maxEndingHere;
			maxSoFar = Math.max(maxSoFar, maxEndingHere); // update the max (be careful)
		}
		
		return maxSoFar; // can be used for "all negative" cases 
	}
}
