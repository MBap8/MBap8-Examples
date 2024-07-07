import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {2,1,1,2,3,1};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] A){
		HashSet<Integer> contains = new HashSet<Integer>();
		if (A.length == 0){
			return 0;
		} else if (A.length == 1){
			return 1;
		}
		for (int i = 0; i < A.length; i++){
			if (!contains.contains(A[i])){
				contains.add(A[i]);
			}
		}
		return contains.size();
	}
}

//O(N*log(N)) or O(N) 
//11 minutes