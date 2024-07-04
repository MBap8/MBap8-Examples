import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {1};
		System.out.println(sol.solution(5, test));
	}
}

class Solution {
	public int solution(int X, int[] A){
		int time = -1;
		int[] arr = new int[X + 1];
		Arrays.fill(arr, 0);
		for (int i = 0; i < A.length; i++){
			if (A[i] <= X){
				if (arr[A[i]] == 0){
					arr[A[i]]++;
					arr[0]++;
				}
			}
			
			if (arr[0] == X){
				return i;
			}
		}
		
		return time;
	}
}

// 18 minutes
// O(N) 