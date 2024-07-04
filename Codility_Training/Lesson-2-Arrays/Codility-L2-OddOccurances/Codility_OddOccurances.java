import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int[] test = {9,3,9,3,9,7,9};
		System.out.println(sol.solution(test));
		
	}
}

class Solution {
	public int solution(int[] A){
		HashSet<Integer> store = new HashSet<>();
		for (int i = 0; i < A.length; i++){
			if (!store.contains(A[i])){
				store.add(A[i]);
			} else {
				store.remove(A[i]);
			}
		}
		
		return store.toArray(new Integer[1])[0];
	}
}


// ConsecutiveElementsDifferences
// 16 minutes