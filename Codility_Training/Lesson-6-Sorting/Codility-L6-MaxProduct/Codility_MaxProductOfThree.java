import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {-3,1,2,-2,5,6,6};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] A){
		Arrays.sort(A);
		int max_1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
		int max_2 = A[0] * A[1] * A[A.length-1];
		return Math.max(max_1, max_2);
	}
}