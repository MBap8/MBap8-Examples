import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {3,4,4,6,1,4,4};
		int[] res = sol.solution(5, test);
		for (int i : res){
			System.out.println(res);
		}
	}
}


class Solution {
	public int[] solution(int N, int[] A){
//		int maxCount = 0;
//		int[] counters = new int[N];
//		Arrays.fill(counters,0);
//		boolean arrayFill = false;
//		for (int i = 0; i < A.length; i++){
//			if (A[i] <= N){
//				arrayFill = false;
//				counters[A[i] - 1]++;
//				if (counters[A[i] - 1] > maxCount){
//					maxCount = counters[A[i] - 1];
//				}
//			} else if (A[i] > N){
//				if (!arrayFill){
//					Arrays.fill(counters, maxCount);
//				}
//				arrayFill = true;
//			}
//		}
//		
//		return counters;
		int maxCount = 0;
		int lastMax = 0;
		int[] counters = new int[N];
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N) {
				int pos = A[i] - 1;
				if (counters[pos] < lastMax) {
					counters[pos] = lastMax;
				}
				counters[pos]++;
				if (counters[pos] > maxCount) {
					maxCount = counters[pos];
				}
			} else if (A[i] == N + 1) {
				lastMax = maxCount;
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (counters[i] < lastMax) {
				counters[i] = lastMax;
			}
		}
		
		return counters;
	}
}

// 12 minutes

// Correctness is correct, performance failed 2 cases
// Array fill boolean fixed 1 test, still failing one performance 


