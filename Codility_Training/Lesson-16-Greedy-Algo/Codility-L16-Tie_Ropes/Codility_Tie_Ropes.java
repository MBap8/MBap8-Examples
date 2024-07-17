class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {1,2,3,4,1,1,3};
		System.out.println(sol.solution(4, test));
	}
}

class Solution {
	public int solution(int K, int[] A){
		int numRopes = 0;
		int storeCount = 0;
		for (int i = 0; i < A.length; i++){
			if (storeCount >= K){
				numRopes++;
				storeCount = A[i];
			} else {
				storeCount+= A[i];
			}
			if (i + 1 == A.length){
				if (storeCount >= K){
					numRopes++;
				}
			}
		}
		return numRopes;
	}
}

// 10 minutes O(N) 