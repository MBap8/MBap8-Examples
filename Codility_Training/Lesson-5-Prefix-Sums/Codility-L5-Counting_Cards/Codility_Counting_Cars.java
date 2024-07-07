import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] cars = {0,1,0,1,1};
		System.out.println(sol.solution(cars));
	}
}

class Solution {
	public int solution(int[] A){
		int[] freq = new int[2];
		Arrays.fill(freq,0);
		long pairs = 0;
		for (int i = 0; i < A.length; i++){
			if (A[i] == 0){
				freq[0]++;
			} else {
				freq[1]++;
				pairs+=freq[0];
			}
		}
		
		if (pairs > 1000000000) return -1;
		
		return (int)pairs;
	}
}

// Initial run missed one test due to performance of returning a large number instead of -1, this was due to using an int instead of long
//12 minutes
// o(n)
