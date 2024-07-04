import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] tester = {};
		System.out.println(sol.solution(tester));
	}
}

class Solution {
	public int solution(int[] A){
		Arrays.sort(A);
		int checker = A[0] + 1;
		for (int i = 1; i < A.length; i++){
			if (checker == A[i]){
				checker = A[i] + 1;
			} else {
				return checker;
			}
		}
		return checker;
	}
}

//13 minutes, Performance was good, correctness was not

class SolutionTwo {
	public int solution(int[] A){
		if(A.length == 0) return 1;
		
		int sumArr = 0;
		
		
		for(int i=0; i < A.length; i++){
			
			sumArr = sumArr + A[i];
			
		}
		
		
		int sumN = 0;
		
		for(int i=1; i <= A.length+1; i++){
			
			sumN = sumN + i;
			
		}
		
		
		if(sumArr == sumN)  return A.length;
		
		
		return  sumN - sumArr;
	}
}
// O(n)

// Solution below is a fix for my solution
class SolutionThree {
	public int solution(int[] A){
		if (A.length == 0){
			return 1;
		}
		Arrays.sort(A);
		int checker = 1;
		for (int i = 0; i < A.length; i++){
			if (checker == A[i]){
				checker++;
			} else {
				return checker;
			}
		}
		return checker;
	}
}
//O(N) or O(N * log(N)) 

// Main takeaway, my assumption is that the numbers in the array must be concec, but it does not explicity say that, so DO NOT ASSUME that.