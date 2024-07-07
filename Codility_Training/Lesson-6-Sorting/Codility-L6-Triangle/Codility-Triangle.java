import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
	}
}

class Solution {
	public int solution(int[] A){
		if (A.length < 3){
			return 0;
		}
		Arrays.sort(A);
		
		for (int i = 2; i < A.length; i++){
			if ((long)A[i - 2] + (long)A[i - 1] > (long)A[i]){
				return 1;
			}
		}
		return 0;
	}
}

// Similar to MaxPerimeterTriangle