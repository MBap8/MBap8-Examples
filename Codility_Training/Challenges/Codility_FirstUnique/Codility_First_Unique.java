import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {4,10,5,4,2,10};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] A){
		if (A.length == 1){
			return A[0];
		}
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		
		for (int i = 0; i < A.length; i++){
			if(!ls.contains(A[i])){
				ls.add(A[i]);
			} else {
				ls.remove(A[i]);
			}
		}
		
		if (ls.isEmpty()){
			return -1;
		} else {
//			return (int)ls.toArray()[0]; chatgpt below
			return ls.iterator().next();
		}
	}
}

// O(N * log(N)) , failed 1 correctness test
