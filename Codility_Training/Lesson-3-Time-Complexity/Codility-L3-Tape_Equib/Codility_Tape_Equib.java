class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {3,1,2,4,3};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] A){
		int totalCal = 0;
		for (int i = 1; i < A.length; i++){
			totalCal += A[i];
		}
		int minDistance = (int) Math.abs(A[0] - totalCal);
		if (A.length == 2){
			return minDistance;
		}
		int newDistanceCompare = A[0];
		for (int i = 1; i < A.length - 1; i++){
			newDistanceCompare += A[i];
			totalCal -= A[i];
			int newDistance = Math.abs(newDistanceCompare - totalCal);
			minDistance = Math.min(minDistance, newDistance);
		}
		
		
		
		return minDistance;
		
	}
}


// O(N) 
// 21 minutes