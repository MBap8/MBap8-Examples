import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
		System.out.println(sol.solution(test));
	}
}

class Solution {
	public int solution(int[] A){
		ArrayList<Integer> indexFlags = new ArrayList<Integer>();
		if (A.length < 3){
			return 0;
		}
		
		int flagCount = 0;
		
		for (int i = 1; i < A.length; i++){
			Integer before = A[i - 1];
			Integer after = 0;
			if (i + 1 < A.length){
				after = A[i + 1];
			} else {
				after = null;
			}
			if (after != null && (A[i] > before && A[i] > after)){
				indexFlags.add(i);
				flagCount++;
			}
		}
		if (flagCount == 1){
			return 1;
		} else if (flagCount == 0){
			return 0;
		}
		
		int flags = 1;
		int lastFlag = indexFlags.get(0);
		
		for (int i = 1; i < indexFlags.size(); i++){
			int curr = indexFlags.get(i);
			int prev = lastFlag;
			if (Math.abs(curr - prev) >= flagCount){
				flags++;
				lastFlag = indexFlags.get(i);
			}
			
		}
		return flags;
	}
	
	public int sol(int[] A){
		ArrayList<Integer> peaks = new ArrayList<Integer>();
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
				peaks.add(i);
			}
		}
		if (peaks.size() <= 1) {
			return peaks.size();
		}
		
		int maxFlags = (int) Math.ceil(Math.sqrt(peaks.get(peaks.size() - 1) - peaks.get(0)));
		
		for (int flags = maxFlags; flags > 1; flags--) {
			
			int startFlagIndex = 0;
			int endFlagIndex = peaks.size() - 1;
			
			int startFlag = peaks.get(startFlagIndex);
			int endFlag = peaks.get(endFlagIndex);
			
			int flagsPlaced = 2;
			
			while (startFlagIndex < endFlagIndex) {
				startFlagIndex++;
				endFlagIndex--;
				
				if (peaks.get(startFlagIndex) >= startFlag + flags) {
					if (peaks.get(startFlagIndex) <= endFlag - flags) {
						flagsPlaced++;
						startFlag = peaks.get(startFlagIndex);
					}
				}
				
				if (peaks.get(endFlagIndex) >= startFlag + flags) {
					if (peaks.get(endFlagIndex) <= endFlag - flags) {
						flagsPlaced++;
						endFlag = peaks.get(endFlagIndex);
					}
				}
				if (flagsPlaced == flags) {
					return flags;
				}
			}
		}
		
		return 0;
	}
}

// Bad solution, 66% correctness, failed performance
