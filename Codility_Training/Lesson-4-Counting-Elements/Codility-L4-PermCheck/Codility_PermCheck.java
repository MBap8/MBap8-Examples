import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test1 = {4,1,3,2};
		int[] test2 = {4,1,3};
		System.out.println(sol.solution(test1));
		System.out.println(sol.solution(test2));
	}
}

class Solution {
	public int solution(int[] A){
		int maxNum = 0;
		int aTotalCalc = 0;
		
		for (int i = 0; i < A.length; i++){
			aTotalCalc += A[i];
			maxNum = Math.max(maxNum, A[i]);
		}
		
		int realCal = 0;
		for (int i = 1; i <= maxNum; i++){
			realCal += i;
		}
		
		if (realCal == aTotalCalc){
			return 1;
		} else {
			return 0;
		}
	}
	
	//17 mins
	// Partial solution, too long, sum conditions missed
	
	// Stack overflow solution similar to what I was trying earlier
	// O(N) or O(N * log(N)) 
	public int solutionTwo(int[] A){
		int[] freq = new int[A.length+1];
		for(int i=0; i<A.length; i++) {
			if(A[i]>A.length) {
				return 0;
			} 
			if(freq[A[i]]>0){
				return 0;
			} 
			freq[A[i]]++;
		}
		for(int i=1; i<freq.length; i++) {
			if(freq[i]==0) {
				return 0;
			}
		}
		return 1;
	}
}


