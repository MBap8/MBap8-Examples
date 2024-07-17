class Untitled {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(3, 3));
	}
}

class Solution {
	public String solution(int A, int B){
		StringBuilder sb = new StringBuilder();
		int countA = 0;
		int countB = 0;
		
		int liveCountA = 0;
		int liveCountB = 0;
		for (int i = 0; i < A + B; i++){
			if (A > B){
				if (liveCountA < 2){
					liveCountA++;
					if (countA < A){
						sb.append('a');
					} else {
						i--;
					}
					countA++;
				} else {
					liveCountA = 0;
					if (countB < B){
						sb.append("b");
					} else {
						i--;
					}
					countB++;
				}
			} else if (B > A) {
				if (liveCountB < 2){
					liveCountB++;
					if (countB < B){
						sb.append("b");
					} else {
						i--;
					}
					countB++;
				} else {
					liveCountB = 0;
					if (countA < A){
						sb.append('a');
					} else {
						i--;
					}
					countA++;
				}
			} else {
				if (liveCountB < 2){
					liveCountB++;
					if (countB < B){
						sb.append("b");
					} else {
						i--;
					}
					countB++;
				} else if (liveCountA < 2) {
					liveCountA++;
					if (countA < A){
						sb.append('a');
					} else {
						i--;
					}
					countA++;
				} else {
					liveCountB = 0;
					liveCountA = 0;
					i--;
				}
			}
		}
		
		return sb.toString();
	} 	
}

// CreateDiverseWord